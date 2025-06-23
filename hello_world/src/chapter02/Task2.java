package chapter02;

public class Task2 {

    public static void main(String[] args) {
        // must show the following output: H3110 w0r1d 2.0 true
        char ltr1 = 'H';
        short num1 = 3;
        int num2 = 11;
        byte num3 = 0;
        String world = " w0r1d";
        char space = ' ';
        float num6 = 2.0f;
        boolean x = true;
        String output = String.valueOf(ltr1)+(short)num1+(int)num2+(byte)num3+world+(char)space+(float)num6+(char)space+(boolean)x;
        System.out.println(output);
    }
}
