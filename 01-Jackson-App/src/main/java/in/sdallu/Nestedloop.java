package in.sdallu;

public class Nestedloop {
	public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			for(int j=i;j<=i;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
