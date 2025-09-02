package trabalhopoo2;

public abstract class Principal {
    public static void main(String[] args){
        Cachorro fabio = new Cachorro();
        fabio.setNome("Fabio");
        fabio.setRaca("Pincher");
        fabio.setHabitat("casa");
        fabio.setIdade(8);
        fabio.setPeso(6);

        System.out.printf("\n Nome: " + fabio.getNome() + "\n Raca: " + fabio.getRaca() + "\n Habitat: " + fabio.getHabitat() + "\n Idade: " + fabio.getIdade() + "\n Peso: " + fabio.getPeso() + "\n" + fabio.emitirSom() + "\n" + fabio.alimentar());

        Gato danel = new Gato();
        danel.setHabitat("casa");
        danel.setIdade(3);
        danel.setNome("danel");
        danel.setPeso(5);
        danel.setCor("Preto");

        System.out.printf("\n\n Nome: " + danel.getNome() + "\nHabitat: " + danel.getHabitat() + "\n Idade: " + danel.getIdade() + "\n Peso: " + danel.getPeso() + "\n Cor: " + danel.getCor() + "\n" + danel.emitirSom() + "\n" + danel.alimentar());

        Leao gabriel = new Leao();
        gabriel.setNome("gabriel");
        gabriel.setHabitat("savana");
        gabriel.setIdade(18);
        gabriel.setPeso(69);
        gabriel.setTamanhoJuba(2);

        System.out.printf("\n\n Nome: " + gabriel.getNome() + "\n Raca:" + gabriel.getHabitat() + "\n Idade:" + gabriel.getIdade() + "\n Peso: " + gabriel.getPeso() + "\n tamanhoJuba: " + gabriel.getTamanhoJuba() + "\n" + gabriel.emitirSom() + "\n" + gabriel.alimentar());
    }
}
    
      
 

