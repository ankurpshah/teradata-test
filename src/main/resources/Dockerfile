FROM centos:7

MAINTAINER Ankur Shah version: 1.0

RUN yum install -y java-1.8.0-openjdk
COPY files/ /opt/

ENTRYPOINT ["/bin/bash", "/opt/fullname.sh"]
