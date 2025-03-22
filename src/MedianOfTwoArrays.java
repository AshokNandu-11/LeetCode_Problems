import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfTwoArrays {
    public double medianArray(int[] arr1,int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);
        }
        Collections.sort(list);
        int n = list.size();
        if(n%2==0){
            return (double) (list.get(n / 2) + list.get((n / 2) - 1)) /2;
        }
        return list.get(n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        for(int i =0;i<n;i++){
            nums1[i] = sc.nextInt();
        }
        for(int i =0;i<m;i++){
            nums2[i] = sc.nextInt();
        }
        MedianOfTwoArrays mda = new MedianOfTwoArrays();
        System.out.println(mda.medianArray(nums1,nums2));

    }
}
