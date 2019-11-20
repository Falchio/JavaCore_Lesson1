package CrossWithObstacle.Obstacles;

import CrossWithObstacle.Competitors.Competitor;

public class RunningTrack implements Obstacles {
    int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}
