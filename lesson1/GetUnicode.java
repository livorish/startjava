class GetUnicode {
	
	public static void main(String[] args) {
		
		for (int i = 9398; i <= 10178; i++) {
			String toString = String.valueOf(i); 
			char simbol = (char) Integer.parseInt(toString, 16);
			System.out.println(simbol);
		}
	}
}