package Recurssion;

public class _02_Array_Occurence {
    public static void printOcc(int []arr,int idx,int k)
    {
        //Base case
        if(idx==arr.length)
        {
            return;
        }
        //Self work
        if(arr[idx]==k)
        {
            System.out.print(idx+" ");
        }
        //Recursive work
        printOcc(arr,idx+1,k);
    }
    public static void main(String[] args) {
        int []arr={3,2,4,5,6,2,7,2,2};
        printOcc(arr,0,2);
    }
}
