package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Automovel{
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
        private double potencia;
    
        public Automovel(double portas) { 
            this.potencia = portas;
        }
        
        public void SetPortas(double portas) {
            this.potencia = portas;
        }
        
        public double GetPortas() {
            return (this.potencia);
        }
        
        public void ImprimirInformacoes() {
            System.out.println("potencia:",this.potencia);
        }
    }
}