package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pessoa {
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
	private String nome;
	private String pai;
	private String mae;
	
		public Pessoa(String nome, String pai, String mae) { 
	      	this.nome = nome;
	      	this.pai = pai;
	      	this.mae = mae;
	   	}
		public Pessoa(String nome) { 
		 	this.nome = nome; 
	   	}
	
		public void SetNome(String nome) {
			this.nome = nome;
		}

		public void SetPai(String nome) {
			this.pai = nome;
		}

		public void SetMae(String nome) {
			this.mae = nome;
		}  
    
    	public String GetNome() {
			return (this.nome);
		}
	
    	public String GetPai() {
			return (this.pai);
		}
	
		public String GetMae() {
			return (this.mae);
		}
	
		public void Verify(Pessoa alguem) {
			if(this.pai == alguem.pai || this.mae == alguem.mae){
				System.out.println("São irmãos");
			} else {
				System.out.println("Não são irmãos");
			}
		}
	
		public void VerifyAncestor(Pessoa alguem) {
			if(alguem.nome == this.pai || alguem.nome == this.mae) {
				System.out.println("Tem parentesco");
		} else {
			System.out.println("Nao tem parentesco");
		}
	}
}
