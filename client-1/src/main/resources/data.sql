INSERT INTO authority (name) VALUES
	('ROLE_ADMIN'),
	('ROLE_USER');

INSERT INTO users (id, username, password, account_non_expired, account_non_locked, credentials_non_expired, enabled) VALUES
  	('1', 'admin', '$2y$10$C1/fGlUFnHWmcfzSIE7QlujxNlg5cSJsQVpCK5j/1njLuLhMH3AfG', 'true', 'true', 'true', 'true'),
	('2', 'user', '$2y$10$VfutSYjB.cm1mfLWtlsTkufN6O7ARswnlCrZVUGFlQhg0oFXF3YZ6', 'true', 'true', 'true', 'true');
	
INSERT INTO authorities (username, authority) VALUES
  	('admin', 'ROLE_ADMIN'),
	('admin', 'ROLE_USER'),
	('user', 'ROLE_USER');
	
	