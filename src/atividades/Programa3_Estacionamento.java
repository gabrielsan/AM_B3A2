package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programa3_Estacionamento{
    FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    private int placa = 0;
	private String modelo = 0;
	private int entrada = 0;
	private int saida = 0;

     
    public int getPlaca() {
		return (placa);
	}

	public void setPlaca(int Plc) {
		this.placa = Plc;
	}

    public String getModelo() {
		return (modelo);
	}

	public void setModelo(String Modlo) {
		this.modelo = Modlo;
	}

     
    public int getEntrada() {
		return (entrada);
	}

	public void setEntrada(int Etrd) {
		this.entrada = Etrd;
	}
    
	public int getSaida() {
		return (saida);
	}

	public void setSaida(int Sai) {
		this.saida = Sai;
	}

	public void Imprimir() {
		System.out.println(this.placa);
		System.out.println(this.modelo);
		System.out.println(this.entrada);
		System.out.println(this.saida);
	}

	public float Preco() {
		return ((saida - entrada) * 1.50);
	}
}
