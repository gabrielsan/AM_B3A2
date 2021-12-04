package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programa2_Elevador {
	FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
	private int AndarAtual = 0;
	private int TotalDeAndares;
	private int Capacidade;
	private int PessoasNoElevador = 0;

    public int getAndarAtual() {
		return (AndarAtual);
	}

	public void setAndarAtual(int Andar) {
		this.AndarAtual = Andar;
	}

    public int getTotalDeAndares() {
		return (TotalDeAndares);
	}

	public void setTotalDeAndares(int Andares) {
		this.TotalDeAndares = Andares;
	}


    public int getPessoasNoElevador() {
		return (PessoasNoElevador);
	}


    public void setPessoasNoElevador(int Pessoas) {
		this.PessoasNoElevador = Pessoas;
	}


	public int getCapacidade() {
		return (Capacidade);
	}

    public void setCapacidade(int Capacidade) {
		this.Capacidade = Capacidade;
	}

	public void Inicializa(int Capacidade, int Andares) {
		this.setCapacidade(Capacidade);
		this.setTotalDeAndares(Andares);
	}

	public void Entra() {
		if (PessoasNoElevador < Capacidade) {
			PessoasNoElevador = PessoasNoElevador + 1;
		} else {
			System.out.println("O Elevador já está com capacidade máxima");
		}
	}

	public void Sai() {
		if (PessoasNoElevador > 0) {
			PessoasNoElevador = PessoasNoElevador - 1;
		} else {
			System.out.println("O Elevador está vazio");
		}
	}

	public void Sobe() {
		if(AndarAtual < TotalDeAndares) {
			AndarAtual = AndarAtual + 1;
		} else {
			System.out.println("Ultimo andar, não sobe mais");
		}
	}

	public void Desce() {
		if(AndarAtual > 0){
			AndarAtual = AndarAtual - 1;
		} else {
			System.out.println("Terreo, o elevador não desce mais");
		}
	}
}