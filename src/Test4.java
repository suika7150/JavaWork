/*

	請設計一程式檢查輸入的身份證代號是否正確。

*/
import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String id = input.next();
		if(id.length()!=10){
			System.out.println("身分證字號 : "+id+" 不符合格式規範");
		}else{
		char aa = id.charAt(0);
		char bb = id.charAt(1);
		char cc = id.charAt(2);
		char dd = id.charAt(3);
		char ee = id.charAt(4);
		char ff = id.charAt(5);
		char gg = id.charAt(6);
		char hh = id.charAt(7);
		char ii = id.charAt(8);
		char jj = id.charAt(9);
		char[] city = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int[] fixed = {1,9,8,7,6,5,4,3,2,1,1};
			
		
			boolean flag = false;
			for(int i=0;i<city.length;i++){
			
			if(aa==city[i] && ((((i+10)/10*fixed[0])+((i+10)%10*fixed[1])+((bb-48)*fixed[2])+((cc-48)*fixed[3])+((dd-48)*fixed[4])+((ee-48)*fixed[5])+((ff-48)*fixed[6])+((gg-48)*fixed[7])+((hh-48)*fixed[8])+((ii-48)*fixed[9])+((jj-48)*fixed[10]))%10)==0){
				
				flag = true;
				break;
				
				}
			}
		
			if(flag){
			System.out.println("身分證字號 : "+id+" 符合格式規範");
			}else{
			System.out.println("身分證字號 : "+id+" 不符合格式規範");
			
			}
		}
	}	
}