```yml
# Usar una imagen base de OpenJDK 17
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR
COPY target/user-service-0.0.1-SNAPSHOT.jar user-service.jar

# Exponer el puerto en el que correrá la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","user-service.jar"]
```