CREATE TABLE song (
    title TEXT,
    artist TEXT
);
INSERT INTO song (title, artist) VALUES
('Shape of you', 'Ed Sheeran');
SELECT * FROM song WHERE LOWER(artist) = 'ed Sheeran';
