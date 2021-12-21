package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Veiculo{
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    private String marca;
	private int rodas;
	private String modelo;
	private int velocidade = 0;
	
	public Veiculo(int velocidade, int rodas, String modelo, String marca) { 
	    this.velocidade = velocidade;
	    this.rodas = rodas;
	    this.modelo = modelo;
	    this.marca = marca;
	}
	
	public void acelerar(int valor) {
		this.velocidade += valor;
	}
	
	public void frear(int valor) {
		this.velocidade -= valor;
	}
	
	public int GetVelocidade() {
		return(this.velocidade);
	}
	
	public int GetRodas() {
		return(this.rodas);
	}
	
	public String GetMarca() {
		return(this.marca);
	}
	
	public String GetModelo() {
		return(this.modelo);
	}
	
	public void SetVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void SetRodas(int rodas) {
		this.rodas = rodas;
	}
	
	public void SetMarca(String marca) {
		this.marca = marca;
	}
	
	public void SetModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void ImprimirInformacoes() {
		System.out.println("velocidade",this.velocidade);
		System.out.println("rodas",this.rodas);
		System.out.println("modelo:",this.modelo);
		System.out.println("marca:",this.marca);
	}
}