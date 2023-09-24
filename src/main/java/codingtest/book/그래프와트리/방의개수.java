package codingtest.book.그래프와트리;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 방의개수 {

    //방 생성 조건 : 기존에 방문했던 정점을 새로운 간선을 통해 방문할 때
    //대각선과 대각선의 교차점이 있을 때 총 2개의 방이 생성됨.(모래시계 모양) - 정점 세분화 필요



    //정점을 표현하는 클래스
    private static class Vertex {
        public final int x;
        public final int y;
        public final String id;
        public final Set<String> connectedVertices;

        public Vertex(int x, int y) {
            this.x = x;
            this.y = y;
            this.id = id(x, y);
            this.connectedVertices = new HashSet<>();//연결된 간선정보를 Set으로 관리
        }

        public static String id(int x, int y) {
            return String.format("(%d, %d)", x, y);
        }
    }

    //8방
    private static final int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    private static final int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public int solution(int[] arrows) {
        int count = 0;
        //좌표 ID를 Key로 하는 Vertex 맵
        Map<String, Vertex> vertices = new HashMap<>();

        //개수 세기

        //원점 출발
        Vertex v = new Vertex(0, 0);
        vertices.put(v.id, v);

        //입력받은 방향들을 순회하며 이동한 좌표와 해당 좌표의 id를 구함
        for (int d : arrows) {
            //모래시계와 같은 형태로 대각선으로 이동했을 때, 방이 생성되는 케이스를 처리하기 위해 이동로직을 두번 반복할 수 있게 처리
            for (int i = 0; i < 2; i++) {
                int x = v.x + dx[d];
                int y = v.y + dy[d];
                //입력받은 방향의 정점 ID
                String id = Vertex.id(x, y);

                //기존에 해당 좌표를 방문한 적이 없다면 새로운 정점 객체를 생성한후 vertices에 추가
                if (!vertices.containsKey(id)) {
                    vertices.put(id, new Vertex(x, y));
                }
                //방문한 적이 있다면 간선의 존재 유무를 확인. 기존에 간선이 없었다면 새로운 방이 생성될 수 있음
                else if (!v.connectedVertices.contains(id)) {
                    count++;
                }

                //검사가 끝난 후, 간선을 이어주고 새로운 좌표로 이동
                Vertex u = vertices.get(id);
                v.connectedVertices.add(u.id);
                u.connectedVertices.add(v.id);
                v = vertices.get(id);
            }
        }

        return count;
    }
}
