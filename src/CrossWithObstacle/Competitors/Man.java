package CrossWithObstacle.Competitors;

public class Man implements Competitor {
    String name;
    int jumpMaxHigh;
    int runMaxDistance;
    boolean onDistance = true;


    public Man(String name, int jumpMaxHigh, int runMaxDistance) {
        this.name = name;
        this.jumpMaxHigh = jumpMaxHigh;
        this.runMaxDistance = runMaxDistance;
    }


    @Override
    public void jump(int high) {

        if (high <= jumpMaxHigh) {
            System.out.println(name + " успешно перепрыгивает препятствие, сказалась служба в армии");
        } else {
            System.out.println(name + " не смог перепрыгнуть, слишком высоко, а стремянка дома осталась");
            onDistance = false;
        }

    }

    @Override
    public void run(int distance) {

        if (distance <= runMaxDistance) {
            System.out.println(name + " смог добежать до финиша, хоть и одышка замучила");
        } else {
            System.out.println(name + " сошел с дистанции, пора бросать курить");
            onDistance = false;
        }

    }

    @Override
    public boolean readyToContinue() {
        return onDistance;
    }


}
