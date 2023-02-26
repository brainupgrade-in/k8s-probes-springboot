FROM openjdk:8-jre-alpine

COPY target/app.jar app.jar

ENTRYPOINT ["java"]
CMD ["-jar","app.jar"]

# docker build -f Dockerfile -t brainupgrade/probes:1.0 .
