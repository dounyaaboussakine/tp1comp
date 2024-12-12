package tpcom;

import tpcom.ParseurG;
import tpcom.TokenManager;

public class Main {
    public static void main(String[] args) {
        String ch = "cdcbc"; // La chaîne à analyser

        // Analyseur lexical
        TokenManager tm = new TokenManager(ch);

        // Création du parseur avec le TokenManager
        ParseurG parseur = new ParseurG(tm);

        try {
            // Appel de la méthode principale d'analyse (S dans ce cas)
            parseur.S();
            System.out.println(ch + " est valide.");
        } catch (RuntimeException exp) {
            System.out.println(ch + " n'est pas valide.");
            System.out.println("Erreur : " + exp.getMessage());
        }
    }
}