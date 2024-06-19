/**
 * Veiculo
 */
public class Veiculo {

    private String nome;
    private int tipo;
    public Veiculo(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void info(){
        System.out.println(".............");
        System.out.printf("Nome.....%s%n", getNome());
        System.out.printf("Tipo.....%d%n", getTipo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}