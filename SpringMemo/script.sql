-- 메모 테이블
create table tblMemo (
    seq number primary key, --메모번호(PK)
    name varchar2(30) not null, --작성자
    memo varchar2(1000) not null, --메모
    regdate date default sysdate not null, --시간
    category varchar2(50) not null --분류
);

create sequence memo_seq;
drop sequence memo_seq;