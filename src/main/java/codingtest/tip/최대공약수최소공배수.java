package codingtest.tip;

public class 최대공약수최소공배수 {
    static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }

    public static void main(String[] args) {
        int lcm = lcm(24, 14);
        System.out.println("lcm = " + lcm);
        System.out.print("gcd=" + gcd(24, 14));
    }
}
