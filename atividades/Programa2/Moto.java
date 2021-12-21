package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moto{
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    private boolean partida;
	public Moto(boolean portas) { 
	      this.partida = portas;
	}
	
	public void SetPortas(boolean portas) {
		this.partida = portas;
	}
	
	public boolean GetPortas() {
		return (this.partida);
	}
	
	public void ImprimirInformacoes() {
		System.out.println("partida:",this.partida);
	}
}