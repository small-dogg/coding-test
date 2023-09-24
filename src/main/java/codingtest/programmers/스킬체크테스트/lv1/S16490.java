package codingtest.programmers.스킬체크테스트.lv1;

public class S16490 {
    public static void main(String[] args) {
        new S16490().solution("10203", "15");
    }

    public int solution(String t, String p) {
        int answer = 0;

        long pLong = Long.parseLong(p);

        for (int i = 0; i < t.length()-p.length()+1; i++) {
            long i1 = Long.parseLong(t.substring(i, i + p.length()));
            if(pLong >=i1){
                answer++;
            }
        }

        return answer;
    }
}
