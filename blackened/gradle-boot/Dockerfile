FROM gradle:6.5.1-jdk11
# Сборка проекта
COPY src /opt/app/src/
COPY build.gradle.kts /opt/app/
COPY settings.gradle.kts /opt/app/
# Запуск проекта
WORKDIR /opt/app
CMD ["gradle", "bootRun"]
