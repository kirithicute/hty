import java.util.Scanner;


public class sqre{
public static void main(String arg[]){
	int happy;
	int a,a1,b,b1,su=0,summ=0,ae,ae1,sum1;
	System.out.println("happy num is ");
	Scanner ff=new Scanner(System.in);
	happy=ff.nextInt();
	while(happy!=1){
		
		a=happy/10;
		if(a>=10){
			ae=a%10;
			ae1=ae*ae;
			su=summ+ae1;
			a=a/10;
		}
		a1=a*a;
		b=happy%10;
		b1=b*b;
		
		su=summ+a1+b1;
		System.out.println(sum);
		if(summ>=100){
			sum1=sum/10;
			System.out.println(sum1);
		}
		happy=sum;
		
	
	}
	
}
}
