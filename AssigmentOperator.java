public class AssigmentOperator {
    public static void main(String[] args) {
        int num = 10;

        num += 5; 
        System.out.println("After add +=: " + num);

        num -= 3;
        System.out.println("After sub -=: " + num);

        num *= 2; 
        System.out.println("After mul *=: " + num);

        num /= 4; 
        System.out.println("After div /=: " + num);

        num %= 2; 
        System.out.println("After remai %=: " + num);
    }
}
