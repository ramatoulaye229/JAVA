import java.util.Scanner;
import java.lang.Math;
public class rectangle {
    static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args){
        int longueur = 0, largeur = 0;
        System.out.println("entrer la longueur");
        longueur= clavier.nextInt();
        System.out.println("entrer la largeur");
        largeur = clavier.nextInt();
        if(longueur>largeur && longueur>0 && largeur>0){
        System.out.println("le demi-perimetre :"+(longueur+largeur));
        System.out.println("le perimetre :"+((longueur+largeur)*2));
        System.out.println("la surface :"+(longueur*largeur));
        System.out.println("la diagonale :"+(Math.sqrt(Math.pow(longueur,2)+Math.pow(largeur,2))));
        }
        else{
            System.out.println("veuillez saisir les bonne valeur ");
        }
    }
}