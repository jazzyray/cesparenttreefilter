FROM centos
RUN \
  yum update -y && \
  yum install -y java-1.8.0-openjdk && \
  yum install -y wget && \
  mkdir -p /data/ces-filter-parent-tree-api \
  mkdir -p /data/ces-filter-parent-tree-api/work \
  mkdir -p /data/ces-filter-parent-tree-api/target

WORKDIR data/ces-filter-parent-tree-api

COPY start-mock.sh /data/ces-filter-parent-tree-api
COPY target/cesparenttreefilter-0.0.1-SNAPSHOT.jar /data/ces-filter-parent-tree-api/target
COPY cesparenttreefilter-comfiguration.yml /data/ces-filter-parent-tree-api

EXPOSE 9107
EXPOSE 9108

ENV JAVA_HOME /usr/lib/jvm/jre-1.8.0-openjdk
CMD /data/ces-filter-parent-tree-api/start.sh