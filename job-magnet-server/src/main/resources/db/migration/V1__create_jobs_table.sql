CREATE TABLE jobs
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(255) NOT NULL,
    date_posted TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
