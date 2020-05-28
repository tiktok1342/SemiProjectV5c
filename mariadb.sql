-- member
create table member (
 mno INT PRIMARY KEY auto_increment,
 NAME VARCHAR (15) not null,
 jumin VARCHAR (18) not null,

 userid VARCHAR (18) not null,
 passwd VARCHAR (18) not null,

 zipcode VARCHAR (7) not null,
 addr1 VARCHAR (50) not null,
 addr2 VARCHAR (50) not null,
 email VARCHAR (50) not null,
 mobile VARCHAR (13) not null,
 regdate datetime DEFAULT CURRENT_TIMESTAMP
);

-- board
CREATE TABLE board (
  bno INT PRIMARY KEY auto_increment,
  title VARCHAR (50) not null,
  userid VARCHAR (18) not null,
  regdate datetime DEFAULT CURRENT_TIMESTAMP,
  thumbup INT DEFAULT 0,
  views INT DEFAULT 0,
  contents mediumtext not null
);
-- pds
CREATE TABLE pds (
  pno INT PRIMARY KEY auto_increment,
  title VARCHAR (50) not null,
  userid VARCHAR (18) not null,
  regdate datetime DEFAULT CURRENT_TIMESTAMP,
  thumbup INT DEFAULT 0,
  views INT DEFAULT 0,
  contents mediumtext not null,
  fname VARCHAR (50),
  fsize INT DEFAULT 0,
  fdown INT DEFAULT 0,
  ftype VARCHAR (10)
);
-- gallery
CREATE TABLE gallery (
  gno int PRIMARY KEY auto_increment,
  title VARCHAR (50) not null,
  userid VARCHAR (18) not null,
  regdate datetime DEFAULT CURRENT_TIMESTAMP,
  thumbup INT DEFAULT 0,
  views INT DEFAULT 0,
  contents mediumtext not null,
  fname1 VARCHAR (50),
  fname2 VARCHAR (50),
  fname3 VARCHAR (50)
);

