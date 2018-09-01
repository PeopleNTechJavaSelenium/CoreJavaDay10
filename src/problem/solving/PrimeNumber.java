package problem.solving;

public class PrimeNumber {
    public static void main(String[] args) {
        int counter = 0;
        for(int i=2; i<100; i++){
            if(i==2){
                System.out.println(i);
            }else{
                if(isPrime(i)){
                    counter++;
                    System.out.println(i);
                }else{
                    //System.out.println("Non-Prime: " + i);
                }
            }
        }
        System.out.println("Total Number of Prime Numbers So Far: " + counter);
    }

    public static boolean isPrime(int n){
       if(n%2==0)return false;
       for(int i=3; i*i<=n; i+=2){
           if(n%i==0) return false;
       }
       return true;
    }
}
