import java.util.*;
public class Vectorlist{
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Aditya");
        v.add("Ajay");
        v.add("Rahul");
        v.add("Sandeep");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(v.get(0));
        System.out.println(v.get(1));
        System.out.println(v.isEmpty());
        System.out.println(v.size());
        System.out.println(v.remove(1));
        System.out.println(v.size());

        ArrayList<String> l1=new ArrayList<String>();
        l1.addAll(v);
        System.out.println(l1.size());

        System.out.println(Collections.max(v));

        System.out.println(Collections.min(v));
    }
}