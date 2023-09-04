package codingtest.tip;

public class 소수여부 {
    public int isPrime1(int n) {
        if(n==1){
            return 0;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean isPrime2(int n) {
        if(n==1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
