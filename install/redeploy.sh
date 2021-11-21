#!bin/bash
docker build -t knyaz_server .
docker stop knyaz_server
docker system prune -f
docker run -d -p 443:8080 --name=knyaz_server knyaz_server:latest