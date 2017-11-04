/**
 * @author Dileep
 **/
import org.lgna.story.resources.prop.BirchTreeResource;

class BirchTree extends Prop {

    public BirchTree(BirchTreeResource resource) {
        super(resource);
    }

    public void setBirchTreeResource(BirchTreeResource birchTreeResource) {
        this.setJointedModelResource(birchTreeResource);
    }
}
