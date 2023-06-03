public class loop {
    public static void main(String[] args) {
        int firstLoop = 0;
        while(firstLoop<5){
            int secondLoop = 0;
            while(secondLoop<10){
                System.out.print("Q");
                secondLoop++;
            }
            System.out.println();
            firstLoop++;
        }
    }
}
