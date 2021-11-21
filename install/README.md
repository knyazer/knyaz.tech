# Server files
This folder should be installed on the server, simply by copying it into some directory. It provides some scripts to setup CD worklflow and use SSL (standart server installation is without SSL, as it is much more complicated to debug)

### Setup
- Replace *{ROOT}* in **hooks.json** with absolute path to the server directory (e.g. /home/user/server)
- Replace *cert.pfx* and *password* in **ssl_application.properties** with your filenames
- Add to the root your SSL certificate in PKCS12 format with name *cert.pfx*
- Replace *{WEBHOOK_ACCESS_TOKEN}* in **hooks.json** with your webhook access token

### Structure
**Dockerfile** - provides new docker container based on the knyazer/knyaz-tech-spring-boot on DockerHub but with SSL support
**hooks.json** - configuration file for webhooks 
**redeploy.sh** - script which runs on webhook trigger, reloads docker container
**ssl_application.properties** - Spring Boot configuration file with enabled SSL support
