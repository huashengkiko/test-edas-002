# 建议生产使用，ref: http://blog.tenxcloud.com/?p=1894
FROM fabric8/java-jboss-openjdk8-jdk

USER root

# Prepare by downloading dependencies
COPY sdsd-dsds-provider/target/demo.jar sdsd-dsds-provider/target/taobao-hsf.sar-dev-SNAPSHOT.jar /home/