FROM openjdk:12

# WORKDIR /home/cgi/docker-work-dir

WORKDIR /home/cgi/local_lib

# COPY ./local_lib/com-google-ortools-1.0.jar ./com-google-ortools-1.0.jar
# COPY ./local_lib/protobuf-1.0.jar ./protobuf-1.0.jar

COPY ./target/routing-0.0.1-SNAPSHOT.jar ./routing.jar

# ENV CLASSPATH .:/home/cgi/local_lib/com.google.ortools-1.0.jar:/home/cgi/local_lib/protobuf-1.0.jar

# ENTRYPOINT ["java", "-classpath", ".;./com.google.ortools-1.0.jar;./protobuf-1.0.jar", "-jar", "routing.jar"]
# ENTRYPOINT ["java","-jar","routing.jar"]
# ENTRYPOINT ["java", "-cp", "/home/cgi/local_lib/com.google.ortools-1.0.jar:/home/cgi/local_lib/protobuf-1.0.jar", "-jar","routing.jar"]
# ENTRYPOINT ["java","-cp", ".:my-test.jar", "com.test.TestDocker"]

# ENTRYPOINT ["java", "-cp", ".:/home/cgi/local_lib/*.*", "-jar","routing.jar"]

# ENTRYPOINT ["java", "-cp", ".:/home/cgi/local_lib/com-google-ortools-1.0.jar:/home/cgi/local_lib/protobuf-1.0.jar", "-jar","routing.jar"]

ENTRYPOINT ["java", "-jar","routing.jar"]

