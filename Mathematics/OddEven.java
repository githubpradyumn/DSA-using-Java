public class OddEven {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(ans(n));
        // if (n%2==0){
        //     System.out.println("No. is even");
        // } else {
        //     System.out.println("No. is odd ");
        // }
    }
    static boolean ans (int n){
        return (n & 1) == 1 ;
    }
}
