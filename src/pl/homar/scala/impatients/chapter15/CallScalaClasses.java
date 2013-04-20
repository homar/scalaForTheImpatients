package pl.homar.scala.impatients.chapter15;

public class CallScalaClasses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalledFromJava o = new CalledFromJava();
		int tab[] = new int[]{1,2,3,4,5,6};
		System.out.println(o.sum(tab));
		System.out.println(o.getLines());
	}

}
