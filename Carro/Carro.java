package POO.Carro;

//classe aula de metodos e atributos.

public class Carro {

    // atributos

    String cor;
    String modelo;
    int tanque = 0;

    // construtor

    Carro() {

    }

    // sobrecarga

    Carro(String cor, String modelo, int tanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;
    }

    // metodos

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setTanque(int tanque) {
        this.tanque = tanque;
    }

    int getTanque() {
        return tanque;
    }

    double gasolinaTotal(double gasolina) {
        return tanque * gasolina;
    }

}
