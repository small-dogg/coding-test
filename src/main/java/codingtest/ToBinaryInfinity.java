package codingtest;

public class ToBinaryInfinity {
    public int[] solution(String s) {
        int[] answer = {};

        int zeroCnt=0;
        int transCnt=0;
        while(!s.equals("1")) {
            transCnt++;

            StringBuilder tmp= new StringBuilder();
            for (String str:s.split("")){
                if(str.equals("0")){
                    zeroCnt++;
                }else{
                    tmp.append(str);
                }
            }
            s = Integer.toBinaryString(tmp.length());
        }

        return new int[]{transCnt,zeroCnt};
    }

    public int[] solution2(String s) {
        int[] answer = new int[2];
        int temp;
        while( !s.equals("1") ) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            temp = s.length();
            s = Integer.toBinaryString(temp);
            //System.out.println("s : " + s );
            answer[0]++;
            answer[1] -= temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        new ToBinaryInfinity().solution("110010101001");
    }
}
