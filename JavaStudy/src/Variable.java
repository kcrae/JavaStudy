public class Variable {
	public static void main(String[] args) {
		/*int a = 10;
		System.out.println("a의 값은? " + a);

		int b = 11;
		System.out.println("b의 값은? " + b);

		// a의 값에 b를 입력
		// 기존 a의 값읶 10은 사라짐
		a = b;
		System.out.println("a의 값은? " + a);
		
		// 0.0 <= x < 1.0
		double r = Math.random() * 6;
		r = r + 1;
		int num = (int)r;
		System.out.println(num);
		
		int num2 = (int)(Math.random() * 6 + 1);
		System.out.println(num2);
		long ut = System.currentTimeMillis();
		System.out.println(ut);
		
		// 정수와 실수 연산 시 무조건 실수를 따라가서 연산의 결과값은 실수입니다.
		int intValue = 10;
		double doubleValue = 5.5;
		
		System.out.println(intValue + doubleValue);*/
		
		byte b = 127;
		b = (byte)(b + 1); // -128
		System.out.println(b);
		
		int num1 = 300;
		byte num2 = (byte)(num1); // 44
		System.out.println(num2);
	}
}
