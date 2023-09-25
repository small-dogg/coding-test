package codingtest.programmers.book.우선순위큐;

import java.util.PriorityQueue;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        new 이중우선순위큐().solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
    }

    private static class DoublyPriorityQueue {
        private int size = 0;
        private final PriorityQueue<Integer> minPq = new PriorityQueue<>();
        private final PriorityQueue<Integer> maxPq = new PriorityQueue<>((a, b) -> b - a);

        public void add(int value) {
            minPq.add(value);
            maxPq.add(value);
            size++;
        }

        public int max() {
            if (size == 0) return 0;
            return maxPq.peek();
        }

        public int min() {
            if (size == 0) return 0;
            return minPq.peek();
        }

        public void removeMax() {
            if (size == 0) return;
            maxPq.poll();
            if (--size == 0) {
                minPq.clear();
                maxPq.clear();
            }
        }

        public void removeMin() {
            if (size == 0) return;
            minPq.poll();
            if (--size == 0) {
                minPq.clear();
                maxPq.clear();
            }
        }

    }

    public int[] solution(String[] operations){
        DoublyPriorityQueue dpq = new DoublyPriorityQueue();

        for (String operation : operations) {
            String[] s = operation.split(" ");
            String command = s[0];
            String value = s[1];

            switch(command){
                case "I":
                    dpq.add(Integer.parseInt(value));
                    break;
                case "D":
                    if(value.equals("1")){
                        dpq.removeMax();
                    }else {
                        dpq.removeMin();
                    }
            }
        }

        return new int[]{dpq.max(), dpq.min()};
    }
}
