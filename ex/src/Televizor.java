//proiectati un televeizor cu volumul de nceput 50 si canalul 0
//pe televizor putem schimba canalul
//pe teevizor putem mari volumul
// pe televizor putem micsora volumul
//getter si setteri pentru canal si volum ;
public class Televizor {
    private int volum = 50;
    private int canal = 0;

    public Televizor(int volum, int canal) {
        this.volum = volum;
        this.canal = canal;
    }

    public void setCanal(int noulCanal) {
        this.canal = noulCanal;

    }

    public void setVolum(int noulVolum) {
        this.volum = volum;
    }

    public int getVolum() {
        return volum;
    }

    public int getCanal() {
        return canal;
    }
    public void marireVolum(){
        if(this.volum < 100) {
            volum = volum + 1;
        }
    }
    public void micsorareVolum(){
        if(volum >0) {
            volum = volum - 1;
        }
    }
}
