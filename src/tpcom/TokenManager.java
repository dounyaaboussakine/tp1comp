package tpcom;

public class TokenManager {
    private String entree;
    private int iCourant = 0;

    public TokenManager(String ch) {
        this.entree = ch;
    }

    public char suivant() {
        if (iCourant < entree.length()) {
            return entree.charAt(iCourant++);
        }
        return '#'; // Caractère spécial pour signaler la fin de l'entrée
    }
}