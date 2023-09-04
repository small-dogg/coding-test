package codingtest.tip;

//소수
public class 에라토스테네스의체 {
    public static void main(String[] args) {
        make_prime(10000);
    }
    public static void make_prime(int n) {
        boolean prime[] = new boolean[n+1];

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=n; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for (int j = i * i; j <= n; j += i){
                    prime[j] = true;
                }

            }
        }

        // 소수 출력
        for(int i=1; i<=n;i++){
            if(!prime[i]) System.out.print(i+" ");
        }
    }
}
