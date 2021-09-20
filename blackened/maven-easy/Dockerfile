FROM maven

COPY ./src    /opt/app/src/
ADD ./pom.xml /opt/app/
WORKDIR /opt/app
RUN mvn compile
RUN mvn exec:java -Dexec.mainClass="org.sayner.sandbox.example.easy.Application"
