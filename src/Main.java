import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Locale.Category;


public class Main {
	public static void main(String[] args) {
		{
			int[] mas={1,8,9,9}; System.out.print(Arrays.toString(mas)+"=>");		
		int[] val;
//		val = inc(mas); System.out.println(Arrays.toString(val));				
		val = inc_1(mas); System.out.println(Arrays.toString(val));
		}		
//		mas = gen(); System.out.print(Arrays.toString(mas)+"=>");
//		val = inc(mas); System.out.println(Arrays.toString(val));
		{
		  int[] mas = gen(); System.out.print(Arrays.toString(mas)+"=>");
		  int[] val = inc_1(mas); System.out.println(Arrays.toString(val));
		}
	
		{
		 int[] mas = {9,9,8,9,9,9,9};  System.out.print(Arrays.toString(mas)+"=>");
		 int[] val = inc_1(mas); System.out.println(Arrays.toString(val));
		}
			
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
	
	public static int[] inc_1(int[] inArray){
		int[] _res = null; 
		int i, j, dd;
		
		// Test {9,9,9}
		for(i = 0; i<inArray.length && inArray[i]==9;++i){			
		}
		
		// New array allocation
		if (i == inArray.length){
			_res = new int[inArray.length+1];
			_res[0] = 1;
			return _res;
		}else{
			_res = new int[inArray.length];
		}		
		
		// do increment. array length is equals
		for(j = inArray.length-1, dd = -9; dd < 0 && j>=0; --j){
			dd = (inArray[j]==9) ? -9 : 1;
			_res[j] = inArray[j] + dd;
		}				
		System.arraycopy(inArray, 0, _res, 0, j+1);	
		return _res;		
	}
	
	private static int[] gen(){
//		int[] m = new int[Integer.MAX_VALUE/1024];
		int[] m = new int[10];
		Arrays.fill(m, 9);
		return m;
	}
}
