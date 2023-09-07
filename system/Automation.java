package org.system;

public class Automation extends MultipleLanguge{

	
	@Override
	public void Java() {
		System.out.println("Language used is Java");		
	}

	@Override
	public void Selenium() {
		System.out.println("Test tool used is Selenium");
	}

	@Override
	public void ruby() {
		System.out.println("Altenative test language used is ruby");		
	}

	public static void main(String[] args) {
		Automation ato=new Automation();
		ato.Java();
		ato.Selenium();
		ato.ruby();
		ato.python();

	}
}
