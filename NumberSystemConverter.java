
public class NumberSystemConverter {    

    public static String convertNrToBase(int nr, int base){	
	int carry = nr/base;
	int remainder = nr%base;
	String answer ="";
	answer = remainder > 9 ? answer + (char)('A' + remainder - 9) : answer + remainder;	
	if(carry == 0)
	    return answer;
	return answer = convertNrToBase(carry, base) + answer;	
    }

 
    public static int convertNToDec(String in, int base){    
        String digits = "0123456789ABCDEF";
        in = in.toUpperCase();
        int val = 0;
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            int d = digits.indexOf(c);
            val = base*val + d;

        }
        return val;
    }

}
