import java.util.ArrayList; 

class Zoologico {
  private ArrayList<Animal> animais; // Lista de animais do zoológico

  // Construtor que inicializa a lista de animais
  public Zoologico() {
      this.animais = new ArrayList<>();
  }

  // Método para adicionar um novo animal ao zoológico
  public void adicionarAnimal(Animal animal) {
      animais.add(animal);
  }

  // Método para listar todos os animais do zoológico
  public void listarAnimais() {
      for (Animal animal : animais) {
          System.out.println(animal);
      }
  }

  // Método para buscar animais por espécie
  public void buscarPorEspecie(String especie) {
      for (Animal animal : animais) {
          if (animal.getEspecie().equalsIgnoreCase(especie)) {
              System.out.println(animal);
          }
      }
  }
}