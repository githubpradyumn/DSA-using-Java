public class Uniquenum {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(ans(n));
    }
    static boolean ans (int n){
        return (n & 1) == 1 ;
    }
}
