package ch03;

public class Operator {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println( (x>7) && (y<=5) );
        System.out.println((x%3) == 2);
        System.out.println((y%2) != 1);
        System.out.println( ((x%3) == 2) || ( (y%2) != 1) );
        System.out.println( ((x>7) || ( (y%2) != 1)));
    }
}
