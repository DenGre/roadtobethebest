import java.util.Scanner;

public class showTheMinimum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(s.hasNextInt()){
            int number = s.nextInt();
            if(number>max && number%2==0){
                max = number;
            }
        }
        System.out.println(max);
    }
}
