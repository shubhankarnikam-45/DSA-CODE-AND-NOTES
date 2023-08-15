//solving the problem of PAIR STAR using the STRING fn SUBSTRING();
	static String PairStar(String str) {

		if(str.length()<=1)
			return str;

		char firstChar=str.charAt(0);

		if(firstChar==str.charAt(1))
		{
			return firstChar+"*"+PairStar(str.substring(1));
		}
		else
		{
			return firstChar+PairStar(str.substring(1));
		}
		
        
    }