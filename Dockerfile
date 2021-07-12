FROM mcr.microsoft.com/mssql/server:2019-latest

# Create work directory
RUN mkdir -p /usr/work
WORKDIR /usr/work

# Copy all scripts into working directory
COPY . /usr/work/

# Grant permissions for the import-data script to be executable
USER root
RUN chmod u+x /usr/work/import-data.sh

EXPOSE 1433

CMD /bin/bash ./entrypoint.sh