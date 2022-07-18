package POO.Carro;

//Classe para testar os exercicios de Metodos e Atributos da aula de POO

public class RodarAplicacaoCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Porsche");
        carro1.setTanque(75);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getTanque());
        System.out.println(carro1.gasolinaTotal(6.48));

        Carro carro2 = new Carro("Vermelho", "BMW", 59);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getTanque());
        System.out.println(carro2.gasolinaTotal(5.79));

    }
}
