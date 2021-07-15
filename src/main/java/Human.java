public class Human extends RunnersMain implements Moving {
    /*public final int STAMINA =500;
    public final int FORCE = 6;*/
    int stamina = 500;
    int force = 6;


    @Override
    public void run() {
        System.out.println(Types.HUMAN.getType()+" ran an obstacle");
    }

    @Override
    public void jump() {
        System.out.println(Types.HUMAN.getType()+" jumping!");
    }

    @Override
    public int getStamina () {
        return stamina;
    }

    @Override
    public int getForce() {
        return force;
    }

}
