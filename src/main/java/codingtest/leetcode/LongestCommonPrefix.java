package codingtest.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"ca", "a"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        Arrays.sort(strs, Comparator.comparingInt(String::length));

        String result = "";

        String str = strs[0];
        for (int i = 1; i < str.length()+1; i++) {
            String substring = str.substring(0, i);

            int count=0;
            for (String s : strs) {
                if(s.startsWith(substring)){
                    count++;
                }else{
                    break;
                }
            }
            if(count==strs.length&& substring.length()>result.length()){
                result = substring;
            }
        }

        return result;
    }

//    public String longestCommonPrefix(String[] v) {
//        StringBuilder ans = new StringBuilder();
//        Arrays.sort(v);
//        String first = v[0];
//        String last = v[v.length-1];
//        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
//            if (first.charAt(i) != last.charAt(i)) {
//                return ans.toString();
//            }
//            ans.append(first.charAt(i));
//        }
//        return ans.toString();
//    }
}
