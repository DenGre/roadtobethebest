import java.util.Scanner;

public class breakbasic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String text = s.nextLine();
            if (text.equals("enough")){
                break;}
            else{
                System.out.println(text);
            }
        }
    }
}

