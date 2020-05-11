#!/usr/bin/env bash

ABSPATH=$(readlink -f $0)
ABSPATH=$(dirname $ABSPATH)
source ${ABSDIR}profile.sh

function switch_proxy() {
	IDLE_PORT=$(find_idle_port)
	
	echo "> 전환할 포트: $IDLE_PORT"
	echo "> 포트전환"
	echo "set \$service_url http://127.0.0.1:${IDLE_PORT};" | sudo tee /etc/nginx/conf.d/service-url.inc
	echo "set \$service_url http://127.0.0.1:${IDLE_PORT};" | sudo tee /etc/nginx/conf.d/service-url.inc
	echo "> 엔진엑스 재기동"
	sudo service nginx reload	
}