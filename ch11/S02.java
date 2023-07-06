// package ch11;

// import java.util.ArrayList;
// import java.util.List;

// public class S02 {
//     public static void main(String[] args) {
        
//         List<String> list = new ArrayList<String>();

//         System.out.println(list.size());

//         list.add("바나나");

//         System.out.println(list.size());

//         System.out.println(list);

//         list.add("사과");
//         list.add("바나나");

//         // add한 순서대로 정렬이 되어 있다
//         System.out.println(list);

//         // get으로 데이터를 불러온다
//         System.out.println(list.get(1));
        
//         // set으로 리스트의 데이터를 바꾼다
//         list.set(1, "멜론");
        
//         System.out.println(list.get(1));
        
//         // remove로 리스트의 데이터를 삭제한다
//         list.remove(0);
        
//         System.out.println(list);

//         // java.util.ArrayList$
//         System.out.println(list.iterator());

//         // 비어있는지 확인
//         System.out.println(list.isEmpty());

//         // 리스트내 데이터 제거
//         list.clear();

//         System.out.println(list);

//     }
// }
