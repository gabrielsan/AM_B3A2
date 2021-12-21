package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bicicleta{
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
        private boolean bagageiro;
        private int marchas;
    
        public Bicicleta(boolean bagageiro, int marchas) { 
            this.bagageiro = bagageiro;
            this.marchas = marchas;
        }
        
        public void SetBagageiro(boolean bagageiro) {
            this.bagageiro = bagageiro;
        }
        
        public boolean GetBagageiro() {
            return (this.bagageiro);
        }
    
        public void SetMarchas(int marchas) {
            this.marchas = marchas;
        }
        
        public int GetMarchas() {
            return (this.marchas);
        }
        
        public void ImprimirInformacoes() {
            System.out.println("bagageiro:",this.bagageiro);
            System.out.println("marchas:",this.marchas);
        }
    }
}