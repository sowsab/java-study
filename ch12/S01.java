// package ch12;

// // 제네릭
// class Num <T extends Number> {
//     // 필드가 정수가 일수도 있고 실수 일수도 있을 경우
//     T value;

//     public Num(T value) {
//         this.value = value;
//     }
// }

// public class S01 {
//     public static void main(String[] args) {
//         // 데이터 타입을 참조형으로 불러와야한다
//         // 알아서 판단한다
//         // 데이터 타입을 앞뒤로 적는것이 좋다
//         Num<Long> num = new Num<Long>(1L);
//     }
// }
