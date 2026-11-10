package homeworks.bracechecker;

public class Stack {
    private int[] stack  = new int[10];
    private int tos;

    Stack(){
        tos = -1;
    }

    public void push(int item){
        if (tos == stack.length - 1){
            System.out.println("Stack is full");
            return;
        };
        stack[++tos] = item;
    }

    public int pop(){
        if (tos < 0) return 0;
        return stack[tos--];
    }

    public void print(){
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}
