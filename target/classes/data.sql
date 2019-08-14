DROP TABLE IF EXISTS accounts;

CREATE TABLE accounts (
account_id INT AUTO_INCREMENT PRIMARY KEY,
account_name VARCHAR(50) NOT NULL
);

INSERT INTO accounts (account_name) VALUES
('Morgan Stanley'), ('Wells Fargo');


DROP TABLE IF EXISTS skills;

CREATE TABLE skills (
skill_id INT AUTO_INCREMENT PRIMARY KEY,
skill_name VARCHAR(50) NOT NULL,
skill_description TEXT
);


INSERT INTO skills (skill_name, skill_description) VALUES
('Core Java', 'Java EE, Collections, Multithreading'),
('Angular', 'Angular developer with experience in building the User Interface');

DROP TABLE IF EXISTS open_positions;

CREATE TABLE open_positions (
  syne_opt_id VARCHAR(50) NOT NULL PRIMARY KEY,
  serial_key INT NOT NULL,  
  account_id INT, 
  fg_id VARCHAR(50),
  req_date DATE  NOT NULL,
  aging INT NOT NULL,
  hiring_manager VARCHAR(100),
  hiring_comment TEXT,
  priority VARCHAR(2) NOT NULL,
  project VARCHAR(100),
  line_of_business VARCHAR(50),
  role_category VARCHAR(20),
  tfr VARCHAR(50),
  location VARCHAR(50),
  skill_id INT,  
  must_have_skills TEXT,
  experience VARCHAR(40),
  band VARCHAR(20),
  final_status VARCHAR(20),
  client_submission VARCHAR(20),
  processing VARCHAR(20),
  biz_owner VARCHAR(100),
  rmg_spoc VARCHAR(100),
  recruiter_lead VARCHAR(100),
  recruiter VARCHAR(100),
  job_description TEXT,
  foreign key (account_id) references accounts(account_id),
  foreign key (skill_id) references skills(skill_id)
  
);

INSERT INTO open_positions (serial_key,
  syne_opt_id,
  account_id,
  fg_id,
  req_date,
  aging,
  hiring_manager,
  hiring_comment,
  priority,
  project,
  line_of_business,
  role_category,
  tfr,
  location,
  skill_id,
  must_have_skills,
  experience,
  final_status,
  client_submission,
  processing,
  biz_owner,
  rmg_spoc,
  recruiter_lead,
  recruiter,
  job_description) VALUES (420, 'SYN18-OPT-B-420', 1 ,'NA','2019-07-02',3,'Ankush Jain','WIP','P2','UIT Modernization','WMT','ODC','NA','Bangalore',1,'Multi Threading','4-7 Years','Open',5,2,'Nitish Srivastava','Rajani G','Smita ','Smita','This is a sample JD'),
  (423, 'SYN18-OPT-B-423', 1,'NA','2019-07-01',4,'Avinash Tiwari','WIP','P2','IM IT','WMT','Co-located','NA','Mumbai',2 ,'Full Stack','4-7 Years','Open',0,0,'Amit Bapat','Rajani G','Siddhesh Katkar ','Siddhesh Katkar','This is a sample JD'); 			



/*
DROP TABLE IF EXISTS  submissions;

CREATE TABLE  submissions(
syne_submission_id VARCHAR(50) PRIMARY KEY,
syne_opt_id VARCHAR(30) NOT NULL,
submission_date DATE,
client_response varchar(50),
candidate_name VARCHAR(30),
skill_set VARCHAR(50),
experience VARCHAR(20),
current_location VARCHAR(30),
preffered_location VARCHAR(20),
current_company VARCHAR(30),
submission_validity VARCHAR(20),
submission_status VARCHAR(20),
selection_status VARCHAR(20),
selected VARCHAR(10),
dropout VARCHAR(10),
select_or_dropout_date DATE,
l1panelist VARCHAR(30),
l1panelist2 VARCHAR(30),
l1interview_date DATE,
l2interview_date DATE,
l3interview_date DATE,
foreign key (syne_opt_id) references open_positions(syne_opt_id),
);


INSERT INTO submissions(
syne_submission_id ,
syne_opt_id ,
submission_date ,
client_response ,
candidate_name ,
skill_set,
experience ,
current_location ,
preffered_location ,
current_company ,
submission_validity,
submission_status ,
selection_status ,
selected ,
dropout ,
select_or_dropout_date,
l1panelist ,
l1panelist2 ,
l1interview_date,
l2interview_date ,
l3interview_date 
) VALUES
('SYN18-OPT-B-420-SUB-2','SYN18-OPT-B-420','2019-07-05','NA','Loganathan.S','Core Java','8 Years',
'Chennai','Bangalore','Verizon','Valid','Processing','NA','NO','NO',null,'Om Tiwary','NA','2019-07-07','2019-07-08',null),
('SYN18-OPT-B-423-SUB-5','SYN18-OPT-B-420','2019-06-28','NA','Shone Johnson','UI Developer','7 Years',
'Mumbai','Mumbai','Citiustech','Valid','Processing','NA','NO','NO',null,'Victor H','NA','2019-07-04','2019-07-06',null);

*/

