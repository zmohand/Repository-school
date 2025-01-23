import javax.swing.*;

public class Main {
    /** La méthode de lancement du programme */
        public static void main(String [] args) {
        
            JFrame maFenetre = new JFrame("Exercice 1");
            Position position_ovale = new Position();



            Affichage aff = new Affichage(position_ovale); 

            // classe qui implemente l'interface MouseListener
            ReactionClic reac_clic = new ReactionClic(position_ovale);
            
            
            
            aff.addMouseListener(reac_clic);

            maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            maFenetre.add(aff);
            maFenetre.pack();
            maFenetre.setVisible(true);
         
        }
      }