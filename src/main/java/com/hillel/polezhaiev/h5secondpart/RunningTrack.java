package main.java.com.hillel.polezhaiev.h5secondpart;

public class RunningTrack implements Obstacle{

    private int length;

    public RunningTrack(int length){
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if(participant.getLength() < 1){
            return false;
        }

        if(length < 1){
            length = 1;
        }

        if(participant.getLength() >= length){
            participant.run();
            return true;
        }
        return false;
    }

    @Override
    public String getObstacle() {
        return "Running track";
    }

    @Override
    public double getValue() {
        return length;
    }
}
