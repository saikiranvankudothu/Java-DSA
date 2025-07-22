public class matrixarr {
    public static void main(String[] args) {
        int mat1[][] = {{1,2,3,},
                        {4,5,6}};
        int mat2[][] = {{1,9,3,},
                        {5,9,6}};
        int result[][] = {{0,0,0,},
                          {0,0,0}};  
        for (int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.printf("the value of i=%d and j=%d\n",i,j); 
                result[i][j]= mat1[i][j]+mat2[i][j];     
            }
        }
        for (int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j] +" ");            
            }
            System.out.println(); 
        }  
    }
}
