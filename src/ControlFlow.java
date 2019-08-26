
public class ControlFlow {
	private Functions fun;
	
	ControlFlow(){
		fun = new Functions();
	}
	
	public double logic(int operation, double value1, double value2) {
		
		double result = 0;
		switch (operation) {
			case 1: result = fun.add(value1, value2);
					break;
			case 2: result = fun.subtract(value1, value2);
					break;
			case 3: result = fun.multiply(value1, value2);
					break;
			case 4: result = fun.divide(value1, value2);
					break;
			default: System.out.println("Wrong Input");
			}
		return result;
	}
}