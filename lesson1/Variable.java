class Variable {
	
	public static void main(String[] argv) {
		char distro = 'U';	
		byte bits = 32;
		short cache =  2048;
		int networkSpeed = 1_000_000;
		long hardDrive = 500_000_000_000L;
		float clockSpeeds = 2.80f;
		double hddTotalSize = 0.8202;		
		boolean isDesktop = true;

		System.out.printf("****************************\n");
		System.out.printf("-----Hardware information----\n \n \n");
		System.out.printf("The bitness of the system: %d \n" , bits);
		System.out.printf("Cache Memory in Computer %d  \n", cache);
		System.out.printf("Network Speed in bytes: %d  \n", networkSpeed);
		System.out.printf("Size of hard disk in bytes: %d  \n", hardDrive);
		System.out.printf("Clock speed of the computer: %a  \n", clockSpeeds);
		System.out.printf("HDD Total Size in bytes in terabytes: %e  \n", hddTotalSize);
		System.out.printf("Which of OS system: %c  \n", distro);
		System.out.printf("Is it a desctop computer? %b  \n \n \n", isDesktop);
		System.out.println("****************************");
	}
	
}