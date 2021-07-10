public class SelectionSortOpti {
    static int[] sortArray(int[] arr, int n){
        for(int i=0, j=n-1; i<j; i++, j--){
            int min = arr[i], max = arr[i];
            int min_index = i, max_index = i;
            for(int k=i; k<=j; k++){
                if(arr[k] > max){
                    max = arr[k];
                    max_index = k;
                }
                else if(arr[k] < min){
                    min = arr[k];
                    min_index = k;
                }
            }
            swap(arr, i, min_index);

            // if above swap shift max to min_index
            if(arr[min_index] == max){
                swap(arr, j, min_index);
            }
            else{
                swap(arr, j, max_index);
            }
        }

        return arr;
    }

    static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] sortedArr = sortArray(arr, n);
        for(int i: sortedArr){
            System.out.print(i+" ");
        }
    }

}
