FROM openjdk:11.0.3-jdk
RUN apt-get update && apt-get install bash
RUN mkdir -p /usr/app/
ENV PROJECT_HOME /usr/app/
COPY target/webclient-0.0.1-SNAPSHOT.jar $PROJECT_HOME/webclient-0.0.1-SNAPSHOT.jar
WORKDIR $PROJECT_HOME
EXPOSE 8080
CMD ["java", "-jar", "./webclient-0.0.1-SNAPSHOT.jar"]
