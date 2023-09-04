package codingtest;

public class NotNumberSum {
    public static void main(String[] args) {
        int solution = new NotNumberSum().solution(new int[]{1,5,6,3});
        System.out.println(solution);
    }

    public int solution(int[] numbers) {
//        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
//
//        for (int number : numbers) {
//            if(integers.contains(number)){
//                integers.remove(Integer.valueOf(number));
//            }
//        }
//
//        return integers.stream().mapToInt(i->i).sum();

        int sum = 45;
        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }
}
