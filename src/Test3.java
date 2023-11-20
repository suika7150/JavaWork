/*

	輸入三個整數x,y,z，請把這三個數由小到大輸出。

*/
import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入 x 值");
		int x = input.nextInt();
		System.out.println("請輸入 y 值");
		int y = input.nextInt();
		System.out.println("請輸入 z 值");
		int z = input.nextInt();
		
		int[] nums = {x,y,z};
		int change = 0;
		
		for(int i=0;i<nums.length-1;i++){
			
			for(int j=0;j<nums.length-1-i;j++){
				
				if(nums[j]>nums[j+1]){
					change = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = change;
				}
			}
		}
		
		for(int n : nums){
			System.out.print(n+" ");
		}
	}
}