import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
       ArrayList<Integer>arr = new ArrayList<>();
       Random ran = new Random();
       int count = 0;
       int counter = 0;
       int plus = 0;
       while (count<=400){
           int randomZero = ran.nextInt(100);
           arr.add(randomZero);
           count++;
       }
        for (int i = 0; i <= arr.size(); i++) {
        int p = arr.get(plus);
        counter += p;
        }
        Set<Integer>set = new HashSet<>();
        set.add(counter);
        System.out.println(set);
    }
}