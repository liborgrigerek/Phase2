Vytvoøení tabulek v postgresql databázi, aby aplikace byla funkèní:
# vytvoreni databaze
psql -U postgre -W
CREATE DATABASE morosystems TEMPLATE template0 ENCODING 'UTF8';
# vytvoreni schematu
\connect morosystems
CREATE SCHEMA morosystems;
CREATE USER morosystems PASSWORD 'morosystems';
GRANT ALL ON SCHEMA morosystems TO morosystems;
GRANT ALL ON ALL TABLES IN SCHEMA morosystems TO morosystems;
\q
# vytvoreni tabulek
psql -d morosystems -U morosystems -W
CREATE TABLE morosystems.userTable
(id SERIAL NOT NULL,
name VARCHAR(256) NOT NULL,
PRIMARY KEY (id)
);
# vlozeni testovacich dat
INSERT INTO morosystems.userTable (id, name) VALUES (1, 'Pepa Dvorak');
INSERT INTO morosystems.userTable (id, name) VALUES (2, 'Franta Jednicka');
INSERT INTO morosystems.userTable (id, name) VALUES (3, 'Honza Drevo');