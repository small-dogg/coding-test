package codingtest.programmers;

public class BinaryGap {

        public int solution(int N) {
            // write your code in Java SE 8
            String binaryString = Integer.toBinaryString(N);
            return countGap(binaryString);
        }

        public int countGap(String binaryString){
            char[] chars = binaryString.toCharArray();
            int max = 0;
            int cnt = 0;
            boolean toggle=false;
            for (int i = 0; i < chars.length-1; i++) {
                if(chars[i]!=chars[i+1]){
                    if(cnt>max){
                        max=cnt;
                    }
                    continue;
                }
                cnt++;
            }
            return max;
        }
}
