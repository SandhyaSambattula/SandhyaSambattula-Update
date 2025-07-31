CREATE TABLE song (
    title TEXT,
    artist TEXT
);
INSERT INTO song (title, artist) VALUES
('Shape of you', 'Ed Sheeran');

UPDATE "user" 
SET firstName = 'Rushil'
WHERE firstName = 'Rishi';


SELECT * FROM song WHERE LOWER(artist) = LOWER('ed Sheeran');


