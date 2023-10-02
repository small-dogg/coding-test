package codingtest.leetcode;

public class RomanToInteger {
    public static void main(String[] args) {
        new RomanToInteger().romanToInt("III");
    }

    private static final String symbols = "IVXLCDM";
    private static final int[] values = new int[]{1, 5, 10, 50, 100, 500, 1000};

    public int romanToInt(String s) {
        int result = 0;

        char[] cArr = s.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            if (i < cArr.length - 1 && symbols.indexOf(cArr[i]) < symbols.indexOf(cArr[i + 1])) {
                result += values[symbols.indexOf(cArr[i + 1])] - values[symbols.indexOf(cArr[i])];
                i++;
            } else {
                result += values[symbols.indexOf(cArr[i])];
            }
        }

        return result;
    }
}

//    public int romanToInt(String s) {
//        Map<Character, Integer> m = new HashMap<>();
//
//        m.put('I', 1);
//        m.put('V', 5);
//        m.put('X', 10);
//        m.put('L', 50);
//        m.put('C', 100);
//        m.put('D', 500);
//        m.put('M', 1000);
//
//        int ans = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
//                ans -= m.get(s.charAt(i));
//            } else {
//                ans += m.get(s.charAt(i));
//            }
//        }
//
//        return ans;
//    }
