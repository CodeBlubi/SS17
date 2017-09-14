
public class HtmlPersonPrinter extends PersonPrinter {

	public void printNames(Person[] names) {
	
		System.out.println("<ul>");
		
		for(int i = 0; i<names.length; i++) {
			
			System.out.println("<li>"+names[i].getName()+"</li>");
			
		}
		System.out.println("</ul>");
	}
}