DROP TABLE IF EXISTS  submissions;

CREATE TABLE  submissions(
syne_submission_id VARCHAR(50) PRIMARY KEY,
syne_opt_id VARCHAR(30) NOT NULL,
submission_date DATE,
submission_type VARCHAR(30),
client_response varchar(50),
candidate_name VARCHAR(30),
candidate_image VARCHAR(30),
employee_id VARCHAR(50),
experience VARCHAR(20),
current_location VARCHAR(30),
preffered_location VARCHAR(20),
submission_status VARCHAR(20),
is_selected boolean,
foreign key (syne_opt_id) references open_positions(syne_opt_id));

INSERT INTO submissions(
syne_submission_id,
syne_opt_id,
submission_date,
submission_type,
client_response,
candidate_name,
candidate_image,
employee_id,
experience,
current_location,
preffered_location,
submission_status,
is_selected
)VALUES
('SYN18-OPT-B-420-SUB-1','SYN18-OPT-B-420','2019-07-05','Applied','NA','Loganathan.S','image_location.jpg','6341','8 Years','Chennai','Bangalore','Completed',false),
('SYN18-OPT-B-420-SUB-2','SYN18-OPT-B-420','2019-07-07','Application Sent On','NA','Loganathan.S','image_location.jpg','6341','8 Years','Chennai','Bangalore','Processing',false),
/*
('SYN18-OPT-B-420-SUB-3','SYN18-OPT-B-420','2019-07-05','Applied','NA','Loganathan.S','image_location.jpg','6341','8 Years','Chennai','Bangalore','Completed',false),
('SYN18-OPT-B-420-SUB-4','SYN18-OPT-B-420','2019-07-07','Application Sent On','NA','Loganathan.S','image_location.jpg','6341','8 Years','Chennai','Bangalore','Processing',false),*/

('SYN18-OPT-B-423-SUB-5','SYN18-OPT-B-423','2019-06-28','application sent on','NA','Shone Johnson','image_location1.jpg','8847','7 Years','Mumbai','Mumbai','Processing',false);

/*('SYN18-OPT-B-420-SUB-2','SYN18-OPT-B-420','2019-07-05','submitted','NA','Loganathan.S','image_location.jpg','6341','8 Years',
'Chennai','Bangalore','Processing',false),
('SYN18-OPT-B-423-SUB-5','SYN18-OPT-B-420','2019-06-28','application sent on','NA','Shone Johnson','image_location1.jpg','8847','7 Years',
'Mumbai','Mumbai','Processing',false);*/


DROP TABLE IF EXISTS  roles;

CREATE TABLE  roles(
role_id INT AUTO_INCREMENT PRIMARY KEY,
role_name VARCHAR(30) NOT NULL

);

INSERT INTO roles (role_name) VALUES 
('Manager'), ('Resourcing Member');

DROP TABLE IF EXISTS users;

CREATE TABLE users(
employee_id INT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
role_id INT,
account_id INT,
foreign key (role_id) references roles(role_id),
foreign key (account_id) references accounts(account_id)
);

INSERT INTO users (employee_id, name, role_id, account_id) VALUES
(6341, 'Vishal Gadekar', 1, 1),
(8847, 'Neha Prasad', 2, 1);


/*
DROP TABLE IF EXISTS interview;

CREATE TABLE interview(
syne_interview_id VARCHAR(50) PRIMARY KEY,
syne_submission_id VARCHAR(50) NOT NULL,
status_of_interview VARCHAR(30),
interview_type VARCHAR(50),
l1panelist VARCHAR(30),
l1interview_date VARCHAR(20),
l1feedback TEXT,
l2panelist VARCHAR(30),
l2interview_date VARCHAR(20),
l2feedback TEXT,
l3panelist VARCHAR(30),
l3interview_date VARCHAR(20),
l3feedback TEXT,
foreign key (syne_submission_id) references submissions(syne_submission_id));
*/

DROP TABLE IF EXISTS interview;

CREATE TABLE interview(
syne_interview_id VARCHAR(50) PRIMARY KEY,
syne_submission_id VARCHAR(50) NOT NULL,
level_of_interview VARCHAR(30),
status_of_interview VARCHAR(30),
interview_type VARCHAR(50),
interview_date VARCHAR(20),
feedback TEXT,
foreign key (syne_submission_id) references submissions(syne_submission_id));

INSERT INTO interview(
syne_interview_id,
syne_submission_id,
level_of_interview,
status_of_interview,
interview_type,
interview_date,
feedback 
) VALUES
('1','SYN18-OPT-B-420-SUB-2','Level 1','Completed','Aptitute','2019-05-01','Good in logical reasoning and Problem Solving'),
('2','SYN18-OPT-B-420-SUB-2','Level 2','Completed','Technical 1','2019-05-03','Good in Core Java concepts'),
('3','SYN18-OPT-B-420-SUB-2','Level 3','processing','Technical 2','2019-05-05',NULL),
('4','SYN18-OPT-B-423-SUB-5','Level 1','processing','Technical','2019-05-09',NULL);

