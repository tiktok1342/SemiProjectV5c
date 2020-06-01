INSERT INTO board (title, userid, contents)
VALUE ('테스트입니다','xyz987','후훗');

INSERT INTO board (title, userid, contents)
VALUE ('시험용데이터입니다','abc123','후훗2');

INSERT INTO board (title, userid, contents)
VALUE ('연습용입니다','stu642','');

-- 페이징 SQL문 : limit by
-- 첫 번째 게시물을 기준으로
-- 10-1만큼 게시물을 추출해서 출력
SELECT bno,title,userid,regdate,views FROM board
order by bno desc limit by 0, 10; -- 1page

SELECT bno,title,userid,regdate,views FROM board
order by bno desc limit by 10, 10; -- 2page

SELECT bno,title,userid,regdate,views FROM board
order by bno desc limit by 20, 10; -- 3page

--SELECT bno,title,userid,regdate,views FROM board
--order by bno desc limit by startNum, 10
-- cp : 1, perpage : 10
-- startNum? : startNum = (cp - 1) * perPage

select count(bno) bdcnt from board;

