package exercicio_2;

public class TestFactoryMethodPattern {
	
	public static void main (String args []) {
		DisplayService service = new ResponseNomeDisplayService();
		service.display();
		
		service = new ResponseSobrenomeDisplayService();
		service.display();
	}

}
