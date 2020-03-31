INSERT INTO user (name, is_admin)
VALUES ('John', 0);
INSERT INTO user (name, is_admin)
VALUES ('Sara', 0);

INSERT INTO restaurant (name)
VALUES ('El Paso');
INSERT INTO restaurant (name)
VALUES ('McDack');

INSERT INTO vote (id_user, id_restaurant, vote_date)
VALUES (10000, 10002, '2020-03-22 10:00:00');
INSERT INTO vote (id_user, id_restaurant, vote_date)
VALUES (10001, 10003, '2020-03-22 10:30:00');

INSERT INTO menu (dish_name, dish_price, id_restaurant, menu_date)
VALUES ('Chips & Salsa', 150, 10002, '2020-03-22');
INSERT INTO menu (dish_name, dish_price, id_restaurant, menu_date)
VALUES ('Spicy Pork',170, 10002, '2020-03-22');

INSERT INTO menu (dish_name, id_restaurant, menu_date)
VALUES ('Pasta Carbonara', 10003, '2020-03-22 00:00:00');
INSERT INTO menu (dish_name, id_restaurant, menu_date)
VALUES ('Chicken Pot Pie', 10003, '2020-03-22 00:00:00');