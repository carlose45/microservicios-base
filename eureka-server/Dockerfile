FROM openjdk:17

VOLUME /tmp
EXPOSE 8761
ADD ./target/eureka-server-V1.jar eureka-server-V1.jar
ENTRYPOINT [ "java","-jar","/eureka-server-V1.jar" ]