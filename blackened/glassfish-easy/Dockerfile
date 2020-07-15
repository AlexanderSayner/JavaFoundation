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

COPY target/glassfish-easy-1.0-SNAPSHOT.war /opt/app/

RUN \
 asadmin start-domain  && \
 asadmin --user $ADMIN_USER --passwordfile=/opt/tmpfile change-admin-password  && \
 asadmin --user $ADMIN_USER --passwordfile=/opt/pwdfile enable-secure-admin  && \
 asadmin --user admin --passwordfile=/opt/pwdfile deploy /opt/app/glassfish-easy-1.0-SNAPSHOT.war  && \
 asadmin stop-domain

# cleanup
RUN rm /opt/tmpfile

CMD ["asadmin", "start-domain", "--verbose"]
