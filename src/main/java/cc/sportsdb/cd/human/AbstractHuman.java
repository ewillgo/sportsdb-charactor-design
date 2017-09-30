package cc.sportsdb.cd.human;

public abstract class AbstractHuman implements Moveable {

    protected Long blood;
    protected Long energy;

    public Long getBlood() {
        return blood;
    }

    protected void setBlood(Long blood) {
        this.blood = blood;
    }

    public Long getEnergy() {
        return energy;
    }

    protected void setEnergy(Long energy) {
        this.energy = energy;
    }
}
