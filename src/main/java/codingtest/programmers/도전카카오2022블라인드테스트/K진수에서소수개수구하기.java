package codingtest.programmers.도전카카오2022블라인드테스트;

//92335
public class K진수에서소수개수구하기 {

    private boolean isPrime(long x){
        if(x<= 1) return false;

        for (long i = 2; i * i <=x; i++) {
            if(x%i == 0) return false;
        }
        return true;
    }
    public int solution(int n, int k) {
        int result = 0;

        String[] string = Long.toString(n, k).split("0+");
        for (String s : string) {
            if(isPrime(Long.parseLong(s))){
                result++;
            }
        }

        return result;
    }
}

//class Solution {
//    public int solution(int n, int k) {
//        int answer = 0;
//        String s = Integer.toString(n, k);
//        String[] strArr = s.split("0");
//        for(String str:strArr){
//            if(!str.equals("")){
//                long val = Long.parseLong(str);
//                if(val>1&&isPrime(Long.parseLong(str))){
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
//    private static boolean isPrime(long n) {
//        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
