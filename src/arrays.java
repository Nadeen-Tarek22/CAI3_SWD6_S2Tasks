import java.sql.Array;

public class arrays {
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5};
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("the new array is : ");
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println("The max num is: " + max);

    }
}
