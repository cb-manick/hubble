FROM openjdk:11-jre-slim-buster
MAINTAINER Chargebee
COPY target/invoice.number.internal.provider-1.0.jar provider-1.0.jar
ENTRYPOINT ["java","-jar","provider-1.0.jar"]