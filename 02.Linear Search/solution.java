
import java.awt.dnd.DragSourceMotionListener;
import javax.sound.sampled.SourceDataLine;


// import java.lang.annotation.Target;

public class solution{
    public static void main(String[] args) {
        int[] nums = {12,34,45,56,67,78,89,90};
        int target = 12;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);

     }

    static int LinearSearch(int[] arr , int target ) {
        if (arr.length==0) {
            return -1 ;
        }

        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if ( element == target ){
                return index ;
            }

        }

        return -1;

    }

}