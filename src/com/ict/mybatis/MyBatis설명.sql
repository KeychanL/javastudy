1.MyBatis 다운 받아서 util 폴더에 넣자
2.마이바티스 3.xxxxxxjar, pdf파일이 필요한다
프로젝트에서 마우스 오른쪽 빌드패스 ==컨피그 빌드 패스 선택
프로젝트 선택후 윈도우 프리퍼런스 메이븐 다운로드아티팩트자바디오씨
3.마이바티스는 자바진영에서 사용하는 sql프레임워크다
4.VO를 먼저 만든다
  원하는 테이블과 컬럼명이 일치 일부를 빼도 상관없고 다른 테이블의 컬럼명을 넣어도 상관없다
  config.xml을 만들자
  (참고, xml이란 확장 마크업 언어, 사용자가 태그를 만들어서 사용할 수 있다)
  다운 받은 pdf를 보면 만드는 법이 나온다
  xml파일의 첫줄은 무조건 <?xml version="1.0" encoding="UTF-8"?>
  encoding 이란 문자를 바이트코드로 변환하는것
  utf-8 전세계 언어 표현가능 유니코드
  ->오라클 접속정보 입력
  ->매퍼xml위치 지정
  
  mapper.xml을 만들자
  다운받은 pdf를 보면 만드는 법이 나온다
  mapper namespace="customer"는 mapper가 여러개일때 구분하기 위함
  자바에서 매퍼에 접근할때 네임스페이스가 지정한 매퍼이름.id로 접근한다
  매퍼는 쿼리를 사용하여 디비에 보내고 결과를 받아서 매퍼를 호출한 곳으로 결과를 되돌려보내는 역할을 한다
  태그자체에 select, insert, update, delete 태그잇다
  
5. DBService.java 만들기
=>config파일 읽어서 자바에서 MyBatis를 사용할 수 있도록 도와주는 클래스
다운받은 pdf를 보면 만드는 법이 나온다
자바에서는 sqlsession클래스를 사용한다
sqlsession클래스를 사용하기 위해서 sqlsessionfactory가 필요하다
sqlsessionFactory를 리턴해주는 클래스

6.DAO.java 만들기
DB처리하는 클래스 : DBService.getFactory()로 SqlSessionFactory를 호출하고
SqlSessionFactory를 이용해서 자바에서 사용할 수 있는 SqlSession을 만들어사용
