import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import lib.BinomialSolver;
import lib.Square;

public class Main {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }
    
    static void example1() {
        System.out.println("Example 1\n");
        try{
            BinomialSolver bs1 = new BinomialSolver(1,1,3);
            BinomialSolver bs2 = new BinomialSolver(1,2,1);
            BinomialSolver bs3 = new BinomialSolver(6,3,9);
        }
        catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }
        catch(Throwable t){
            System.err.println("Unknown error!!!");
        }
        finally {
            System.out.println("Endo of example 1.\n\n\n");
        }
    }
    
    static void example2() {
        System.out.println("Example 2\n");
        try {
            Square s = new Square("Square1", -1);
        }
        catch(IllegalArgumentException e) {
            System.err.println("Bad argument " + e.getMessage());
        }
      /*  finally {
            System.out.println("End of example2");
        }*/
    }
    
    static void example3() {
        System.out.println("Example 3\n");
        Random gen = new Random();
        
        Scanner in = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<Integer>();
        
        System.out.println("How many numbers do you want to draw: ");
        int n = in.nextInt();
        
        for(int i = 0; i < n; ++i) {
            list.add(gen.nextInt(101));
        }
        
        for(int i = 0; i < list.size(); ++i) {
            System.out.println("list[" + i + "] == " + list.get(i));
        }
        
        System.out.println("Which element you looking for: ");
        int search = in.nextInt();
        
        boolean check = list.contains(search);
        
        System.out.println((check==true)?"Element exists": "Element doesn't exist");
        
        System.out.println("Type element's index to remove: ");
        int rm = in.nextInt();
        
        list.remove(rm);
        
        System.out.println("List:");
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        
        System.out.println("List's minimum value: " + min + ", List's maximum value: "
            + max);
        
        
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2){
                return i1 < i2 ? -1 : (i1 > i2) ? 1 : 0;
            }
        });
        
        System.out.println("List:");
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2){
                return i1 > i2 ? -1 : (i1 < i2) ? 1 : 0;
            }
        });
        
        System.out.println("List:");
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
    
    static void example4() {
        System.out.println("Example 4\n");
        Random gen = new Random();
        
        Scanner in = new Scanner(System.in);
        
        List<Integer> list = new LinkedList<Integer>();
        
        System.out.println("How many numbers do you want to draw: ");
        int n = in.nextInt();
        
        for(int i = 0; i < n; ++i) {
            list.add(gen.nextInt(101));
        }
        
        for(int i = 0; i < list.size(); ++i) {
            System.out.println("list[" + i + "] == " + list.get(i));
        }
        
        System.out.println("Which element you looking for: ");
        int search = in.nextInt();
        
        boolean check = list.contains(search);
        
        System.out.println((check==true)?"Element exists": "Element doesn't exist");
        
        System.out.println("Type element's index to remove: ");
        int rm = in.nextInt();
        
        list.remove(rm);
        
        System.out.println("List:");
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        
        Integer min = Collections.min(list);
        Integer maxi = Collections.max(list);
        
        System.out.println("List's minimum value: " + min + ", list's maximum value: "
            + maxi);
        
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2){
                return i1 < i2 ? -1 : (i1 > i2) ? 1 : 0;
            }
        });
        
        System.out.println("List:");
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2){
                return i1 > i2 ? -1 : (i1 < i2) ? 1 : 0;
            }
        });
        
        System.out.println("List:");
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        
        Set s = new HashSet(list);
        
        System.out.println("Set: ");
        
        for(Iterator<Integer> it = s.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        
        System.out.println("Type element to remove: ");
        int rm2 = in.nextInt();
         Predicate<Integer> rmv = (Integer i) -> i.intValue() == rm2;
        
        s.removeIf(rmv);

        for(Iterator<Integer> it = s.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
