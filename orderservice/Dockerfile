# Usar una imagen base compatible con ARM y x86_64
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR
COPY target/orderservice-0.0.1-SNAPSHOT.jar order-service.jar

# Exponer el puerto en el que correrá la aplicación
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","order-service.jar"]