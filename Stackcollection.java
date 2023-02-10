import java.util.*;
public class Stackcollection{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Aditya");
        stack.push("sandeep");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("ajay");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.remove(1));
        System.out.println(stack.size());

        ArrayList<String> l1=new ArrayList<String>();
        l1.addAll(stack);
        System.out.println(l1.size());

        System.out.println(Collections.max(stack));

        System.out.println(Collections.min(stack));
    }
}
