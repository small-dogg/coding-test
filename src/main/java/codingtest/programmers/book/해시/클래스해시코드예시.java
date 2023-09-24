package codingtest.programmers.book.해시;

import java.util.HashSet;

public class 클래스해시코드예시 {
    public static class Coord{
        public final int x;
        public final int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            //String 형으로 변경하여 hasCode 내장 함수를 사용
            return (x + "," + y).hashCode();
        }

        //hasCode가 같더라도 equals가 다르기때문에 해시 충돌로 간주할 수 있어, equals도 함께 구현
        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Coord)) return false;
            Coord o = (Coord) obj;
            return x == o.x && y == o.y;
        }
    }

    public static void main(String[] args) {
        HashSet<Coord> coordSet = new HashSet<>();

        Coord coord1 = new Coord(1, 2);
        coordSet.add(coord1);
        Coord coord2 = new Coord(1, 2);

        System.out.println(coordSet.contains(coord1));
        System.out.println(coordSet.contains(coord2));
    }
}
