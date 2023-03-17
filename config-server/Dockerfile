FROM openjdk:17

VOLUME /tmp
EXPOSE 8888
ADD ./target/config-server-V1.jar config-server-V1.jar
ENTRYPOINT [ "java","-jar","/config-server-V1.jar" ]