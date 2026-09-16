import java.util.ArrayList;
import java.util.Scanner;
public class Lista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> quantidadeDeObjeto = new ArrayList();
        ArrayList<String> listaDeObjeto = new ArrayList();
        //Tentando dissecar o codigo primeiro vamos criar a introdução.
        System.out.println("SISTEMA LISTA INICIADO, BEM VINDO!!!");
        System.out.println("DIGITE OS OBJETOS DE NECESSARIA LISTAGEM:");


        System.out.println("DIGITE O OBJETO: ");
        for (int i = 1; i <= 100; i++) {

            String OBJETO = scanner.nextLine();
            listaDeObjeto.add(OBJETO);
            scanner.close();
//Adicionar contagem de Items sincronizada a lista de Objetos, eu havia conseguido mas caguei tudo...
        }
    }
}







