/*

	有1、2、3、4個數字，能組成多少個互不相同且無重複數字的三位元數？都是多少？
	(EX: 123 => OK , 112 => 1有重複)

*/

public class Test2{
	public static void main(String[] args){
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
				for(a=1; a<=4;a++){
					for(b=1;b<=4;b++){
						for(c=1;c<=4;c++){
							if(a!=b && a!=c && b!=c){
								d += 1;
								System.out.println(a*100+b*10+c);
					}
				}
			}
		}
		System.out.println(d);
	}
}