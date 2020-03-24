DROP TABLE vote IF EXISTS;
DROP TABLE user IF EXISTS;
DROP TABLE menu IF EXISTS;
DROP TABLE restaurant IF EXISTS;
DROP SEQUENCE IF EXISTS global_seq;
-------------------------------------

CREATE SEQUENCE global_seq AS INTEGER START WITH 10000;

CREATE TABLE user
(
    id          INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    is_admin    INTEGER   DEFAULT 0,
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE restaurant
(
    id          INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE menu
(
    id            INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
    dish_name     VARCHAR(255) NOT NULL,
    id_restaurant INTEGER      NOT NULL,
    menu_date     DATE         NOT NULL,
    create_time   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_restaurant) REFERENCES restaurant (id) ON DELETE CASCADE,
    CONSTRAINT uq_menu_dish_name_menu_date UNIQUE (dish_name, menu_date)
);

CREATE TABLE vote
(
    id            INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
    id_user       INTEGER NOT NULL,
    id_restaurant INTEGER NOT NULL,
    vote_time     TIMESTAMP,
    create_time   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_user) REFERENCES user (id) ON DELETE CASCADE,
    FOREIGN KEY (id_restaurant) REFERENCES restaurant (id) ON DELETE CASCADE
);



