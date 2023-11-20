import java.util.Scanner;
public class Test300{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入年份:");
		int year = input.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0){
		
			System.out.println("366Day");
		}else{
			System.out.println("365Day");
		}
		
		System.out.println("請輸入月份:");
		int month = input.nextInt();
		if((month==1 && month<2) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || month==12){
			System.out.println("31Day");
		}else if((month==4) || (month==6) || (month==9) || month==11) {
			System.out.println("30Day");
		}else if ((year%4==0 && year%100!=0) || year%400==0 && month==2){
			System.out.println("29Day");
		}else if ((year%4!=0 && year%100==0) || year%400!=0 && month==2)
			System.out.println("28Day");
		
		
		System.out.println("顯示天數:");
		if((year%4==0 && year%100!=0) || year%400==0 && (month==1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || month==12){
			System.out.println("31Day");
		}else if((year%4==0 && year%100!=0) || year%400==0 && (month==4) || (month==6) || (month==9) || month==11){
			System.out.println("30Day");
		}else if ((year%4==0 && year%100!=0) || year%400==0 && month==2){
			System.out.println("29Day");
		}else if ((year%4!=0 && year%100==0) || year%400!=0 && month==2)
			System.out.println("28Day");
	}	
}