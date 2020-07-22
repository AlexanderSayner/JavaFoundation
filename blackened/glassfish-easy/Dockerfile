FROM glassfish

ENV ADMIN_USER admin
ENV ADMIN_PASSWORD secret

# set credentials to admin/secret
RUN \
  echo 'AS_ADMIN_PASSWORD=\n\
  AS_ADMIN_NEWPASSWORD='$ADMIN_PASSWORD'\n\
  EOF\n'\
  >> /opt/tmpfile

RUN \
  echo 'AS_ADMIN_PASSWORD='$ADMIN_PASSWORD'\n\
  EOF\n'\
  >> /opt/pwdfile

# build project
COPY src    /opt/app/src/
COPY pom.xml /opt/app/
WORKDIR /opt

RUN wget http://mirror.linux-ia64.org/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz && \
    tar -xf apache-maven-3.6.3-bin.tar.gz && \
    rm apache-maven-3.6.3-bin.tar.gz && \
    cd app && \
    /opt/apache-maven-3.6.3/bin/mvn package

RUN \
 asadmin start-domain  && \
 asadmin --user $ADMIN_USER --passwordfile=/opt/tmpfile change-admin-password  && \
 asadmin --user $ADMIN_USER --passwordfile=/opt/pwdfile enable-secure-admin  && \
 asadmin --user admin --passwordfile=/opt/pwdfile deploy /opt/app/target/glassfish-easy-1.0-SNAPSHOT.war  && \
 asadmin stop-domain

# cleanup
RUN rm /opt/tmpfile

CMD ["asadmin", "start-domain", "--verbose"]
