import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        ArrayList<Integer>ints = new ArrayList<>();
        ArrayList<Integer>tak = new ArrayList<>();
        ArrayList<Integer>jup = new ArrayList<>();
        int[]array = {30, 49, 74, 9, 5, 60, 62, 35, 93, 16, 84, 73, 48, 93, 85, 3, 63, 90, 58, 99, 15, 28, 98, 2, 89, 51, 18, 6, 52, 21, 87, 20, 31, 97, 78, 58, 3, 86, 55, 88, 57, 26, 27, 45, 2, 21, 85, 97, 70, 74};
        for (Integer e:array) {
            ints.add(e);
            if (e%2==0){
                jup.add(e);
            } else if (e%2==1) {
                tak.add(e);
            }
        }
        System.out.println("all number:"+ints);
        System.out.println("tak sandar:"+tak);
        System.out.println("jup sandar:"+jup);
    }
}