public class paintingB {

    public static void main(String[] args) {
        int height = 0;
        while (height < 10) {
            int width = 0;
            while (width < 20) {
                if (width == 0 || height == 0 || width == 19 || height == 9) {
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }

                width++;
            }
            System.out.println();
            height++;
        }
    }
}





