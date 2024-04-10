import java.util.ArrayList;

class Animal {
  private String nome;
  private String especie;
  private int idade;
  private ArrayList<String> alimentos;

  // Construtor que inicializa um animal com nome, espécie e idade
  public Animal(String nome, String especie, int idade) {
      this.nome = nome;
      this.especie = especie;
      this.idade = idade;
      this.alimentos = new ArrayList<>(); // Inicializa a lista de alimentos como vazia
  }

  public Animal(String nome, String especie, int idade, ArrayList<String> alimentos) {
      this.nome = nome;
      this.especie = especie;
      this.idade = idade;
      this.alimentos = alimentos;
  }

  // Métodos getter e setter
  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getEspecie() {
      return especie;
  }

  public void setEspecie(String especie) {
      this.especie = especie;
  }

  public int getIdade() {
      return idade;
  }

  public void setIdade(int idade) {
      this.idade = idade;
  }

  public ArrayList<String> getAlimentos() {
      return alimentos;
  }

  // Método para adicionar um novo alimento à lista de alimentos
  public void adicionarAlimento(String alimento) {
      alimentos.add(alimento);
  }

  // Método toString para retornar uma representação em string do animal
  @Override
  public String toString() {
      return "Animal{" +
              "nome='" + nome + '\'' +
              ", espécie='" + especie + '\'' +
              ", idade=" + idade +
              ", alimentos=" + alimentos +
              '}';
  }
}