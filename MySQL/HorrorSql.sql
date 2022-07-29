CREATE DATABASE IF NOT EXISTS Horrorscopes;

USE horrorscopes;

CREATE TABLE IF NOT  EXISTS horror (
horror_id  int auto_increment,
horror_name varchar(50) not null,
horror_desc varchar(255) not null,
horror_fortune varchar(255) not null,
PRIMARY KEY (horror_id)
);

INSERT INTO horror(horror_id,horror_name,horror_desc,horror_fortune);

SELECT * FROM horrorscopes;

DELETE FROM horrorscope WHERE horror_fortune = NULL;