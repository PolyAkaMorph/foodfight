INSERT INTO user (name, is_admin)
VALUES ('John', 0);
INSERT INTO user (name, is_admin)
VALUES ('Sara', 0);

INSERT INTO restaurant (name)
VALUES ('El Paso');
INSERT INTO restaurant (name)
VALUES ('MacDack1');

INSERT INTO vote (id_user, id_restaurant, vote_time)
VALUES (10000, 10002, '2020-03-22 10:00:00');
INSERT INTO vote (id_user, id_restaurant, vote_time)
VALUES (10001, 10003, '2020-03-22 10:30:00');
