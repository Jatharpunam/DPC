public class LCMCalculator {

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        System.out.println(lcm(4, 6));           
        System.out.println(lcm(5, 10));          
        System.out.println(lcm(7, 3));           
        System.out.println(lcm(1, 987654321));   
        System.out.println(lcm(123456, 789012)); 
    }
}
