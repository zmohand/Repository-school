
public class Position {
    //position de base (hauteur = 0) et hauteur du saut
    private int hauteur;
    private float vitesse;
    private static final int HAUTEUR_SAUT = 10;

    //constructeur de Position
    public Position(){
        this.hauteur = 0;
        this.vitesse = 2;
    }

    //getter de Hauteur
    public int get(){
        return this.hauteur;
    }

    //setter de hauteur (saut)
    public void jump(){
        this.vitesse = - 4 ;
    }

    //descente (gravité)
    public void move(){
        this.hauteur += this.vitesse;
        this.vitesse += 0.3;

    }
}
