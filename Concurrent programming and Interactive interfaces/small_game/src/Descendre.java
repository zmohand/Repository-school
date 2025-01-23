

public class Descendre extends Thread {
    public static final int DELAY = 100;
    Affichage monAffichage;
    //boolean pour arrêter le thread
    private boolean ok = true;

    
    public Descendre(Affichage a){
        this.monAffichage = a;
    }
    //getter de l'affichage
    public Affichage get_affichage(){
        return this.monAffichage;
    }

    //pour arreter le thread
    public void stop_thread(){
        this.ok = false;
    }


    @Override
    public void run(){
        this.ok = true;
        while (this.ok){
            try{Thread.sleep(DELAY);}
            catch (Exception e) { e.printStackTrace(); }
            this.monAffichage.get_pos().move();
        }
    }


}
