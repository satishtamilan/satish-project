FROM java:8
run mkdir /opt/sample
copy sample/target/course-api-0.0.1-SNAPSHOT.jar /opt/sample/course-api-0.0.1-SNAPSHOT.jar
workdir /opt/sample
entrypoint java -jar course-api-0.0.1-SNAPSHOT.jar




