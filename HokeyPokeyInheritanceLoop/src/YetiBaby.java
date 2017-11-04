/**
 * @author Dileep
 **/
import org.lgna.story.TurnDirection;
import org.lgna.story.resources.biped.YetiBabyResource;

class YetiBaby extends Biped {

    public YetiBaby(YetiBabyResource resource) {
        super(resource);
    }

    public void setYetiBabyResource(YetiBabyResource yetiBabyResource) {
        this.setJointedModelResource(yetiBabyResource);
    }
    @Override
    public void turnAround() {
        for (int i =1; i <= 5 ; i++){
        this.turn(TurnDirection.LEFT, 1.0);
            
        }
//        this.turn(TurnDirection.LEFT, 1.0);
//        this.turn(TurnDirection.LEFT, 1.0);
//        this.turn(TurnDirection.LEFT, 1.0);
//        this.turn(TurnDirection.LEFT, 1.0);
        

    }
}
