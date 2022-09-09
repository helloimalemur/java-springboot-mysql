#!/bin/bash
pkill -xf "Example Main"
cd /usr/share/example/

exec -a 'java-springboot-mysql' /usr/share/java-springboot-mysql/bin/java-springboot-mysql

