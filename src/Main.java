import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Locale.Category;


public class Main {
	public static void main(String[] args) {
		int[] mas={1,8,9,9}; System.out.print(Arrays.toString(mas)+"=>");		
		int[] val;
		val = inc(mas); System.out.println(Arrays.toString(val));		
		
		mas = gen(); System.out.print(Arrays.toString(mas)+"=>");
		val = inc(mas); System.out.println(Arrays.toString(val));
		
	}
	
	public static int[] inc(int[] mm){
		int d = 0;
		int i = mm.length;
		do{
			i--;
			d = (mm[i]==9) ? -9 : 1;
			mm[i] = mm[i] + d;			
		}while(d<0 && i>0);
		if (d<0) {
			mm = new int[mm.length];
			mm[0] = 1;		
		}
		return mm;		
	}
	
	private static int[] gen(){
//		int[] m = new int[Integer.MAX_VALUE/1024];
		int[] m = new int[10];
		Arrays.fill(m, 9);
		return m;
	}
}
