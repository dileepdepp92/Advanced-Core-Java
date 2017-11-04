/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.resources.QuadrupedResource;

class Quadruped extends SQuadruped {

    public Quadruped(QuadrupedResource resource) {
        super(resource);
    }
    public void sleep()
    {
        this.roll(RollDirection.RIGHT,0.25);
        this.say("ZZZZzzzzZZZZ");
    }
    public void eat () {
        this.getMouth (). turn (TurnDirection. LEFT, 0.25) ;
        this.getMouth (). turn(TurnDirection.RIGHT, 0.25);
    }
}
