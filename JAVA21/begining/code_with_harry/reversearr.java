public class reversearr {
    public static void main(String[] args){
        // int mat1[][] = {{1,2,3,},
        //                 {4,5,6}};
        // // int mat2[][] = {{1,9,3,},
        // //                 {5,9,6}};
        // for (int i=mat1.length-1;i>=0;i--){
        //     for(int j=mat1[i].length-1;j>=0;j++){
        //         System.out.printf("the value of i=%d and j=%d\n",i,j); 
        //         System.out.println(mat1[i][j]);   
        int  arr[] ={1,2,3,41,5,6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l,2);
        // for(int i=0;i<n;i++){
        //     temp = arr[i];
        //     arr[i]= arr[l-i-1];
        //     arr[l-i-1]=temp;
        // }
        // for(int i=0;i<l;i++){
        //     System.out.print(arr[i]);
        // }
        int max = 0;
        for(int i=0;i<l;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }   
}



