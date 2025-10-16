CREATE TABLE tasks
(
    id            INT          NOT NULL,
    title         VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    completed     VARCHAR(255) NULL,
    CONSTRAINT pk_task PRIMARY KEY (id)
);

INSERT INTO tasks (id, title, description, completed) VALUES (100, 'java', 'learn java', 'COMPLETED');
INSERT INTO tasks (id, title, description, completed) VALUES (101, 'spring', 'learn spring', 'IN_PROGRESS');
INSERT INTO tasks (id, title, description, completed) VALUES (102, 'hibernate', 'learn hibernate', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (103, 'docker', 'learn docker', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (104, 'kubernetes', 'learn kubernetes', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (105, 'aws', 'learn aws', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (106, 'azure', 'learn azure', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (107, 'gcp', 'learn gcp', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (108, 'react', 'learn react', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (109, 'angular', 'learn angular', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (110, 'vue', 'learn vue', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (111, 'svelte', 'learn svelte', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (112, 'flutter', 'learn flutter', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (113, 'dart', 'learn dart', 'PENDING');
INSERT INTO tasks(id, title, description, completed) VALUES (114, 'kotlin', 'learn kotlin', 'PENDING');
INSERT INTO tasks (id, title, description, completed) VALUES (115, 'swift', 'learn swift', 'PENDING');