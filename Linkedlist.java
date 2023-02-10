import java.util.*;
public class Linkedlist{
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Aditya");
        al.add("vivek");
        al.add("rahul");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.remove(1));
        System.out.println(al.size());

        ArrayList<String> l1=new ArrayList<String>();
        l1.addAll(al);
        System.out.println(l1.size());

        System.out.println(Collections.max(al));

        System.out.println(Collections.min(al));
    }
}
