import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans =new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int k=0,l=0,i=0;
        while(k<row && l<col){
            for(i=l;i<col;i++){
                ans.add(matrix[k][i]);
            }
            k++;
            for(int j=k;j<row;j++){
                ans.add(matrix[j][col-1]);
            }
            col--;
            if(k<row){
                for(i=col-1;i>=l;i--){
                    ans.add(matrix[row-1][i]);
                }
                row--;
            }
            if(l<col){
                for (i = row - 1; i >= k; i--) {
                   ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}
