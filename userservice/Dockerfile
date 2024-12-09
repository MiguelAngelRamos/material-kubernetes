# Usar una imagen base compatible con ARM y x86_64
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR
COPY target/userservice-0.0.1-SNAPSHOT.jar user-service.jar

# Exponer el puerto en el que correrá la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","user-service.jar"]