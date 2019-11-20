package CrossWithObstacle.Competitors;

public class Cat implements Competitor {
    String name;
    int jumpMaxHigh;
    int runMaxDistance;
    boolean onDistance = true;

    public Cat(String name, int jumpMaxHigh, int runMaxDistance) {
        this.name = name;
        this.jumpMaxHigh = jumpMaxHigh;
        this.runMaxDistance = runMaxDistance;
    }

    @Override
    public void jump(int high) {

        if (high <= jumpMaxHigh) {
            System.out.println(name + " при помощи когтей, успешно преодолевает препятствие");
        } else {
            System.out.println(name + " не может перепрыгнуть, слишком высоко, для маленькой-то кошки");
            onDistance = false;
        }

    }

    @Override
    public void run(int distance) {

        if (distance <= runMaxDistance) {
            System.out.println(name + " смог добежать до финиша, стая собак очень хорошо стимулирует");
        } else {
            System.out.println(name + " решает сойти с дистанции, слишком лениво, лучше поспать");
            onDistance = false;
        }

    }

    @Override
    public boolean readyToContinue() {
        return onDistance;
    }


}
