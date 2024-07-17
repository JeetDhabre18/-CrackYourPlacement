import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
    
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                ans.add(nums[i]);
            else{
                continue;
            }
        }
        return ans;
    }
}

