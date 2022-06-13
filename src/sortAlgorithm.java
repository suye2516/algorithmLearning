public class sortAlgorithm {
    //生成一个随机数组
    public static int[] randomArrays(int maxLength,int maxValue){
        int length=(int)(Math.random()*maxLength);
        int[] a=new int[length];
        for (int i=0;i<length;i++){
             a[i]=(int)(Math.random()*maxValue);
        }
        return a;
    }
    //打印该随机数组
    public static void print(int[] arr){
        int length=arr.length;
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //交换
    public static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        int length=arr.length-1;
        for (int i=0;i<length;i++){
            for (int j=i+1;j<=length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a=randomArrays(200,200);
        print(a);
        bubbleSort(a);
        print(a);
    }
}
