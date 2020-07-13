FROM maven
# Сборка проекта
COPY src    /opt/app/src/
COPY pom.xml /opt/app/
WORKDIR /opt/app
RUN mvn package

# Установка Tomcat
WORKDIR /opt
RUN yum install wget -y  && \
    wget https://apache-mirror.rbc.ru/pub/apache/tomcat/tomcat-9/v9.0.37/bin/apache-tomcat-9.0.37.tar.gz  && \
    tar -xf apache-tomcat-9.0.37.tar.gz  && \
    rm apache-tomcat-9.0.37.tar.gz  && \
    # Деплой war архива
    cp /opt/app/target/maven-servlet-1.0-SNAPSHOT.war apache-tomcat-9.0.37/webapps/  && \
    # Настройка Tomcat
    chmod +x apache-tomcat-9.0.37/bin/catalina.sh

# Загрузка конфигураций Tomcat
COPY tomcat-users.xml apache-tomcat-9.0.37/conf/
# Копирование ключа шифрования в папку с проектом
COPY .keystore /opt/app/
# Загрузка конфигурации для включения https
COPY server.xml apache-tomcat-9.0.37/conf/

# Запуск Tomcat
WORKDIR /opt/apache-tomcat-9.0.37/bin
CMD ["./catalina.sh", "run"]
