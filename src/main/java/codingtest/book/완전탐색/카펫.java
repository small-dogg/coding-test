package codingtest.book.완전탐색;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        for (int width = 3; width <=5000; width++) {
            for (int height = 3; height <=width; height++) {
                if ( width * 2 + (height - 2) * 2 == brown &&
                        (width - 2) * (height - 2) == yellow){
                    return new int[]{width, height};
                }
            }
        }

        return null;
    }

    //이전풀이
//     public int[] solution(int brown, int yellow) {
//         int[] answer = new int[2];

//         int sum = brown + yellow; //넓이

//         for (int i = 3; i < sum/2; i++) {
//             int j = sum / i;//가로 길이

//             if(j<3){
//                 break;
//             }

//             if(sum%i==0){
//                 int center = (i-2)*(j-2);

//                 if(center==yellow){
//                     answer[0] = j;
//                     answer[1] = i;
//                     break;
//                 }
//             }
//         }
//         return answer;
//     }
}
