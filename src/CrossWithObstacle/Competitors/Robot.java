package CrossWithObstacle.Competitors;

public class Robot implements Competitor {
    String name;
    int jumpMaxHigh;
    int runMaxDistance;
    boolean onDistance = true;

    public Robot(String name, int jumpMaxHigh, int runMaxDistance) {
        this.name = name;
        this.jumpMaxHigh = jumpMaxHigh;
        this.runMaxDistance = runMaxDistance;
    }

    @Override
    public void jump(int high) {

        if (high <= jumpMaxHigh) {
            System.out.println(name + " успешно перепрыгивает, немного повредя верх стены");
        } else {
            System.out.println(name + " гремя железом валится на бок перед стеной, не в силах её преодолеть");
            onDistance = false;
        }

    }

    @Override
    public void run(int distance) {

        if (distance <= runMaxDistance) {
            System.out.println(name + " отмечая свой путь ржавчиной, смог добежать до финиша");
        } else {
            System.out.println(name + " пару раз скрипнув, замирает на части пути");
            onDistance = false;
        }

    }

    @Override
    public boolean readyToContinue() {
        return onDistance;
    }

}
