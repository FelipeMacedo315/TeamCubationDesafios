package org.example.Exercicios1Jeanne;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o e-mail e o status dos usuarios");
        LinkedHashMap<String, String> armazenarEmails = new LinkedHashMap<>();
        LinkedHashMap<String, String> emailsOff = new LinkedHashMap<>();
        LinkedHashMap<String, String> emailsOn = new LinkedHashMap<>();
        while (armazenarEmails.size() <= 2) {
            String emailUsuario = scanner.next();
            String statusUsuario = scanner.next();
            armazenarEmails.put(emailUsuario, statusUsuario);
            if (armazenarEmails.containsKey(emailUsuario)) {
                if (Objects.equals(statusUsuario, "online")) {
                    emailsOn.remove(emailUsuario, statusUsuario);
                }
                if (Objects.equals(statusUsuario, "offline")) {
                    emailsOff.remove(emailUsuario, statusUsuario);
                }
            }
            if (Objects.equals(statusUsuario, "online")) {
                emailsOn.put(emailUsuario, statusUsuario);
            }
            if (Objects.equals(statusUsuario, "offline")) {
                emailsOff.put(emailUsuario, statusUsuario);
            }

        }
        System.out.println("Emails Online " + emailsOn.toString());
        System.out.println("Emails Offline" + emailsOff.toString());
    }

}
