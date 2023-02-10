import java.util.*;
public class Hashset{
    public static void main(String args[]){

        HashSet<String> set=new HashSet<String>();
        set.add("Aditya");
        set.add("Rahul");
        set.add("kishan");
        set.add("Ajay");

        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

       // System.out.println(set.get(0));
        //System.out.println(set.get(1));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.remove(1));
        System.out.println(set.size());

        ArrayList<String> l1=new ArrayList<String>();
        l1.addAll(set);
        System.out.println(l1.size());

        System.out.println(Collections.max(set));

        System.out.println(Collections.min(set));
    }
}