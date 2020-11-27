
CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  username VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  account_non_expired BOOLEAN NOT NULL,
  account_non_locked BOOLEAN NOT NULL,
  credentials_non_expired BOOLEAN NOT NULL,
  enabled BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS authority (
  name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS authorities (
  username VARCHAR(250) NOT NULL,
  authority VARCHAR(50) NOT NULL
);

ALTER TABLE authorities
    ADD FOREIGN KEY (username) 
    REFERENCES users(username);
    
ALTER TABLE authorities
    ADD FOREIGN KEY (authority) 
    REFERENCES authority(name);