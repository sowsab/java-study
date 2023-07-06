// package ch11;

// import java.util.Stack;

// public class S05 {
//     public static void main(String[] args) {
        
//         Stack<String> stack = new Stack<String>();
//         // 밀어넣다
//         stack.push("사과");
//         stack.push("바나나");
//         stack.push("멜론");

//         // 정렬이 되어있다
//         System.out.println(stack);

//         // 나중에 들어간 순서대로 빼기에 순서가 중요하지 않다
//         stack.pop();

//         System.out.println(stack);

//         System.out.println(stack.capacity());
        
//         stack.push("오렌지");
//         stack.push("오렌지");
//         stack.push("오렌지");
//         stack.push("오렌지");
//         stack.push("오렌지");
//         stack.push("오렌지");
//         stack.push("오렌지");
//         stack.push("오렌지");
//         stack.push("포도");
        
//         // 스택에 얼마나 들어갈 수 있는지 알려줌
//         // 따로 스택 용량을 지정하지 않고 스택 용량을 넘기면 확장되는거 같음
//         System.out.println(stack);

//         System.out.println(stack.capacity());

//         // 먼저 사라질 데이터를 보여줌
//         System.out.println(stack.peek());

//         // 데이터의 위치 변경
//         stack.setElementAt("포도", 0);
//         System.out.println(stack);

//     }
// }
