import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(50,150);
        int num = random.nextInt(50,150);
        int number = random.nextInt(50,150);
        int number1 = random.nextInt(50,150);
        int number2 = random.nextInt(50,150);
        int number3 = random.nextInt(50,150);
        int a = Math.max(i,num);
        int b = Math.max(number,number1);
        int c = Math.max(number2,number3);
        int d = Math.max(a,b);
        int e = Math.max(c,d);
        System.out.println(i+"\n"+num+"\n"+number1+"\n"+number2+"\n"+number3+"\n"+number);
        System.out.println("max num: "+e);
    }
}
























//        Random random = new Random();
//        int number = random.nextInt();
//        int number1 = random.nextInt();
//        int number2 = random.nextInt();
//        int number3 = random.nextInt();
//        int number4 = random.nextInt();
//        int number5 = random.nextInt();
//        boolean when = number<number1;
//        boolean how = when = true;
