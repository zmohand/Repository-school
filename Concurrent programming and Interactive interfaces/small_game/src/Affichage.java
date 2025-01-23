
import java.awt.*;
import javax.swing.*;


//cette classe implémente un panel

public class Affichage extends JPanel {
    public static final int LARGEUR = 640, HAUTEUR = 360;
    public static final int LARGEUR_CERCLE = 20, HAUTEUR_CERCLE = 60, X_CERCLE = 100, Y_CERCLE = (300);
    private final Position pos;
    //constructeur qui set les dimensions du panel
    public Affichage(Position p){
        this.pos = p;
        this.setPreferredSize(new Dimension(LARGEUR, HAUTEUR));
        (new Redessine(this)).start();
        (new Descendre(this)).start();
    }   

    //getter de position
    public Position get_pos(){
        return this.pos;
    }

    //dessine l'ovale
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawOval(X_CERCLE, Y_CERCLE+(this.pos.get()), LARGEUR_CERCLE, HAUTEUR_CERCLE);
    }
    

}
