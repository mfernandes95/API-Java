FROM openjdk:11

WORKDIR /usr/app

COPY target/kamikaze-*.jar /kamikaze.jar

#CMD ["java", "-jar", "/kamikaze.jar"]