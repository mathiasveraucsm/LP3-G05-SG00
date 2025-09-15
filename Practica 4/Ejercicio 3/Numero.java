package ejercicio3;

public class Numero {
	private double valor;
	
	public Numero(double valor) {
		setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.valor = valor;
    }

}
