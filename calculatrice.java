import java.util.Scanner;
public class calculatrice {
    static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args){
        int nbre1 = 0, nbre2 = 0;
        System.out.println("entrer le premier nombre");
        nbre1 = clavier.nextInt();
        System.out.println("entrer le deuxieme nombre");
        nbre2 = clavier.nextInt();
        System.out.println("la somme :"+(nbre1+nbre2));
        System.out.println("la difference :"+(nbre1-nbre2));
        System.out.println("la multiplication :"+(nbre1*nbre2));
        System.out.println("la division :"+(nbre1/nbre2));
    }
}