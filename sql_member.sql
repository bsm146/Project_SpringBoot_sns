CREATE TABLE account
(
  id       VARCHAR(20) NOT NULL comment '회원 아이디',
  password VARCHAR(20) NOT NULL comment '비밀번호',
  --                email varchar(50) DEFAULT NULL COMMENT '이메일',
  --                profile_picture varchar(50) DEFAULT NULL COMMENT '프로필사진',
  --                phone varchar(15) NOT NULL COMMENT '전화번호',
  --                name varchar(15) NOT NULL COMMENT '회원 이름',
  --                birthday date NOT NULL COMMENT '생년월일',
  --                introduce varchar(100) DEFAULT NULL COMMENT '자기소개',
  --                follower varchar(500) DEFAULT '' COMMENT '팔로워',
  --                follower_count int DEFAULT 0 COMMENT '팔로워 수',
  --                account_status varchar(500) DEFAULT 'no' COMMENT '계정 공개 비공개',
  PRIMARY KEY (id)
)

INSERT INTO account(id, password) VALUES('a', 'aa'), ('b', 'bb'), ('c', 'cc');