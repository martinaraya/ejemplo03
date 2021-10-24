FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/app
COPY target/*.jar /opt/app
ENTRYPOINT ["java","-jar","/opt/app/ejemplo03-0.0.1-SNAPSHOT.jar"]
