public class MinMaxArray {
    public static void main (String[] args){


        // Assume first element is both min and max
        int arr[]={3,5,1,8,2,7};
        int min=arr[0];
        int max=arr[0];

        // Loop through the array
        for(int i=1;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];//update min
            
            }

            if(arr[i]>max){
                max=arr[i]; //update max

            }

        }

        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);
        

    }
}
