import java.util.Arrays;

public class Measurement {

	private int[] data;

	
	public Measurement() {

		this.data = new int[0];
	}

	
	public void addValue(int value) {

		int[] value2 = new int[this.data.length+1];
		
		for(int i = 0; i<this.data.length; i++) {
			
			value2[i] = this.data[i];
		}	
		
		value2[value2.length-1] = value;
		this.data = value2;
	}

	
	public void addValues(int[] values) {

		int[] value2 = new int[this.data.length+values.length];
		
		for(int i = 0; i < this.data.length; i++) {
			
			value2[i] = this.data[i];
		}
		
		for(int i = this.data.length, u = 0; i < value2.length && u < values.length; i++, u++) {
			
			value2[i] = values[u];
		}
		
		this.data = value2;
	}

	
	public int getMinimumValue() {
		
		Arrays.sort(this.data);

		return this.data[0];
	}

	
	public int[] getValuesAboveThreshold(int threshold) {
		
		int anzahlGroesser = 0;
		
		for(int i = 0; i < this.data.length; i++) {
			
			if(this.data[i] > threshold) {
				
				anzahlGroesser++;
			}	
		}
		
		int[] value2 = new int[anzahlGroesser];
		
		for(int i = 0, j = 0; i < this.data.length; i++) {
			
			if(this.data[i] > threshold) {
				
				value2[j] = this.data[i];
				j++;
			}
		}
		this.data = value2;
		
		return this.data;
	}

	
	// --------------------------------------------------------------
	
	public void printData() {
		System.out.println(Arrays.toString(data));
	}

	
	public static void main(String[] args) {
		Measurement m = new Measurement();
		System.out.println("Neues Measurement-Objekt m erzeugt. m:");
		// ErwarteteAusgabe:
		// []
		m.printData();

		System.out.println("------------------------------------------------------------------");
		
		m.addValue(85);
		System.out.println("Hinzufügen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzfügen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte über 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte über 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
