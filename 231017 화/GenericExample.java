package org.study.run.exam1;

public class GenericExample {
    public static void main(String[] args) {
        //Box<String> box1 = new Box<String>();
        Box<String> box1 = new Box<>();  // 제네릭 클래스 "Box"를 사용하여 문자열을 저장할 "box1" 생성
        box1.content = "안녕하세요.";  // box1에 "안녕하세요" 문자열 저장
        String str = box1.content;  // box1에서 내용을 읽어와 str 변수에 저장
        System.out.println(str);  // str 변수의 내용 출력 (출력 결과 : 안녕하세요)

        //Box<Integer> box2 = new Box<Integer>();
        Box<Integer> box2 = new Box<>();  // 제네릭 클래스 Box를 사용하여 정수를 저장할 box2 생성
        box2.content = 100;  // box2에 정수 100 저장
        int value = box2.content;  // box2에서 내용을 읽어와 정수형 변수 value에 저장
        System.out.println(value);
    }
}
