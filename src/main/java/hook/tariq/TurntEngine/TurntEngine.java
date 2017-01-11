package hook.tariq.TurntEngine;

/**
 * Created by thook on 1/11/17.
 */
public class TurntEngine {

    private Boolean lit;
    private Double turntLevel;

    public TurntEngine(){
       this.lit = true;
       this.turntLevel = 1.0;
    }

    public Double getTurntLevel(){
        return turntLevel;
    }

    public void setTurntLevel(Double level){
        turntLevel = level;
    }

    public Boolean isLit(){
        return lit;
    }
}
