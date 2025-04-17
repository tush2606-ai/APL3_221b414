/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Application
{
	public static void main(String[] args) {
	Crow crow =new IndianCrow();
	CrowAdapter crowadapter =new CrowAdapter(crow);
	client(crowadapter);
	}
	public  static void client(Swan swan){
	    swan.eat();
	    swan.swim();
	    swan.sing();

	}
}
