FROM openjdk:28-ea-oraclelinux9

COPY ./target/ems.jar ems.jar

ENTRYPOINT ["java","-jar","ems.jar"]