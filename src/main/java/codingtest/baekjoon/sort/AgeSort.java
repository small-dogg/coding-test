package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/10814

import java.util.*;

public class AgeSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Person[] p = new Person[N];

        for (int i = 0; i < N; i++)
            p[i] = new Person(in.nextInt(), in.next());

        Arrays.sort(p, Comparator.comparingInt(o -> o.age));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++)
            sb.append(p[i]);

        System.out.println(sb);


    }

    public static class Person {
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }

    }
}
