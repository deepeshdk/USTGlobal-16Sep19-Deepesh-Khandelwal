import java.util.Scanner;

class ArmStrong {

	public static void main(String args[]) {
		int res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details : ");
		int n = sc.nextInt();
		// int no = sc.nextInt();
		int rs = n;
		res = getNumber(n);

		if (res == rs)
			System.out.println("Number " + n + " is ArmStrong");
		else
			System.out.println("Number " + n + " is not ArmStrong");
	}

	static int getNumber(int a) {
		int sum = 0;
		int c = getCountDigit(a);
		while (a > 0) {
			int r = a % 10;
			sum = sum + getPower(r, c);
			a = a / 10;
		}
		return sum;
	}

	static int getPower(int a, int p) {
		int pw=1;
		while (p > 0) {
			pw = pw * a;
			p--;
		}
		return pw;
	}

	static int getCountDigit(int a) {
		int count = 0;
		while (a > 0) {
			count = count + 1;
			a = a / 10;
		}
		return count;
	}

}
