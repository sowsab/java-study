// package ch06;

// // 고양이를 추상화
// class Cat {
//     // 필드 (객체의 속성)
//     String name;
//     int age;

//     // 생성자 (객체를 생성할 때 사용)
//     // 생성자 이름은 클래스명과 동일하게 만든다
//     // 생성자가 있어야 클래스를 인스턴스화 할 수 있다
//     // 생성자는 리턴 타입이 없다 (무조껀 void)
//     // 클래스에 아무 생성자가 없을 경우
//     // 매개변수가 없는 생성자가 기본적으로 세팅 되어 있다
//     // public Cat() {
//     //     System.out.println("내가 태어났다");
//     // }

//     // 다른 생성자를 직접 만들 경우
//     // 기본적으로 세팅 되어 있는 생성자는 없어진다
//     public Cat(String name, int age) {
//         // this는 클래스가 아니라 생성 될 인스턴스를 가리킨다
//         this.name = name;
//         this.age = age;

//         System.out.println(this.name + "가 태어났다");
//     }


//     // 길고양이
//     // 일부 데이터만 받을 수 있다
//     // 받지 않은 데이터는 개발자가 직접 초기화 해줘야 한다
//     // public Cat(int age) {
//     //     this.name = "길냥이";
//     //     this.age = age;

//     //     System.out.println(this.name + "가 태어났다");
//     // }

//     public Cat(int age) {
//         // this를 이용해서 생성자에서 다른 생성자를 불러낼 수 있다
//         // 보통은 제일 매개변수가 많은 생성자를 사용한다
//         this("길냥이", age);
//     }
//     // 베스트 답
//     public Cat() {
//         this("길냥이", 1);
//     }

//     // public Cat() {
//     //     this.name = "길냥이";
//     //     this.age = 1;
//     //     System.out.println(name + "가 태어났다");
//     // }

//     // 해답 3
//     // public Cat() {
//     // // 생성된 클래스를 조진다
//     // }

//     // 메소드 (객체의 기능)
//     public void Cry() {
//         System.out.println("애용");
//     }



    
// }

// public class S01 {
//     public static void main(String[] args) {
//         // 오브젝트는 상상 할 수 있지만 실체화 되지 않은 것 
//         Cat cat;
        
//         // new를 통해서 오브젝트에 인스턴스를 넣어 준다
//         // 생성자가 요구하는 내용대로 작성 해야한다
//         cat = new Cat("야용이", 2);
        
//         cat.Cry();

//         Cat cat2 = new Cat(1);

//         cat2.Cry();

//         // 문제
//         // 이름이 길냥이 이고 나이가 1살인 고양이를 생성 하시오
//         // 아래 빨간 줄을 없애 보세요.
//         // 괄호 안에는 값을 넣지 않습니다
//         new Cat().Cry();


//     }
// }
