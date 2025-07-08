class Stack{
    int[] stck;
    int tos;

    Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    // push operation in stack
    void push(int item){
        if(tos == stck.length - 1){
            System.out.println("Stack is full.");
        }
        else {
            stck[++tos] = item;
        }
    }

    int pop(){
        if(tos < 0){
            System.out.println("Stack underflow.");
            return 0;
        }
        else {
            return stck[tos--];
        }

    }
}


public class o43_stack {
    public static void main(String[] args){
        Stack mystack1 = new Stack(10);
        Stack mystack2 = new Stack(10);

        // push some numbers onto the stack
        for(int i = 0; i < 10; i++){
            mystack1.push(i);
        }

        for (int i = 10; i < 20; i++){
            mystack2.push(i);
        }
    }
}
