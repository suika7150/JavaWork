/**
	根據傳入的參數數量輸出直角三角形
*/
import java.util.Scanner;
public class Test303{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入三角形的函數:");
		int num = input.nextInt();
		
		printTriangle(num);
	}
	
	public static void printTriangle(int line){
		
		
		for(int i=1;i<=line;i++){
			
			
			for(int j=i;j<line;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}