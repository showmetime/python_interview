# 这是老王的构建docker镜像的方法
#FROM centos:7
# 依赖镜像的名称和ID

#MAINTAINER maintainer
# 指定镜像的创建者信息

#ENV JAVA_HOME /usr/local/java/jdk1.8.0_171
#ENV JRE_HOME $JAVA_HOME/jre
#ENV CLASSPATH
#$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME
#ENV PATH $JAVA_HOME/BIN:$PATH

# 设置环境变量，可以写多条

#RUN mkdir /usr/local/java
# RUN COMMAMD 是dockerfile的核心部分 可以写多条

#ADD jdk-8u171-linux-x64.tar.gz /usr/local/java/
# ADD source_dir/file dest_dir/file 将宿主机的文件复制到容器中，如果是一个
# 压缩文件，将会复制后自动解压
# ADD是相对路径jar，把java添加到容器中

# COPY sorce_dir/file dest_dir/file 复制到那里 和add差不多

# WORKDIR path_dir 设置工作目录

# EXPOSE port1 port2 指定端口 和外界交互

# CMD argument 在构建容器时使用 会被docker run后的argument覆盖

#  ENTRYPOINT argumenet 和CMD相似 但是并不会被docker run指定的参数覆盖
# ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS /app.jar $PARAMS"]  entryPoint xxljob的配置

# VOLUME 将本地文件夹或者其它容器的文件挂载到容器

# 接着在目录/usr/local/dockerjdk8 执行命令 docker builder -t='jdk1.8'

FROM jdk1.8:latest
VOLUME /tmp
#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8
ADD *.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]


#我们添加了一个VOLUME指向“/ tmp”的内容，因为这是Spring Boot应用程序默认为Tomcat创建工作目录的地方。
#效果是在“/var/lib/docker”下的主机上创建一个临时文件，并将其链接到“/ tmp”下的容器。
#对于我们在此处编写的简单应用程序，此步骤是可选的，但如果需要在文件系统中实际编写，则对于其他Spring Boot应用程序可能是必需的。

#为了减少Tomcat的启动时间，我们添加了一个指向“/dev/urandom”的系统属性作为熵源。
#如果您使用Tomcat（或任何其他Web服务器）的“标准”版本，则不需要更新版本的Spring Boot。