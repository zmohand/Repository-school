import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;






public class ReactionClic implements MouseListener {

    private Position pos;

    public ReactionClic(Position p){
        this.pos = p;
    }


    //si l'objet est clické (on appuie et on enleve son doigt de la souris) on lance "jump"
    @Override
    public void mouseClicked(MouseEvent e){
        this.pos.jump();
    }
    @Override
    public void mouseEntered(MouseEvent e){

    }
    @Override
    public void mouseExited(MouseEvent e){

    }

    @Override
    public void mousePressed(MouseEvent e){

    }

    @Override
    public void mouseReleased(MouseEvent e){
        
    }
}
