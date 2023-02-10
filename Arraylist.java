import java.util.*;
public class Arraylist {


    public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();
            list.add("Aditya");
            list.add("Sandeep");
            list.add("Rahul");
            list.add("Ajay");

            Iterator itr=list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list.size());

        ArrayList<String> l1=new ArrayList<String>();
        l1.addAll(list);
        System.out.println(l1.size());

        System.out.println(Collections.max(list));

        System.out.println(Collections.min(list));
        }
    }

