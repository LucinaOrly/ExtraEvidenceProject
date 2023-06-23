import java.util.Scanner;
public class MainLoopDemo {
	static final String LINEE = "------------------------",
				 EMPTY_SPACE = "\n\n\n\n\n";
	static final int DEFAULT_TIME = 10;	
	static Scanner in = new Scanner(System.in);	

	static int pCount = 0, nCount = 0, mCount = 0, oCount = 0, interval = 0;
	public static void main (String[] args) throws InterruptedException {
		int time;
		System.out.print("Enter number of seconds per interval > ");	
		try {
			time = in.nextInt();
		} catch (Exception e) {
			time = DEFAULT_TIME;
		}
		in.nextLine();
		
		Boolean quit = false;
		while (!quit) {
			System.out.printf("%sObserve now...%s(%d)", EMPTY_SPACE, EMPTY_SPACE, ++interval);
			Thread.sleep(time * 1000);

			System.out.printf("Record:\n\tP = On Task\n\tN = Off Task (Noise)\n\tM = Off Task (Motor)\n\tO = Off Task (Other)\n\tQ = Quit\n(%d)>", interval);

			String str = in.nextLine().toUpperCase(); 

			for (char ch : str.toCharArray())
				switch(ch) {
				case 'Q': quit = true; break;
				case 'P': pCount++; break;
				case 'M': mCount++; break;
				case 'O': oCount++; break;
				case 'N': nCount++; break;
				}

			System.out.printf("%s%sInterval: %d%nP = %d%nN = %d%nM = %d%nO = %d%n%s",
					EMPTY_SPACE, LINEE, interval, pCount, nCount, mCount, oCount, LINEE);
		}
		System.out.print("Press enter to exit.");
		in.nextLine();

	}
}
