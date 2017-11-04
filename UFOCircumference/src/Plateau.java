
import org.lgna.story.resources.prop.PlateauResource;

class Plateau extends Prop {

    public Plateau(PlateauResource resource) {
        super(resource);
    }

    public void setPlateauResource(PlateauResource plateauResource) {
        this.setJointedModelResource(plateauResource);
    }
}
