/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class TimeMeasure {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        measureTime(arrayList,"arrayList");
        
        LinkedList<Integer> linkedList= new LinkedList<>();
        measureTimeL(linkedList,"linkedList");
    }

    private static void measureTime(List<Integer> list,String decs) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++)    
            {
 list.add(0,i);
        }
            long end=System.currentTimeMillis();
            System.out.println("diff "+ (end-start));
            System.out.println("");
            
            for (int i=0;i<100000;i++){
            list.get(i);
            }
          /*  long end1=System.currentTimeMillis();
            System.out.println("diff1 "+ (end1-start));
            System.out.println("");*/
    }
    
private static void measureTimeL(LinkedList<Integer> list,String decs){
 long start = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++)    
            {
 list.add(0,i);
        }
            long end=System.currentTimeMillis();
            System.out.println("difflinked "+ (end-start));
            System.out.println("");
            
            for (int i=0;i<100000;i++){
            list.get(i);
            }
}
}
