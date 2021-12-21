package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Carro{
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    private int portas;

	public Carro(int portas) { 
	      this.portas = portas;
	}
	
	public void SetPortas(int portas) {
		this.portas = portas;
	}
	
	public int GetPortas() {
		return (this.portas);
	}
	
	public void ImprimirInformacoes() {
		System.out.println("portas:",this.portas);
	}
}