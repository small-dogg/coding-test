package codingtest.programmers.book.트라이;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가사검색 {
    private static class Node {
        private final Map<Integer, Integer> terminals = new HashMap<>();// ? 개수별로 완성되는 단어의 개수
        private final Map<Character, Node> children = new HashMap<>();// 자식노드

        //문자와 단어 내 캐릭터의 위치를 나타내는 오프셋
        public void add(String word, int offset) {
            int length = word.length() - offset; // 단어가 완성되기까지 추가로 필요한 문자 개수
            terminals.put(length, terminals.getOrDefault(length, 0) + 1);

            //아직 문자의 오프셋 기준으로 뒤에 문자가 남아있다면, 더이상 남아있지 않을때까지 노드를 추가
            if (length > 0) {
                char c = word.charAt(offset);
                Node child = children.getOrDefault(c, new Node());
                child.add(word, offset + 1);
                children.put(c, child);
            }
        }

        public int count(String query, int offset) {
            char c = query.charAt(offset);
            if (c == '?') {
                return terminals.getOrDefault(query.length() - offset, 0);
            }
            if (!children.containsKey(c)) return 0;

            return children.get(c).count(query, offset + 1);
        }
    }

    private int count(String query, Node trie, Node reversedTrie) {
        if (query.startsWith("?")) {
            return reversedTrie.count(new StringBuilder(query).reverse().toString(), 0);
        }

        return trie.count(query, 0);
    }

    public int[] solution(String[] words, String[] queries) {
        Node trie = new Node();
        Node reversedTrie = new Node();

        for (String word : words) {
            trie.add(word, 0);
            reversedTrie.add(new StringBuilder(word).reverse().toString(), 0);
        }

        return Arrays.stream(queries)
                .mapToInt(query -> count(query, trie, reversedTrie))
                .toArray();
    }
}
