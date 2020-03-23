DROP TABLE vote IF EXISTS;
DROP TABLE user IF EXISTS;
DROP SEQUENCE IF EXISTS global_seq;
CREATE SEQUENCE global_seq AS INTEGER START WITH 10000;

CREATE TABLE user
(
    id       INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    is_admin INTEGER DEFAULT 0
);

CREATE TABLE vote
(
    id INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
    id_user INTEGER NOT NULL,
    id_restaurant INTEGER NOT NULL,
    vote_time TIMESTAMP,
    FOREIGN KEY (id_user) REFERENCES user(id) ON DELETE CASCADE
);
