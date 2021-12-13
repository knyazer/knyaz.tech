FROM ubuntu

RUN apt-get update && \
    apt-get upgrade -q -y && \
    apt-get install -q -y --no-install-recommends openjdk-17-jre-headless && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

ADD https://github.com/gitbucket/gitbucket/releases/download/4.37.1/gitbucket.war /opt/

RUN ln -s /gitbucket /root/.gitbucket

VOLUME /gitbucket

CMD ["java", "-jar", "/opt/gitbucket.war"]

EXPOSE 8080 29418