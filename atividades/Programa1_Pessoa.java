package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programa1_Pessoa {
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    private String nome;
	private Float altura;
	private int nascimento;

        public String getNome() {
		    return (nome);
	    }

	    public void setNome(String nome) {
		    this.nome = nome;
	    }

        public int getNascimento() {
		    return (nascimento);
	    }

	    public void setNascimento(int nasc) {
		    this.nascimento = nascimento;
	    }


	    public Float getAltura() {
		    return (altura);
	    }

        public void setAltura(Float altura) {
		    this.altura = altura;
	    }

	    public void Imprimir() {
		    System.out.println(this.nome);
		    System.out.println(Float.toString(this.altura));
		    System.out.println(String.valueOf(this.nascimento));
	    }

	    public int CalcularIdade() {
		    return (2021 - this.nascimento);
        }    
    }
}




