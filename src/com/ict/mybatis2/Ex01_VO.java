package com.ict.mybatis2;

// VO(Value Object) : DB 컬럼의 정보를 담기 위한 클래스
public class Ex01_VO {
    // 반드시 컬럼명과 같은 이름으로 만들자
    
    private String idx, id, pw, username, age, regdate;

    public Ex01_VO() {}

    // numbers 테이블에 맞게 수정한 생성자
    public Ex01_VO(int idx, String id, String pw, String username, int age, String regdate) {
        this.idx = idx;
        this.id = id;
        this.pw = pw;
        this.username = username;
        this.age = age;
        this.regdate = regdate;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}
