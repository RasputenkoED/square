import java.util.Scanner;
public class project2n {

	public static void main(String[] args) {
		int rez=1;
		System.out.print("Введите любое целое положительное число: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int a = 0; a <= n; a++) {
		    rez *= 2;
		    System.out.print (rez + " ");
		}
	}

}
