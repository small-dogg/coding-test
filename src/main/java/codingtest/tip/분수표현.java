package codingtest.tip;

public class 분수표현 {
    // 분수 약분 함수 (Reduce a Fraction)
    // 분자 분모를 입력받아, 약분 후, 분자 분모가 든 배열을 반환
    public static int[] reduceFraction(int bunja, int bunmo) {
        int[] frac = new int[2];
        frac[0] = bunja;
        frac[1] = bunmo;

        if (frac[1] == 0) { // 분모가 0일 경우에 에러 반환
            frac[0] = 0;
            frac[1] = 0;
            return frac;
        }

        int gcd_result = gcd(frac[0], frac[1]);

        frac[0] = frac[0] / gcd_result;
        frac[1] = frac[1] / gcd_result;

        return frac;
    }

    // 최대 공약수 계산 메서드
    // (Euclidean Algorithm; Euclid's Algorithm)
    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return Math.abs(a);
    }
}
