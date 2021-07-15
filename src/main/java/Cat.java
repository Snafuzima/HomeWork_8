import javax.swing.text.html.HTMLDocument;

public class Cat extends RunnersMain implements Moving {
    int stamina = 1000;
    int force = 5;

    @Override
    public void run() {
            System.out.println("The " + Types.CAT.getType() + " ran an obstacle");
    }

    @Override
    public void jump() {
        System.out.println(Types.CAT.getType()+" jumping!");
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
