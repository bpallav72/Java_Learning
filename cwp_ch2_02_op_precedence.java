public class cwp_ch2_02_op_precedence {
    public static void main(String[] args){
        // Precedence & Associativity
        /*int a = 6*5-24/4;
        System.out.println(a);
        /* Highest precedence goes to * and /. they are then evaluated on the basis of lft to right associativity.
        =30-24/4
        =30-6
        =24
         */
        /*int b = 50/2-2*3;
        System.out.println(b);
        /* =25-2*3
        = 25-6
        =19
         */
    // quick quiz
        float x = 24;
        float y = 9;
        float z = (x-y)/2;
        System.out.println(z);

        int b = 8;
        int a = 2;
        int c = 3;
        int k = (b*b - 4*a*c)/(2*a);
        System.out.println(k);
    }
}
