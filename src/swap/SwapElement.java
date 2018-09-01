package swap;

public class SwapElement {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int temp ;
        System.out.println("before swapping");
        System.out.println("Num 1 : " + num1);
        System.out.println("Num 2 : " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("after swapping");
        System.out.println("Num 1 : " + num1);
        System.out.println("Num 2 : " + num2);
    }



}
