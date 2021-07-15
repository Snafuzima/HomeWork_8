public class Robot extends RunnersMain implements Moving{
    /*public final int STAMINA =10000;
    public final int FORCE = 15;*/
    int stamina = 10000;
    int force = 15;



    @Override
    public void run() {
        System.out.println(Types.ROBOT.getType()+" ran an obstacle");
    }

    @Override
    public void jump() {
        System.out.println(Types.ROBOT.getType()+" jumping!");
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
