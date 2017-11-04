/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.prop.BirchTreeResource;

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
        while (this.water.getWidth() > 0.1) {
            this.water.setWidth(this.water.getWidth() - 0.1);
            this.tree.setHeight(this.tree.getHeight() + 0.1);
        }
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
        this.setAtmosphereColor(new Color(0.5, 0.5, 1.0));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.DESERT);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(-2.6, 1.56, -2.3));
        this.tree.setPaint(Color.WHITE);
        this.tree.setOpacity(1.0);
        this.tree.setName("tree");
        this.tree.setVehicle(this);
        this.tree.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tree.setPositionRelativeToVehicle(new Position(-2.53, 0.0, 3.07));
        this.tree.setSize(new Size(0.834, 1.0, 0.997));
        this.water.setRadius(0.5);
        this.water.setPaint(Color.BLUE);
        this.water.setOpacity(1.0);
        this.water.setName("water");
        this.water.setVehicle(this);
        this.water.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.water.setPositionRelativeToVehicle(new Position(-2.57, 0.01, 3.13));
        this.water.setSize(new Size(1.0, 0.0, 1.0));
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public BirchTree getTree() {
        return this.tree;
    }

    public Disc getWater() {
        return this.water;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final BirchTree tree = new BirchTree(BirchTreeResource.GREEN);
    private final Disc water = new Disc();
}
