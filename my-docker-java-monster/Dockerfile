FROM eclipse-temurin:17-jdk
WORKDIR /my-docker-java-monster
COPY Main.java .
COPY Monster.java .
RUN javac *.java
CMD ["java", "Main"]