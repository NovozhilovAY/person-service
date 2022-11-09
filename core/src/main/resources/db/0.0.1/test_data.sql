
INSERT INTO medical_card VALUES (1, 'g', null, '2022-05-05', 'Comment1');
INSERT INTO medical_card VALUES (2, 'g', null, '2022-05-06', 'Comment2');
INSERT INTO medical_card VALUES (3, 'g', null, '2022-05-07', 'Comment3');
INSERT INTO medical_card VALUES (4, 'g', 's', '2022-05-08', 'Comment4');
INSERT INTO medical_card VALUES (5, 'g', 's', '2022-05-09', 'Comment5');
INSERT INTO medical_card VALUES (6, 'g', 's', '2022-05-10', 'Comment6');
INSERT INTO medical_card VALUES (7, 'g', 's', '2022-05-11', 'Comment7');
INSERT INTO medical_card VALUES (8, 'g', 's', '2022-05-12', 'Comment8');
INSERT INTO medical_card VALUES (9, 'g', 's', '2022-05-13', 'Comment9');
INSERT INTO medical_card VALUES (10, 'g', 's', '2022-05-14', 'Comment10');

INSERT INTO contact VALUES (1, '8-800-555-35-31', 'email1@email.com', null);
INSERT INTO contact VALUES (2, '8-800-555-35-32', 'email2@email.com', null);
INSERT INTO contact VALUES (3, '8-800-555-35-33', 'email3@email.com', null);
INSERT INTO contact VALUES (4, '8-800-555-35-34', 'email4@email.com', null);
INSERT INTO contact VALUES (5, '8-800-555-35-35', 'email5@email.com', null);
INSERT INTO contact VALUES (6, '8-800-555-35-36', 'email6@email.com', null);
INSERT INTO contact VALUES (7, '8-800-555-35-37', 'email7@email.com', null);
INSERT INTO contact VALUES (8, '8-800-555-35-38', 'email8@email.com', null);
INSERT INTO contact VALUES (9, '8-800-555-35-39', 'email9@email.com', null);
INSERT INTO contact VALUES (10, '8-800-555-35-40', 'email10@email.com', null);
INSERT INTO contact VALUES (11, '8-800-555-35-40', 'email10@email.com', null);
INSERT INTO contact VALUES (12, '8-800-555-35-40', 'email10@email.com', null);
INSERT INTO contact VALUES (13, '8-800-555-35-40', 'email10@email.com', null);
INSERT INTO contact VALUES (14, '8-800-555-35-39', 'email9@email.com', null);
INSERT INTO contact VALUES (15, '8-800-555-35-39', 'email9@email.com', null);
INSERT INTO contact VALUES (16, '8-800-555-35-39', 'email9@email.com', null);

INSERT INTO illness VALUES (1, 1, 1, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (2, 1, 1, 'B', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (3, 2, 1, 'C', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (4, 3, 1, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (5, 4, 1, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (6, 5, 1, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (7, 6, 1, 'B', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (8, 7, 1, 'C', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (9, 8, 1, 'D', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (10, 9, 1, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (11, 10, 1, 'B', CURRENT_TIMESTAMP, CURRENT_DATE);

INSERT INTO address VALUES (1, 1, 2, 'city1', 4, 'street1', '2', null);
INSERT INTO address VALUES (2, 2, 2, 'city2', 4, 'street2', '2', null);
INSERT INTO address VALUES (3, 3, 2, 'city3', 4, 'street3', '2', null);
INSERT INTO address VALUES (4, 4, 2, 'city4', 4, 'street4', '2', null);
INSERT INTO address VALUES (5, 5, 2, 'city5', 4, 'street5', '2', null);
INSERT INTO address VALUES (6, 6, 2, 'city6', 4, 'street6', '2', null);
INSERT INTO address VALUES (7, 7, 2, 'city7', 4, 'street7', '2', null);
INSERT INTO address VALUES (8, 8, 2, 'city8', 4, 'street8', '2', null);
INSERT INTO address VALUES (9, 9, 2, 'city9', 4, 'street9', '2', null);
INSERT INTO address VALUES (10, 10, 2, 'city10', 4, 'street10', '2', null);
INSERT INTO address VALUES (11, 1, 2, 'city11', 4, 'street11', '2', null);

INSERT INTO person_data VALUES (1, 'lastName1', 'firstName1', '1999-02-05', 23, 'm', 1, 1, null);
INSERT INTO person_data VALUES (2, 'lastName2', 'firstName2', '1999-02-06', 23, 'm', 2, 2, 1);
INSERT INTO person_data VALUES (3, 'lastName3', 'firstName3', '1999-02-07', 23, 'm', 3, 3, 2);
INSERT INTO person_data VALUES (4, 'lastName4', 'firstName4', '1999-02-08', 23, 'm', 4, 4, 2);
INSERT INTO person_data VALUES (5, 'lastName5', 'firstName5', '1999-02-09', 23, 'm', 5, 5, null);
INSERT INTO person_data VALUES (6, 'lastName6', 'firstName6', '1999-02-10', 23, 'm', 6, 6, null);
INSERT INTO person_data VALUES (7, 'lastName7', 'firstName7', '1999-02-11', 23, 'm', 7, 7, null);
INSERT INTO person_data VALUES (8, 'lastName8', 'firstName8', '1999-02-12', 23, 'm', 8, 8, null);
INSERT INTO person_data VALUES (9, 'lastName9', 'firstName9', '1999-02-13', 23, 'm', 9, 9, null);
INSERT INTO person_data VALUES (10, 'lastName10', 'firstName10', '1999-02-14', 23, 'm', 10, 10, null);

INSERT INTO users (login, password) VALUES ('admin', '$2a$10$q2e864w/bAAWQivGH8JjqeDmOHfziVryRSeSZBqb8njFoIOG7XE8G');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO users_roles VALUES (1 , 1);