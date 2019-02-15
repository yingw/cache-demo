DROP TABLE IF EXISTS `user`;

CREATE TABLE IF NOT EXISTS `user` (
  id       INT PRIMARY KEY,
  username VARCHAR(50),
  email    VARCHAR(100),
  UNIQUE KEY (username)
);

