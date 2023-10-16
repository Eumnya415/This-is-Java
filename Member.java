package ch12.sec03.exam01;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    public boolean equals(Object obj) {  //equals 메소드 재정의
        Member target;  //Member 클래스의 인스턴스인지 확인

        //obj가 null인 경우나 Member 클래스의 인스턴스가 아닌 경우 false를 반환
        return obj instanceof Member && (target = (Member)obj) == (Member)obj && this.id.equals(target.id);
        /* 위 조건이 충족된 경우, obj는 Member 클래스의 인스턴스*/
    }
}
