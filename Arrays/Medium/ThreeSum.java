import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        //List<Integer> curr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1,k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }
                else{
                  ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;  
                    while (j < k && nums[k] == nums[k - 1]) k--;  
                    j++;
                    k--;  
                }
 
            }
            
        }
        return ans;
    }

    
}
