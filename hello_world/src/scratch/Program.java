package scratch;

public class Program {
    static int x = 20;
        public static void main(String args[]){
            Program pr = new Program();
            pr.x = 5;
            int y = x/pr.x;
            System.out.print("y = ");
            System.out.print(y);
        }
}

//class Program1{
//    public static void main(String args[]){
//        char s = 'a';
//        char c1 = 'A';
//        char c2 = 'b';
//        char c3 = 'B';
//
//        switch(s) {
//            case c1	: {System.out.print("A");};
//            default	: {System.out.print("default ");};
//            case c2	: {System.out.print("B");}; break;
//            case c3	: {System.out.print("C");};
//        }
//    }
//}