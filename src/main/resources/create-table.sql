CREATE TABLE Person (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        firstName VARCHAR(255),
                        lastName VARCHAR(255),
                        email VARCHAR(255),
                        status VARCHAR(255)
);

CREATE TABLE Address (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         street VARCHAR(255),
                         city VARCHAR(255),
                         state VARCHAR(255),
                         zipCode VARCHAR(20),
                         person_id BIGINT
);
