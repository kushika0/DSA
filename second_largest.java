public class second_largest {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second&& arr[i] != first){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
