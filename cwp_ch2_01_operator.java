

public class cwp_ch2_01_operator {
    public static void main(String[] args) {
        // Arthimetic operators
        int a = 4;
        int b = 7 *a;
        System.out.println(b);
        int c = 4;
        int d = 6 %c; // Modulo operator
        System.out.println(d);
        int j = 55;
        int k = 45 -j;
        System.out.println(k);
        int l = 55;
        int m = 45 + l;
        System.out.println(m);
        // assignment operators
        int ab = 9;
         ab *=4;
         // Comparison operator
        System.out.println(ab);
        System.out.println(6==7);
        System.out.println(7==7);
        System.out.println(54>5);   //comparison operator
        System.out.println(75<5);
        System.out.println(75<=4);
        System.out.println(54>=5);

    // Logical operator
        System.out.println(32>3 && 33>5);
        System.out.println(36<4 && 54<88);  // logical operators (&(AND):- both conditions
                                            // are true its always true otherwise false).
        System.out.println(45<5 || 45>5); // logical operators ( ||(OR):- both conditions are
        System.out.println(43>4 || 44>5);  // false its always false otherwise true.)



    }
}
