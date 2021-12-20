package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa2 {
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    BufferedReader b = new BufferedReader(ainput);
    String _marca= b.readLine();
    String _quantidade=b.readLine();
    String _modelo=b.readLine();
    String _velocidade=b.readLine();
    String _qtdPortas=b.readLine();
    int q = Integer.parseInt(_quantidade);
    int v= Integer.parseInt(_velocidade);
    int p = Integer.parseInt(_qtdPortas);
    Carro carro = new Carro(_marca, q, _modelo, v, p);
    String marca= b.readLine();
    String quantidade=b.readLine();
    String modelo=b.readLine();
    String velocidade=b.readLine();
    String part=b.readLine();
    int quant = Integer.parseInt(quantidade);
    int velo= Integer.parseInt(velocidade);
    Boolean partida = Boolean.parseBoolean(part);
    Moto moto = new Moto(marca, quant, modelo, velo, partida);
    String m= b.readLine();
    String qu =b.readLine();
    String mu=b.readLine();
    String vel=b.readLine();
    String marchas=b.readLine();
    String bagageirp=b.readLine();
    int mar = Integer.parseInt(marchas);
    int qants = Integer.parseInt(qu);
    int ve= Integer.parseInt(vel);
    Boolean bagageiro = Boolean.parseBoolean(bagageirp);
    Bicicleta bicicleta = new Bicicleta(m, qants, mu, ve, mar, bagageiro);
    carro.imprimirInformacoes();
    moto.imprimirInformacoes();
    bicicleta.imprimirInformacoes();


class Veiculo{
    String marca;
    int qtdRodas;
    String Modelo;
    int velocidade = 0;
    public Veiculo(String _marca, int _quantidade, String _modelo, int _velocidade){
        this.marca = _marca;
        this.qtdRodas = _quantidade;
        this.Modelo = _modelo;
        this.velocidade = _velocidade;
    }
    public void imprimirInformacoes(){
        System.out.printf("marca:",marca);
        System.out.printf("quantidade de rodas:",qtdRodas);
        System.out.printf("modelo:",Modelo);
        System.out.printf("velocidade:",velocidade);
    }
    public int acelerar(int num){
        return this.velocidade + num;
    }
    public int frear(int num){
        return this.velocidade - num;
    }

    public String SetMarca(String marca){
        return this.marca = marca;
    }
    public String SetModelo(String Modelo){
        return this.Modelo = Modelo;
    }
    public int SetRodas(int quantidade){
        return this.qtdRodas = quantidade;
    }
    public int SetVelocidade(int velocidade){
        return this.velocidade = velocidade;
    }

    public String GetMarca(){
        return marca;
    }
    public String GetModelo(){
        return Modelo;
    }
    public int GetRodas(){
        return qtdRodas;
    }
    public int GetVelocidade(){
        return velocidade;
    }
    
}
class Bicicleta extends Veiculo{
    int numMarchas;
    boolean bagageiro;
    public Bicicleta(String _marca, int _quantidade, String _modelo, int _velocidade, int _numMarchas,boolean _bagageiro) {
        super(_marca, _quantidade, _modelo, _velocidade);
        this.numMarchas = _numMarchas;
        this.bagageiro = _bagageiro;
    }
    public void imprimirInformacoes(){
        System.out.println("Bicicleta ");
        System.out.println("marca:");
        System.out.printf(this.marca);
        System.out.println("rodas:");
        System.out.print(this.qtdRodas);
        System.out.println("modelo:");
        System.out.printf(this.Modelo);
        System.out.println("velocidade:");
        System.out.print(this.velocidade);
        System.out.println("marchas:");
        System.out.print(this.numMarchas);
        if(bagageiro){
            System.out.printf("bagageiro: sim");
        }else{
            System.out.printf("bagageiro: nao");
        }
    }

    public int SetMarchas(int marchas){
        return this.numMarchas = marchas;
    }
    public boolean SetBagageiro(Boolean bagageiro){
        return this.bagageiro = bagageiro;
    }
    public int GetMarchas(){
        return numMarchas;
    }
    public boolean GetBagageiro(){
        return bagageiro;
    }
}
class Automovel extends Veiculo{
    static double potenciaDoMotor;
    public Automovel(String _marca, int _quantidade, String _modelo, int _velocidade,double _potenciaDoMotor) {
        super(_marca, _quantidade, _modelo, _velocidade);
        this.potenciaDoMotor = _potenciaDoMotor;
    }
    public void imprimirInformacoes(){
        System.out.printf("marca:",this.marca);
        System.out.printf("quantidade de rodas:",this.qtdRodas);
        System.out.printf("modelo:",this.Modelo);
        System.out.printf("velocidade:",this.velocidade);
        System.out.printf("potencia:",this.potenciaDoMotor);
    }
    public double SetPotencia(double potencia){
        return this.potenciaDoMotor = potencia;
    }
    public double GetPotencia(double potencia){
        return potenciaDoMotor;
    }
} 
class Moto extends Automovel{
    boolean partidaEletrica;
    public Moto(String _marca, int _quantidade, String _modelo, int _velocidade,boolean _partidaEletrica){
        super(_marca, _quantidade, _modelo, _velocidade, potenciaDoMotor);
        this.partidaEletrica = _partidaEletrica;
    }
    public void imprimirInformacoes(){
        System.out.println("Moto");
        System.out.println("marca:");
        System.out.printf(this.marca);
        System.out.println("rodas:");
        System.out.print(this.qtdRodas);
        System.out.println("modelo:");
        System.out.printf(this.Modelo);
        System.out.println("velocidade:");
        System.out.print(this.velocidade);
        if(partidaEletrica){
            System.out.printf("partidaEletrica:sim");
        }else{
            System.out.printf("partidaEletrica:nao");
        }
    }
    public boolean GetPartida(){
        return partidaEletrica;
    }
    public boolean SetPartida( boolean partida){
        return this.partidaEletrica = partida;
    }
}
class Carro extends Automovel{
    int qtdPortas;
    public Carro(String _marca, int _quantidade, String _modelo, int _velocidade,int _qtdPortas) {
        super(_marca, _quantidade, _modelo, _velocidade, potenciaDoMotor);
        this.qtdPortas = _qtdPortas;
    }
    public void imprimirInformacoes(){
        System.out.println("Carro");
        System.out.println("marca:");System.out.println(this.marca);
        System.out.println("rodas:");System.out.print(this.qtdRodas);
        System.out.println("modelo:");System.out.printf(this.Modelo);
        System.out.println("velocidade:");System.out.print(this.velocidade);
        System.out.println("portas:");System.out.print(this.qtdPortas);
    }
    public int GetPortas(){
        return qtdPortas;
    }
    public int SetPortas(int numero){
        return this.qtdPortas = numero;
    }
    
  
}
