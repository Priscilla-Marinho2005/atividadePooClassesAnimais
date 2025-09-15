package atividadePooClassesAnimais;
// Classe pai
class Animal {
    String nome;
    String raca; // nova propriedade Raça

    // Construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Método comum
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + " | Raça: " + raca);
    }
}

// Interfaces para ações
interface Andar {
    void andar();
}

interface Voar {
    void voar();
}

// Classe Cachorro
class Cachorro extends Animal implements Andar {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Classe Pássaro
class Passaro extends Animal implements Voar, Andar {
    public Passaro(String nome, String raca) {
        super(nome, raca);
    }

    public void cantar() {
        System.out.println(nome + " está cantando: Piu piu!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando saltitante.");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Cachorro
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador");
        meuCachorro.mostrarInfo();
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();



        // Pássaro
        Passaro meuPassaro = new Passaro("Luna", "Canário");
        meuPassaro.mostrarInfo();
        meuPassaro.comer();
        meuPassaro.cantar();
        meuPassaro.andar();
        meuPassaro.voar();
    }
}