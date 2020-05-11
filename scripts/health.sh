#!/usr/bin/env bash

ABSPATH=$(readlink -f $0)
ABSPATH=$(dirname $ABSPATH)
source ${ABSDIR}/profile.sh
source ${ABSDIR}/switch.sh

IDLE_PORT=$(find_idle_port)

echo "> Healt Check Start !!"
echo "> IDLE_PORT : $IDLE_PORT"
echo "> curl -s http://localhost:$IDLE_PORT/profile"

sleep 10

for RETRY_COUNT in {1..10}
do
	RESPONSE=$(curl -s http://localhost:${IDLE_PORT}/profile)
	UP_COUNT=$(echo ${RESPONSE} | grep "real" | wc -l)
	
	if [ ${UP_COUNT} -ge 1 ]
	then
		echo "> Health Check Success !!"
		switch_proxy
		break
	else
		echo "> Health Check Failure(No Response or NO Running)"
		echo "> Health Check: ${RESPONSE}"
	fi
	
	if [ ${RETRY_COUNT} -eq 10 ]
	then
		echo "> Health Check 실패"
		echo "> nginx에 연결하지 않고 배포를 종료합니다."
		exit 1
	fi
	
	echo "> Health Check 연결 실패. 재시도..."
			
done