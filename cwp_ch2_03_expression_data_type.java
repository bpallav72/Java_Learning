public class cwp_ch2_03_expression_data_type {
    public static void main(String[] args) {
        int a = 3;
        int c = 4;
        float b = 3.2f + a;
        System.out.println(b);
        // INCREMENT AND DECREMENT OPERATORS
        int i = 56;
        // int b = i++; // first b is assigned i then i is incremented
        // int b = ++i; // first i is incremented then c is assigned i
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        System.out.println(++y * 8);
        char ch = 'b';
        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println(ch);
    }
}
