/**
 * @author Dileep
 **/
import org.lgna.story.resources.flyer.PenguinResource;

class Penguin extends Flyer {

    public Penguin(PenguinResource resource) {
        super(resource);
    }

    public void setPenguinResource(PenguinResource penguinResource) {
        this.setJointedModelResource(penguinResource);
    }
}
