// package ch00;

// import lombok.Getter;
// import lombok.ToString;

// class Animal {
//     protected String name;
// }

// @ToString
// @Getter
// class Cat extends Animal {
    
//     public Cat(String name) {
//         this.name = name;
//     }

//     public void cry() {
//         System.out.println("야옹");
//     }
// }

// public class Study08 {
//     public static void main(String[] args) {
//         Cat cat = new Cat("dd");

//         cat.cry();

//         // 조상 클래스로 캐스팅 하는 것을 업캐스팅 이라고 한다
//         Animal animal = (Animal) cat;

//         // 자손이 cry를 가지고 있더라도
//         // 업케스팅 시 사용할 수 없다
//         // animal.cry();

//         // 자손 클래스로 캐스팅 하는 것을 다운캐스팅 이라고 한다
//         Cat cat1 = (Cat) animal;

//         cat1.cry();

//         System.out.println(cat1);

//         Animal animal2 = new Animal();
        
//         // 동물인것이 갑자기 고양이가 되면 문제가 발생한다
//         Cat cat2 = (Cat) animal2;

//         cat2.cry();

//     }
// }
