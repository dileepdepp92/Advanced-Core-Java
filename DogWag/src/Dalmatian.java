/**
 * @author Dileep
 **/

import org.lgna.story.*;
import org.lgna.story.resources.quadruped.DalmatianResource;

class Dalmatian extends Quadruped {

    public Dalmatian() {
        super(DalmatianResource.DEFAULT);
    }

    public void wag(Double speedx) {
        this.getTail().turn(TurnDirection.LEFT, 0.125, Turn.duration(speedx));
        this.getTail().turn(TurnDirection.RIGHT, 0.25, Turn.duration(speedx));
        this.getTail().turn(TurnDirection.LEFT, 0.125, Turn.duration(speedx));
    }

    public SJoint getLeftEarMiddle() {
        return this.getJoint(DalmatianResource.LEFT_EAR_MIDDLE);
    }

    public SJoint getRightEarMiddle() {
        return this.getJoint(DalmatianResource.RIGHT_EAR_MIDDLE);
    }
}
