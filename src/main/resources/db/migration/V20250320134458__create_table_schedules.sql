-- V20250320134458__create_table_schedules.sql generated in C:\projects\IntelliJ\dio-barbearia-api\src\main\resources\db\migration
CREATE TABLE SCHEDULES (
     id BIGSERIAL not null primary key,
     start_in timestamp not null,
     end_in timestamp not null,
     client_id BIGSERIAL not null,
     CONSTRAINT UK_SCHEDULE_INTERVAL  UNIQUE (start_in, end_in),
     CONSTRAINT FK_CLIENTS_SCHEDULES FOREIGN KEY(client_id) REFERENCES CLIENTS(id)
 );