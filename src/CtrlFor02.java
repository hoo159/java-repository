
import java.util.Scanner;

public class CtrlFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("���� : ");
		n = sc.nextInt();
		
		int i, hap = 0;
		//break point
		for(i = 0; i<=n; i++) {
			hap +=i; //hap = hap + i;
		}
		System.out.println("0���� "+n+" 100������ �� = "+hap+"�Դϴ�");
	}

}