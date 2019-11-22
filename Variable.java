class Variable{
	
	public static void main (String [] argv){
		// Я обошла Эккеля и у меня получилось 10  типов переменных :-) 
		
		
		// Whole number / simbol(words)
		
		char distro = 'U';
		
		
		// Integers numbers
		
		byte bits = 32;
		short cache =  2048;
		int networkSpeed = 1_000_000;
		long hardDrive = 500_000_000_000L;
		  
		
		// real number
		
		float clockSpeeds = 2.80f;
		double hddTotalSize = 0.8202;
		
		// string / The String class is not a primitive

		String CPU = "Pentium(R) Dual-Core CPU E6300";
		
		// logical

		boolean desktop = true;
		
		System.out.printf("****************************  \n");
		System.out.printf("-----Hardware information----  \n \n \n");

		System.out.printf("The bitness of the system: %d \n" , bits);
		System.out.printf("Cache Memory in Computer %d  \n", cache);
		System.out.printf("Network Speed in bytes: %d  \n", networkSpeed);
		System.out.printf("Size of hard disk in bytes: %d  \n", hardDrive);
		System.out.printf("Clock speed of the computer: %a  \n", clockSpeeds);
		System.out.printf("HDD Total Size in bytes in terabytes: %e  \n", hddTotalSize);
		System.out.printf("Which of OS system: %c  \n", distro);
		System.out.printf("The processor name: %s  \n", CPU);
		System.out.printf("Is it a desctop computer? %b  \n \n \n", desktop);
		
		
		System.out.println("****************************");
	}
	
}