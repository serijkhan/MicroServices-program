package in.sameerit;

public class StringJoiner {
	
	public StringJoiner(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner(null, null, null);
		sj1.add("ashok");
		sj1.add("it");
		sj1.add("java");
		System.out.println(sj1); // ashok-it-java

		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		sj2.add("ashok");
		sj2.add("it");
		sj2.add("java");
		System.out.println(sj2); // (ashok-it-java)

	}

	@Override
	public String toString() {
		return "StringJoiner [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
