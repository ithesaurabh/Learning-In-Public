package Stacks;

import java.util.Stack;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(4);
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(1);

        stack2.push(2);
        stack2.push(1);
        stack2.push(8);
        stack2.push(5);

        System.out.println(game(stack1, stack2, 0, 10, 0));

        
    }
    static int game(Stack<Integer> stack1,Stack<Integer> stack2, int sum, int max, int count){
        if(sum > max || stack1.isEmpty() || stack2.isEmpty()){
            return count;
        }
        int popped1 = stack1.pop();
        int popped2 = stack2.pop();
        int ifFirstPopped = game(stack1,stack2, (sum + popped1), max, count+1);
        stack1.push(popped1);
        int ifSecondPopped = game(stack1,stack2, (sum + popped2), max, count+1);
        stack2.push(popped2);   

        return Math.max(ifFirstPopped,ifSecondPopped); 
    }
    static int game2(Stack<Integer> stack1, Stack<Integer> stack2, int sum, int max, int count) {
        if (sum > max || stack1.isEmpty() || stack2.isEmpty()) {
            return count;
        }
    
        int ifFirstPopped = Integer.MIN_VALUE;
        if (!stack1.isEmpty()) {
            int popped1 = stack1.pop();
            ifFirstPopped = game(stack1, stack2, sum + popped1, max, count + 1);
            stack1.push(popped1); // Restore the popped element
        }
    
        int ifSecondPopped = Integer.MIN_VALUE;
        if (!stack2.isEmpty()) {
            int popped2 = stack2.pop();
            ifSecondPopped = game(stack1, stack2, sum + popped2, max, count + 1);
            stack2.push(popped2); // Restore the popped element
        }
    
        return Math.max(ifFirstPopped, ifSecondPopped);
    }
    
}
