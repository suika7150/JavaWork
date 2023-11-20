/**

	大樂透

*/
import java.util.Random;
import java.util.Scanner;
public class Test302{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("超級大樂透");
		System.out.println("請輸入需要的組數");
		int line = input.nextInt();	
		lottery(line);
		
	}	
		
	public static void lottery(int line){
		
		
		int[] nums = new int[7];
		int len = nums.length;
		int[] result = new int[7];
		int res = result.length;
		Random rand = new Random();
		for(int a=1;a<=line;a++){
			
			System.out.print("\n第"+a+"組:\n");
			nums[0] = 0;
			nums[1] = 0;
			nums[2] = 0;
			nums[3] = 0;
			nums[4] = 0;
			nums[5] = 0;
			nums[6] = 0;
	
				for(int i=0;i<len;){
				
			
				int repeat = rand.nextInt(49)+1;
				
				
				if(i<=len && repeat!=nums[0] && repeat!=nums[1] && repeat!=nums[2] && repeat!=nums[3] && repeat!=nums[4] && repeat!=nums[5] && repeat!=nums[6]){
					
					nums[i] = repeat;
					System.out.print(nums[i]+"  ");
					i++;
				
				}
			
			
					for(int b=0;b<res;){
				
					int WinNumb = rand.nextInt(49)+1;
				
					if(a==line && i==len && b<res && WinNumb!=result[0] && WinNumb!=result[1] && WinNumb!=result[2] && WinNumb!=result[3] && WinNumb!=result[4] && WinNumb!=result[5] && WinNumb!=result[6]){
				
					result[b] = WinNumb;
				
					System.out.print("\n本期對獎號碼:"+result[b]);
					b++;
					
					
					
					}else if(a<line || i<len || b==res){
						
						break;
					}
				}
			}
		}
	}
}
