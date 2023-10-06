package codingtest.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        new AddBinary().addBinary("0", "0");
    }

    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        char[] cArr1;
        char[] cArr2;
        if (a.length() >= b.length()) {
            cArr1 = a.toCharArray();
            cArr2 = b.toCharArray();
        } else {
            cArr2 = a.toCharArray();
            cArr1 = b.toCharArray();
        }

        int[] result = new int[cArr1.length + 1];
        for (int i = 0; i < cArr1.length; i++) {
            int sum;
            if (cArr2.length - 1 >= i) {
                sum = Integer.parseInt(cArr1[i] + "") + Integer.parseInt(cArr2[i] + "");
            } else {
                sum = Integer.parseInt(cArr1[i] + "");
            }
            if (sum >= 2) {
                result[i] = sum - 2;
                if (cArr1.length - 1 == i) {
                    result[i + 1] = 1;
                } else {
                    cArr1[i + 1] += 1;
                }
            } else {
                result[i] = sum;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1 && result[i] == 0) break;
            sb.append(result[i]);
        }
        return sb.reverse().toString();
    }

    public String addBinary2(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1)
        {
            if(i >= 0)
                carry += a.charAt(i--) - '0';
            if(j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
