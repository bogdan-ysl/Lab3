import java.util.Scanner;

class Cuvant {
    Scanner scanner = new Scanner(System.in);
    private String cuvant;

    public Cuvant() {
        cuvant = "Niciun cuvânt";
    }

    public Cuvant(String cuv) {
        cuvant = cuv;
    }

    public void setare() {
        System.out.println("Introduceți un cuvânt:");
        cuvant = scanner.nextLine();
    }

    public void setare(String cuv) {
        cuvant = cuv;
    }

    public void afiseaza() {
        System.out.println("Cuvântul este: " + cuvant);
    }
}

class Paragraf extends Cuvant {
    private String continutParagraf;

    public Paragraf() {
        continutParagraf = "Niciun paragraf";
    }

    public Paragraf(String continut) {
        continutParagraf = continut;
    }

    public void setare() {
        System.out.println("Introduceți conținutul paragrafului:");
        continutParagraf = scanner.nextLine();
    }

    public void setare(String continut) {
        continutParagraf = continut;
    }

    public void afiseaza() {
        System.out.println("Conținutul paragrafului este: " + continutParagraf);
    }
}

public class Exemplu {
    public static void main(String[] args) {
        // Testul de bază
        Cuvant paragraf = new Paragraf();
        paragraf.setare();
        paragraf.afiseaza();

        // Testul normal
        Cuvant cuvant = new Cuvant();
        cuvant.setare();
        cuvant.afiseaza();
    }
}
