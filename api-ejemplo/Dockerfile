FROM openjdk:17

VOLUME /tmp
EXPOSE 8090
ADD ./target/gateway-server-V1.jar gateway-server-V1.jar
ENTRYPOINT [ "java","-jar","/gateway-server-V1.jar" ]