-- Create the table
CREATE TABLE IF NOT EXISTS site_user (
    id INT PRIMARY KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50)
);

-- Insert initial data
INSERT INTO site_user (id, firstname, lastname) VALUES
(1, 'Steve', 'Garcia'),
(2, 'Alexa', 'Smith'),
(3, 'Steve', 'Jones'),
(4, 'Brandon', 'Smith'),
(5, 'Adam', 'Jones');
