public class Uc3 {

	public static void main(String[] args) {
		Random ran = new Random();
		int n=ran.nextInt(3);
		System.out.println(n);
		if(n==0) 
			System.out.println("obsent");
		else if(n==1)
			System.out.println("present for full time");
		else
			System.out.print("part time employee");
		// TODO Auto-generated method stub

	}

}
