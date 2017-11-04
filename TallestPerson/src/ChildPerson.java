/**
 * @author Dileep
 **/
import org.lgna.story.resources.sims2.ChildPersonResource;

class ChildPerson extends Person {

    public ChildPerson(ChildPersonResource resource) {
        super(resource);
    }

    public void setChildPersonResource(ChildPersonResource childPersonResource) {
        this.setJointedModelResource(childPersonResource);
    }
}
