package codingtest;

public class RotationArray {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] result = new int[A.length];
        for(int i=0; i<A.length;i++){
            if(i+K>A.length-1){
                result[(i+K)%A.length] = A[i];
            }else{
                result[i+K]=A[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new RotationArray().solution(new int[]{1,3,2,54,6},3);
    }
}
