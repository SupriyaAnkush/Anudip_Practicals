public class LargestNoArray {
    public static void main(String[] args) {
        int array[]={10,5,6,9,10,11,20,57,32};
        int largest=Integer.MIN_VALUE;
        int i;
        for(i=0;i<array.length;i++){
            System.out.println("Array Elements:"+array[i]);
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("Largest number in array is:"+largest);
        
    
}
}

