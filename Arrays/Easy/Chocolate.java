package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class Chocolate {

    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        int min=Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0;i<=n-m;i++){
            min=Math.min(min,a.get(i+m-1)-a.get(i));
        }
        return min;
    }
}

