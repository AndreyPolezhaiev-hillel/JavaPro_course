package main.java.com.hillel.polezhaiev.h5secondpart;

public class Wall implements Obstacle{

    private double height;

    public Wall(double height){
        this.height = height;
    }
    @Override
    public boolean overcome(Participant participant) {
        if(participant.getHeight() < 1){
            return false;
        }

        if(height < 1){
            height = 1;
        }

        if(participant.getHeight() >= height){
            participant.jump();
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
        return height;
    }
}
