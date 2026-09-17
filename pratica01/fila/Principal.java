
public class Principal{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Alunos");

        fila.enfileirar("João");
        fila.enfileirar("Maria");
        fila.enfileirar("Pedro");

        System.out.println("Aluno removido: " + fila.desenfileirar());

        fila.enfileirar("Ana");
        fila.enfileirar("Carlos");

        fila.imprimeFila();
    }
}

