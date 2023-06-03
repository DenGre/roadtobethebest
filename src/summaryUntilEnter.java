import java.util.Scanner;

public class summaryUntilEnter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (s.hasNextInt()) {
                int number = s.nextInt();
                sum = sum + number;

            } else if (s.hasNextLine()) {
                String line = s.nextLine();
                if (line.equals("ENTER"))
                    isExit = true;
            }
        }
        System.out.println(sum);
    }
}
