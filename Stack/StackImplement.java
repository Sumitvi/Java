import java.util.ArrayList;

class Stack{

    ArrayList<Integer> list = new ArrayList<>();

    // IsEmpty

    public boolean IsEmpty(){
        return list.size()==0;
    }

    // push
    public void push(int data){

        list.add(data);

    }

    // pop

    public int pop(){

        if(IsEmpty()){
            return -1;

        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    // Peek

    public int peek(){

        if(IsEmpty()){
            return -1;

        }

        int top = list.get(list.size()-1);
        return top;

    }



}



public class StackImplement{
    public static void main(String args[]){

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.IsEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }

    }
}