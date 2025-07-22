public class array12 {
    public static void main(String[] args) {
        float arr[] = {12.2f,23.5f,34.5f,57.3f,35.6f};
        float sum = 0;
        for(float element:arr){
            sum = sum + element;
        }
        System.out.println("the value of avg is: " + sum/arr.length);
    }
}
// public class array12 {
//     public static void main(String[] args) {
//         float arr[] = {12.2f,23.5f,34.5f,57.3f,35.6f};
//         float num = 34.5f;
//         boolean isArray = false;
//         for(float element:arr){
//             if(element == num){
//                 isArray = true;
//                 break;
//             }
//         }
//         if(isArray){
//             System.out.println("the element is present in the array:");
//         }
//         else{
//             System.out.println("this element is not present in the array:");
//         }

    
// }
// }