public class Alphabets
{
	public static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMBERS = "1234567890";
	public static final String SYMBOLS = "!@#$%^&*()-_+=\\/~?";
	private StringBuilder big;
	public void Alphabets(boolean uppercaseIncluded , boolean lowercaseIncluded , boolean numbersIncluded , boolean specialCharacterIncluded)
	{
		big = new StringBuilder();
		if(uppercaseIncluded)
			big.append(UPPER_CASE);
		if(lowercaseIncluded)
			big.append(LOWER_CASE);
		if(numbersIncluded)
			big.append(NUMBERS);
		if(specialCharacterIncluded)
			big.append(SYMBOLS);
	}
	public String getAlphabet(){
		return big.toString();
	}
}