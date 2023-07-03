package ch06;

class Cat {
    // static, 생성자로 생성하지 않아도 존재하는 변수
    // 객체 바깥에 있어서 this 사용 불가
    static int countCat = 0; 
    String name;

    public Cat() {
        this.name = "길고양이"; // this 붙이는 이유는 명확하게 보이기
        Cat.addCat();
    }
    
    public static void addCat() {
        Cat.countCat++;
        System.out.println("새로운 고양이가 태어났습니다");
    }
    

}

public class S04 {
    public static void main(String[] args) {
    
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();

        System.out.println("고양이의 수는 " + Cat.countCat);

    }
}
