/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.SGround.SurfaceAppearance;

class Scene extends SScene {

    public Scene() {
        super();
    }

    private void performCustomSetup() {
    }

    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    public void myFirstMethod() {
        this.spot.wag(0.5);
        this.spike.wag(2.0);
    }

    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    private void performGeneratedSetUp() {
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.spot.setPaint(Color.WHITE);
        this.spot.setOpacity(1.0);
        this.spot.setName("spot");
        this.spot.setVehicle(this);
        this.spot.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.spot.setPositionRelativeToVehicle(new Position(0.0, 0.0, 0.0));
        this.spot.setSize(new Size(0.344, 0.876, 1.24));
        this.spike.setPaint(Color.WHITE);
        this.spike.setOpacity(1.0);
        this.spike.setName("spike");
        this.spike.setVehicle(this);
        this.spike.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.spike.setPositionRelativeToVehicle(new Position(-1.12, 0.0, -2.07));
        this.spike.setSize(new Size(0.344, 0.876, 1.24));
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public Dalmatian getSpot() {
        return this.spot;
    }

    public Dalmatian getSpike() {
        return this.spike;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Dalmatian spot = new Dalmatian();
    private final Dalmatian spike = new Dalmatian();
}
