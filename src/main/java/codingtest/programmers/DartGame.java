package codingtest.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/17682

public class DartGame {
    public int solution(String dartResult) {
        int[] point = new int[2];
        int answer = 0;
        String[] dartArray = dartResult.split("");

        String temp = "";
        int idx = 0;
        for (int i = 0; i < dartArray.length - 1; i++) {
            switch (dartArray[i]) {
                case "S":
                    idx++;
                    int val = (int) Math.pow(Integer.parseInt(temp), 1);
                    point[i] = val;
                    temp = "";
                    break;
                case "D":
                    idx++;
                    val = (int) Math.pow(Integer.parseInt(temp), 2);
                    point[i] = val;
                    temp = "";
                    break;
                case "T":
                    idx++;
                    val = (int) Math.pow(Integer.parseInt(temp), 3);
                    point[i] = val;
                    temp = "";
                    break;
                case "*":
                    point[idx - 1] *= 2;
                    if (idx > 1) {
                        point[idx - 2] *= 2;
                    }
                    break;
                case "#":
                    point[idx-1]*=-1;
                    break;
                default:
                    temp += dartArray[i];
                    break;
            }
        }

        return answer;
    }
}
