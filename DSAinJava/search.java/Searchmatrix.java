/**
 * 74:- leedcode solution 
 * link (https://leetcode.com/problems/search-a-2d-matrix/)
 */
public class Searchmatrix {
    
        public boolean searchMatrix(int[][] matrix, int target) {
    
            int m = matrix.length;//no of rows
            int n = matrix[0].length; // no of col 
    
            int lo =0, hi=m*n-1;
    
            while(lo<=hi){
                int mid = lo +(hi-lo)/2;
                int row = mid/n;
                int col  = mid % n ;
    
                if(matrix[row][col] == target ){
    
                    return true;
    
                }else if(matrix[row][col]<target ){
    
                 lo=mid +1;
    
    
                }else{
                     hi = mid -1;
                }
            }
            return false;
            
        }
    }

