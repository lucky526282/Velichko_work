package uits.jv2503;

import java.util.*;

/**
 * Created by Lucky on 13.12.2015.
 */
public class App {
    public static void main(String[] args) {
        List l= new ArrayList<String>();
        List ld= new LinkedList<String>();
        for(int i=0; i<10; i++){
            String s = "zzzzz"+i;
            l.add(s);
            String s1 = "Lucky"+i;
            ld.add(s1);
        }
        l.addAll(ld);
        Iterator i =l.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        Map<Integer,String> m = new HashMap();

        for (int j = 0;j<10; j++){
            m.put(j,"Map"+j);
        }
        for(int  j=0; j<10;j++){
            System.out.println(m.get(j));
        }
    }

}

