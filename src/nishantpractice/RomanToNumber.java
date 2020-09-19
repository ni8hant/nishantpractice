package nishantpractice;

public class RomanToNumber {
	int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}
	int romanToDecimal(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			int v1 = value(str.charAt(i));
			if (i + 1 < str.length()) {
				int v2 = value(str.charAt(i + 1));
				if (v1 >= v2) {
					result = result + v1;
				} else {
					result = result + v2 - v1;
					i++;
				}
			} else {
				result = result + v1;
				i++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		RomanToNumber ob = new RomanToNumber(); 
		  
        // Considering inputs given are valid 
        String str = "MCMIV"; 
        System.out.println( 
            "Integer form of Roman Numeral"
            + " is " + ob.romanToDecimal(str)); 
	}
}
