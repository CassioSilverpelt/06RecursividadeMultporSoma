package controller;

public class MultPorSomaController {
	public MultPorSomaController() {
		super();
	}
	
	public int multPorSoma(int a, int b) {
		if (b == 0) {return 0;}
		else {
			return a = a + multPorSoma(a, b-1);
		}

	}
	
}
