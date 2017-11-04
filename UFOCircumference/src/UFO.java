/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.resources.aircraft.UFOResource;

class UFO extends Aircraft {
    
    public double calculateCircumference(){
        double diameter = this.getWidth();
        double circumference = Math.PI * diameter;
        return circumference;        
    }

    public UFO() {
        super(UFOResource.UFO);
    }

    public SJoint getFin() {
        return this.getJoint(UFOResource.FIN);
    }

    public SJoint getRightDoor() {
        return this.getJoint(UFOResource.RIGHT_DOOR);
    }

    public SJoint getLeftDoor() {
        return this.getJoint(UFOResource.LEFT_DOOR);
    }
}
