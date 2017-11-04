
import org.lgna.story.resources.prop.BoulderResource;

class Boulder extends Prop {

    public Boulder(BoulderResource resource) {
        super(resource);
    }

    public void setBoulderResource(BoulderResource boulderResource) {
        this.setJointedModelResource(boulderResource);
    }
}
