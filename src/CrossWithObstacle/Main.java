package CrossWithObstacle;

import CrossWithObstacle.Competitors.Cat;
import CrossWithObstacle.Competitors.Competitor;
import CrossWithObstacle.Competitors.Man;
import CrossWithObstacle.Competitors.Robot;
import CrossWithObstacle.Obstacles.Obstacles;
import CrossWithObstacle.Obstacles.RunningTrack;
import CrossWithObstacle.Obstacles.Wall;

public class Main {
    public static void main(String[] arg) {

        Competitor[] competitor = {new Man("Василич", 3, 680), new Man("Петрович", 1, 1000),
                new Cat("Барсик", 3, 850), new Cat("Мурзик", 2, 650),
                new Robot("Электроник", 4, 1500), new Robot("Wally", 2, 300)};

        Obstacles[] obstacles = {new Wall(1), new RunningTrack(700), new Wall(3)};

        for (Competitor competitorAtStart : competitor) {
            for (Obstacles currentObstacle : obstacles) {
                if (competitorAtStart.readyToContinue()) {
                    currentObstacle.doIt(competitorAtStart);
                } else {
                    break;
                }
            }
        }
    }
}
