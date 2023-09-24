package codingtest.programmers;

public class Sosu {
    public static void main(String[] args) {
        new Sosu().solution(	new int[]{1, 2, 3, 4});
    }

    public int solution(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int data = nums[i] + nums[j] + nums[k];
                    System.out.print(data+":");
                    boolean a = isSosu(data);
                    if(a)result++;
                    System.out.println(a);
                }
            }
        }
        return result;
    }

    public boolean isSosu(int data){
        if(data<2){
            return false;
        }

        if(data==2){
            return true;
        }

        for (int i = 2; i < data; i++) {
            if((data%i)==0){
                return false;
            }
        }
        return true;
    }
}
