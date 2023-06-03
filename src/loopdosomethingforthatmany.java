import java.util.Scanner;

public class loopdosomethingforthatmany {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        int number = s.nextInt();
        int i = 0;
        do {

            System.out.println(text);
            i++;
        }
        while (number > i && number < 5);
    }


}

