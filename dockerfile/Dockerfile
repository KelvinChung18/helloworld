# 基础镜像
FROM openjdk:8-jdk-alpine

# 作者标签
LABEL authors="kelvinchung"

# 复制jar包到容器内
ADD target/helloworld-0.0.1-SNAPSHOT.jar /helloworld-0.0.1-SNAPSHOT.jar

# 暴露端口
EXPOSE 8080

# 启动命令
ENTRYPOINT ["java", "-jar","/helloworld-0.0.1-SNAPSHOT.jar"]

