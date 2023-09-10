package codingtest.book.해시;

import java.util.HashSet;

public class 클래스예시 {
    public static class Coord{
        public final int x;
        public final int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        HashSet<Coord> coordSet = new HashSet<>();

        Coord coord1 = new Coord(1, 2);
        coordSet.add(coord1);
        Coord coord2 = new Coord(1, 2);

        //해시 함수를 작성하지 않아 서로 다른 객체로 인식.
        //기본적으로 할당된 주소값을 해시값으로 가지기 때문
        System.out.println(coordSet.contains(coord1));
        System.out.println(coordSet.contains(coord2));
    }
}
