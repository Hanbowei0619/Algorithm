package Sort;

public class SelectSort {

    //简单选择排序算法实现
    public static void selectSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        int N = arr.length;
        for(int i = 0;i < N;i++){   //0~i~N
            int minValueIndex = i;
            for(int j = i+1;j < N;j++){ //i~j~N,取出i+1到N的最小值，与i位置交换
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr,i,minValueIndex);
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
        selectSort(array);
        print(array);
    }
}
