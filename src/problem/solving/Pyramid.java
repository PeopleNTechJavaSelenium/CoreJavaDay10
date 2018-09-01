package problem.solving;

public class Pyramid {
    public static void main(String[] args) {
        int level = 100;
        for(int i=0; i<level; i++){
            for(int j=0; j<level-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
