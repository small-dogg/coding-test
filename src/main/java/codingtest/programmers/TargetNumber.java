package codingtest.programmers;

public class TargetNumber {
    int result = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        return result;
    }

    private void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) result++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }


    public static void main(String[] args) {
        System.out.println(new TargetNumber().solution(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(new TargetNumber().solution(new int[]{4, 1, 2, 1}, 4));
    }
}
