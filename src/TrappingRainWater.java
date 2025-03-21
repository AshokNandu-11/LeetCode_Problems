import java.util.Scanner;

public class TrappingRainWater {
    public int trapping(int[] height){
        int res =0;
        for(int i=1;i< height.length-1;i++){
            int lb = height[i];
            for(int j=0;j<i;j++){
                if(height[j] > lb){
                    lb = height[j];
                }

            }
            int rb = height[i];
            for(int j=i+1;j<height.length;j++){
                if(height[j]>rb){
                    rb = height[j];
                }
            }
            int wl = Math.min(lb,rb);
            int tw = wl - height[i];
            res +=tw;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TrappingRainWater trw = new TrappingRainWater();
        System.out.println(trw.trapping(arr));
    }
}
//SOLUTION WITH  O(1) TIME COMPLEXITY
//<.........


//int left =0,right = height.length-1;
//int leftMax = height[left];
//int rightMax = height[right];
//int res = 0;
//        while(left < right){
//        if(height[left] < height[right]){
//left+=1;
//leftMax = Math.max(leftMax,height[left]);
//res = res+leftMax-height[left];
//        }else{
//right-=1;
//rightMax = Math.max(rightMax,height[right]);
//res= res+rightMax-height[right];
//        }
//        }
//        return res;


//       .......>