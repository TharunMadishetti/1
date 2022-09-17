class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] dt=new int[mat.length*mat[0].length];
        int i=0,j=0,d=0,f=1;
        while(d<dt.length)
        {
            // d++;
            dt[d++]=mat[i][j];
            // System.out.println(" "+f);
            if(f==1)
            {
                i--;
                j++;
                if(i<0 && j==mat[0].length)
                {
                    i+=2;
                    j--;
                    f=0;
                    continue;
                }
                if(i<0)
                {
                    i++;
                    f=0;
                }
                if(j==mat[0].length)
                {
                    i+=2;
                    j--;
                    f=0;
                }
            }
            else
            {
                i++;
                j--;
                if(j<0 && i==mat.length)
                {
                    i--;
                    j+=2;
                    f=1;
                    continue;
                }
                 if(j<0)
                {
                    j++;
                    f=1;
                }
                if(i==mat.length)
                {
                    i--;
                    j+=2;
                    f=1;
                }
               
            }
            
     
            }
        return dt;
        }
    }
