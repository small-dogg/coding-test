package codingtest;

public class NextBigInt {
    public int solution(int n) {
        long nOneCount = oneCounter(Integer.toBinaryString(n));
        System.out.println(nOneCount);
        int cnt=n+1;
        while(true){
            if(nOneCount==oneCounter(Integer.toBinaryString(cnt))){
                return cnt;
            }
            cnt++;
        }
    }

    public int solution2(int n) {
        int nOneCount =Integer.bitCount(n);
        int cnt=n+1;
        while(true){
            if(nOneCount==Integer.bitCount(cnt)){
                return cnt;
            }
            cnt++;
        }
    }

    public static int oneCounter(String bin){
        int cnt = 0;
        char[] binArray = bin.toCharArray();
        for(char c : binArray){
            if(c=='1'){
                cnt++;
            }
        }

        return cnt;
    }
}
