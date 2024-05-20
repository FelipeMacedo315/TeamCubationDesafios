import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        List<String> armazenarNomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva 5 nomes");
        HashMap<String, Integer> bd = new HashMap<>();
        String nome = "";

        for (int i = 0; i < 5; i++) {
            nome = scanner.next();
            armazenarNomes.add(nome);
            if (bd.containsKey(nome)) {
                bd.put(nome, bd.get(nome) + 1);
                           } else {
                bd.put(nome, 1);
            }
        }
        System.out.println("Veja quantas vezes cada nome foi repetido");
        System.out.println(bd.toString());

    }
}
