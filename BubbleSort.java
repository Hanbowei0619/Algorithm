package Sort;

public class BubbleSort {
    //冒泡排序算法实现
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        int N = arr.length;
        for(int end = N-1;end >= 0;end--){  //0~n,0~n-1,0~n-2 …… 0~1
            for(int second = 1;second <= end;second++){ //0,1,2,3,4,5,6,7    0和1交换，1和2交换，2和3交换，所以就是second-1和second交换
                if(arr[second-1] > arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }

    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3,5,1,7,2,8,0};
        print(array);
        bubbleSort(array);
        print(array);
    }
}
