CREATE TABLE board
(
  id         INT auto_increment comment '글 번호',
  writer     VARCHAR(20) NOT NULL comment '글 작성자',
  content    VARCHAR(20) NOT NULL comment '글 내용',
  write_date DATETIME DEFAULT Now() comment '글 작성 날짜',
  like_count INT DEFAULT 0 comment '글 좋아요 수',
  photo      VARCHAR(200) DEFAULT '' comment '글 사진 주소',
  PRIMARY KEY(id)
);

INSERT INTO board(writer, content) VALUES('1', '1'), ('2', '2'), ('3', '3');
DELETE FROM board;
DROP TABLE board;
