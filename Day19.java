import java.util.*;

public class PostfixEvaluator {
    public static int evaluate(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expr.split("\\s+"); 

        for (String token : tokens) {
            if ("+-*/^".contains(token)) { 
                int b = stack.pop(); 
                int a = stack.pop(); 
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break; 
                    case "^": stack.push((int) Math.pow(a, b)); break;
                }
            } else {
                stack.push(Integer.parseInt(token)); 
            }
        }

        return stack.pop(); 
    }

    public static void main(String[] args) {
        System.out.println(evaluate("5 6 +"));                    
        System.out.println(evaluate("3 4 2 * 1 5 - 2 3 ^ ^ / +")); 
        System.out.println(evaluate("-5 6 -"));                    
        System.out.println(evaluate("15 7 1 1 + - / 3 * 2 1 1 + + -")); 
        System.out.println(evaluate("5"));                         
    }
}
