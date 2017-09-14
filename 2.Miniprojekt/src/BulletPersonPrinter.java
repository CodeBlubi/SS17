
public class BulletPersonPrinter extends PersonPrinter {

	public void printNames(Person[] names) {
		
		for(int i = 0; i<names.length; i++) {
			
			System.out.println("* "+names[i].getName());
		}
	}
}
