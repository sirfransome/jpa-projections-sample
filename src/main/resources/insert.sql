INSERT INTO Person (first_Name, last_Name, email, status) VALUES
                                                            ('John', 'Doe', 'john.doe@example.com', 'active'),
                                                            ('Jane', 'Smith', 'jane.smith@example.com', 'inactive'),
                                                            ('Alice', 'Johnson', 'alice.johnson@example.com', 'active'),
                                                            ('Bob', 'Brown', 'bob.brown@example.com', 'inactive');

INSERT INTO Address (street, city, state, zipCode, person_id) VALUES
                                                                  ('123 Main St', 'Springfield', 'IL', '62701', 1),
                                                                  ('456 Elm St', 'Springfield', 'IL', '62702', 2),
                                                                  ('789 Oak St', 'Chicago', 'IL', '60601', 3),
                                                                  ('101 Maple St', 'Chicago', 'IL', '60602', 1),
                                                                  ('202 Pine St', 'Naperville', 'IL', '60540', 4);
