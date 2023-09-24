package codingtest.programmers;

//brown의 약수 중, 가로길이가 세로이상인 경우(에라토스테네스 체)
//노란색 영역이 존재하기 위해서는 가로길이 세로길이 모두 3이상
//노란색 영역이 가운데 들어가므로 브라운 가로-2*세로-2= 노란색
public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[1];

        int sum = brown + yellow; //넓이

        for (int i = 3; i < sum/2; i++) {
            int j = sum / i;//가로 길이

            if(j<3){
                break;
            }

            if(i%sum==0){
                int center = (i-2)*(j-2);

                if(center==yellow){
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }

    public int[] solution2(int brown, int red) {
        int a = (brown+4)/2;
        int b = red+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }



    public static void main(String[] args) {
        new Carpet().solution(8, 1);
    }
}
