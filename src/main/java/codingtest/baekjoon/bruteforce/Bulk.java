package codingtest.baekjoon.bruteforce;

//https://www.acmicpc.net/problem/7568

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bulk {
    static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            personList.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();
        for (Person person : personList) {
            int rank = 1;
            for (Person person1 : personList) {
                if (person.height < person1.height && person.weight < person1.weight) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }

    private static class Person {
        private int height;
        private int weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }
}