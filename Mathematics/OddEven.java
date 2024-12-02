public class OddEven {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,5,8,6,4,2};
        System.out.println(solution(arr));
    } 
    static int solution(int[] arr){
        int num = 0;
        for (int i : arr) {
            num ^= i;
        }
        return num;
    }
    
}
