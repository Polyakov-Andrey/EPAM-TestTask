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
		
		
		///
		System.out.println("\n twoMax");
		{
			int[] mas={3, 1, 9, 12, 56, 22, 10}; System.out.print(Arrays.toString(mas)+"=>");
			int val = twoMax(mas); System.out.println(val);
		}
		
		{
			int[] mas={3, 1, 9, 12, 56, 22, 30}; System.out.print(Arrays.toString(mas)+"=>");
			int val = twoMax(mas); System.out.println(val);
		}		
		
		{
			int[] mas={30, 1, 9, 12, 56, 22, 10}; System.out.print(Arrays.toString(mas)+"=>");
			int val = twoMax(mas); System.out.println(val);
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
			mm = new int[mm.length-1];
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
			dd = ((inArray[j] ^ 9) == 0) ? -9 : 1;
			_res[j] = inArray[j] + dd;
		}				
		System.arraycopy(inArray, 0, _res, 0, j+1);	
		return _res;		
	}
	
	public static int[] inc_2(int[] mm){
		// рекомендуется для ссылочных типов
		int[] result = mm.clone();
				
        for (int i = result.length - 1; ; i--) {
            if (i<0){
            	// создает 3-й массив большого размера 
                result = new int[result.length+1];
                result[0] = 1;
                break;
            }
            if (result[i]+1 == 10){
                result[i] = 0;
            } else {
                result[i]++;
                break;
            }
        }
        return result;
	}
	
	private static int twoMax(final int[] inArray){
		int id1=0, id2=1;
		if (inArray.length==1) return inArray[0];
		
		if (inArray[id1] < inArray[1]) {
			id1=1; id2=0;
		}		
		
		for(int i=2; i < inArray.length; ++i){
			if (inArray[id1] < inArray[i]) {
				id2=id1; id1=i;
			}else{
				if(inArray[id2] < inArray[i]){
					id2=i;
				}
			}
		}
		return id2;
	}
	
	private static int[] gen(){
//		int[] m = new int[Integer.MAX_VALUE/1024];
		int[] m = new int[10];
		Arrays.fill(m, 9);
		return m;
	}
}
