DROP TABLE IF EXISTS "MURAL";

DROP SEQUENCE IF EXISTS hibernate_sequence;

create sequence hibernate_sequence start with 1 increment by 1;

CREATE TABLE "MURAL" (
  ID SERIAL PRIMARY KEY,
  DESCRIPTION TEXT default NULL,
  PUBLISH varchar(255),
  VISUALIZATION varchar(255),
  STATUS boolean,
  TITLE TEXT default NULL
);
