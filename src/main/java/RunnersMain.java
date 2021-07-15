public class RunnersMain implements Moving{
    private int stamina;
    private int force;



    //метод проверки на стамину
    public boolean checkStamina (Obstacles treadmill) {
        if(getStamina() >=treadmill.getLength()) {
            return true;

        } else return false;
    }

    //метод проверки на силу
    public boolean checkForce(Obstacles wall) {
        if(getForce()>=wall.getHeight()) {
            return true;
        } else return false;

    }

    //set&get
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}
