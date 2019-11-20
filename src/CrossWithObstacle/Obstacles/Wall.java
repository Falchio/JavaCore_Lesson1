package CrossWithObstacle.Obstacles;

import CrossWithObstacle.Competitors.Competitor;

public class Wall implements Obstacles {
    int high;

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(high);
    }
}
