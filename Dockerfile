FROM openjdk:8-jdk-alpine 
RUN apk --no-cache add curl
COPY build/libs/*.jar kafka-cluster.jar
CMD java ${JAVA_OPTS} -jar kafka-cluster.jar