package support;

public class Loops {
    public static void main(String[] args) {

//        int x = 0;
//        while (x < 100) {
//            System.out.println("The value of x: " + x);
//            x++;
//        }
//
//        for (int y = 0;y < 100;y++) {
//            System.out.println("The value of y: " + y);
//        }

        String[] strings = new String[5];
        strings[0] = "1";
        strings[1] = "2";
        strings[2] = "3";
        strings[3] = "4";
        strings[4] = "5";

        for (int i = 0; i < strings.length; i++) {
            System.out.println("Array value: " + strings[i]);
        }
    }
}
