
public class Star1 {
	public static void main(String[] args) {
		/*int space = 5;
		for(int i = 0; i < 5; i++) {
			space = space - 1;
			for(int j = 0; j < 5; j++) {
				if(j >= space) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}*/
		int num = 12345;
		int total = 0;
		
		while(num > 0) {
			int n = num % 10;
			total = total + n;
			num = num/10;
		}
		System.out.println("각 자리 숫자의 합 : " + total);
	}
}
