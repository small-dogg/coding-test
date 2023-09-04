package codingtest;
//https://school.programmers.co.kr/learn/courses/30/lessons/92335
public class KjinsuPrime {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        String[] strArr = s.split("0");
        for(String str:strArr){
            if(!str.equals("")){
                long val = Long.parseLong(str);
                if(val>1&&isPrime(Long.parseLong(str))){
                    answer++;
                }
            }
        }
        return answer;
    }
    private static boolean isPrime(long n) {
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
