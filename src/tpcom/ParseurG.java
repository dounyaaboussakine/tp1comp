package tpcom;

import Tpcompilatipon.TokenManager;

public class ParseurG {
    private TokenManager tm;
    private char tc;

    public ParseurG(TokenManager tm) {
        this.tm = tm;
        avancer(); // Initialise le premier caractère
    }

    private void avancer() {
        tc = tm.suivant();
    }

    private void consommer(char attendu) {
        if (tc == attendu) {
            avancer();
        } else {
            throw new RuntimeException(
                "Attendu: " + attendu + ", mais trouvé: " + tc
            );
        }
    }

    public void S() {
        if (tc == 'b') {
            consommer('b');
            S();
            consommer('b');
        } else if (tc == 'c') {
            consommer('c');
            A();
            consommer('c');
        } else {
            throw new RuntimeException("Erreur : caractère inattendu " + tc);
        }
    }

    private void A() {
        switch (tc) {
            case 'b':
                consommer('b');
                A();
                A();
                break;

            case 'c':
                consommer('c');
                A();
                S();
                A();
                break;

            case 'd':
                consommer('d');
                consommer('c');
                consommer('b');
                break;

            default:
                throw new RuntimeException("Erreur : caractère inattendu " + tc);
        }
    }
}