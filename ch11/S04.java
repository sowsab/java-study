// package ch11;

// import java.util.HashMap;
// import java.util.Map;

// public class S04 {
//     public static void main(String[] args) {
        
//         Map<String, String> map = new HashMap<String, String>();

//         map.put("사과", "3개");
//         map.put("바나나", "1개");
//         map.put("멜론", "2개");

//         System.out.println(map);

//         // get에 key 값을 넣으면 value 값이 나온다
//         System.out.println(map.get("사과"));

//         // remove에 key 값을 넣으면 삭제된다
//         map.remove("멜론");

//         // 이름과 값 둘다 중요할 때 사용한다
//         System.out.println(map);

//         // 해당 key값의 기존 value를 입력한 새value로 바꾸는것
//         map.replace("사과", "3개", "2개");

//         System.out.println(map);

//     }
// }
