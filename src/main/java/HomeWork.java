/*
    Посмотреть что-то там c Wall
    Осталось:
    $ У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
    Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

 */



import java.util.concurrent.TransferQueue;

public class HomeWork {
    public static void main(String[] args) {
        int plusLength = 100;
        int plusHeight = 2;

        RunnersMain[] runners = {
                new Cat(),
                new Human(),
                new Robot(),
        };

        Obstacles[] obstacles = {
                new Treadmill(),
                new Wall(),
                new Treadmill(),
                new Wall(),
                new Treadmill(),
                new Wall(),
                new Treadmill(),
                new Wall()
        };

        //заполняем массив препятствий значениями
        for (int fillArr = 0; fillArr < obstacles.length; fillArr++) {
            if (obstacles[fillArr] instanceof Treadmill == true) {
                obstacles[fillArr].setLength(plusLength);
                plusLength *= 10;
            } else if (obstacles[fillArr] instanceof Wall == true) {
                obstacles[fillArr].setHeight(plusHeight);
                plusHeight *= 2;
            }
        }

        // проходимся по массивам и сравниваем их по параметрам.
        for (int i = 0; i < runners.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Treadmill == true) {
                    runners[i].checkStamina(obstacles[j]);
                    if (runners[i].checkStamina(obstacles[j])) {
                        System.out.println("Distance: "+obstacles[j].getLength());
                        runners[i].run();
                        System.out.println();
                    } else {System.out.println("I couldn't run. I`m leaving the race.");System.out.println();break; }
                } else {
                    if(runners[i].checkForce(obstacles[j])) {
                        System.out.println("Height: "+obstacles[j].getHeight());
                        runners[i].jump();
                        System.out.println();
                    } else { System.out.println(" I couldn't jump. I'm leaving the race.");System.out.println();break;}

                }




                }

            }
        }
    }













