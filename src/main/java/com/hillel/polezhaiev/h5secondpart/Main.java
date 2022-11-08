package main.java.com.hillel.polezhaiev.h5secondpart;

public class Main {
    public static void main(String[] args) {

        Participant [] participants = {
                new Person("Jack", 11, 1.4),
                new Robot("Dob", 12, 1.8),
                new Cat("Tom", 14, 1.4)
        };

        exercise(participants);
        System.out.println("////////////////////////////////////");
        System.out.println();

        Obstacle [] obstacles = {
                new RunningTrack(15),
                new Wall(1.5)
        };

        System.out.println("If you marked obstacle's length or height like 0,\n" +
                           "length or height = 1 by default.\n");

        for (Participant participant: participants){
            for(Obstacle obstacle: obstacles){

                if(obstacle.overcome(participant) == false){
                    System.out.println(participant.getClassName() + " " + participant.getName()
                                       + " lost at the "
                                       + obstacle.getObstacle()
                                       + " and out of competition");
                    break;
                }
            }
            System.out.println();
        }

    }
    static void exercise(Participant [] participants){
        for(Participant participant: participants){
            participant.run();
            participant.jump();
            System.out.println();
        }
    }
}
