import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    static int [] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        while(true){
       try{
        System.out.println("Entrez l'indice de l'entier à diviser: ");}
       catch (InputMismatchException e){
           System.out.println("Ceci n'est pas un entier !");
       }
        x = sc.nextInt();

        try {
            System.out.println("Entrez le diviseur");
        }catch (InputMismatchException e){
            System.out.println("Ceci n'est pas un entier !");
        }
        y = sc.nextInt();

        try {
            int resultat =Division(x, y);
            System.out.println("Le résultat de la division est : " + resultat);
        }
        catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro !");
        }
        catch (InputMismatchException e) {
            System.out.println("Cece n'est pas un entier !");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : indice hors limite !");
        }

        catch (RuntimeException e) {
            System.out.println("Une erreur est survenue " + e);
        }
        catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }}



    static int Division(int indice, int diviseur) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if (diviseur == 0) {
            throw new ArithmeticException("division par zéro !");
        }
        if (indice < 0 || indice >= tableau.length) {
            throw new ArrayIndexOutOfBoundsException("indice hors limite !");
        }
        return tableau[indice] / diviseur;


    }}
