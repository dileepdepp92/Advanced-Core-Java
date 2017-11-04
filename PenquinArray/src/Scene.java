/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.flyer.PenguinResource;

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
        Penguin[] penquinArray = new Penguin[]{this.tux, this.waddles, this.icy};
        for (Penguin item : penquinArray) {
            item.moveTo(this.hole);
            item.getNeck().turn(TurnDirection.FORWARD, 0.125);
            item.move(MoveDirection.DOWN, 2.0);
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
        this.ground.setPaint(SurfaceAppearance.SNOW);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.hole.setRadius(0.5);
        this.hole.setPaint(Color.BLACK);
        this.hole.setOpacity(1.0);
        this.hole.setName("hole");
        this.hole.setVehicle(this);
        this.hole.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.hole.setPositionRelativeToVehicle(new Position(-0.0455, 0.01, -3.07));
        this.hole.setSize(new Size(1.0, 0.0, 1.0));
        this.tux.setPaint(Color.WHITE);
        this.tux.setOpacity(1.0);
        this.tux.setName("tux");
        this.tux.setVehicle(this);
        this.tux.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tux.setPositionRelativeToVehicle(new Position(0.882, 0.0, -1.46));
        this.tux.setSize(new Size(0.428, 0.651, 0.336));
        this.waddles.setPaint(Color.WHITE);
        this.waddles.setOpacity(1.0);
        this.waddles.setName("waddles");
        this.waddles.setVehicle(this);
        this.waddles.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.waddles.setPositionRelativeToVehicle(new Position(-0.00836, 0.0, -1.61));
        this.waddles.setSize(new Size(0.428, 0.651, 0.336));
        this.icy.setPaint(Color.WHITE);
        this.icy.setOpacity(1.0);
        this.icy.setName("icy");
        this.icy.setVehicle(this);
        this.icy.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.icy.setPositionRelativeToVehicle(new Position(-0.907, 0.0, -1.73));
        this.icy.setSize(new Size(0.428, 0.651, 0.336));
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public Disc getHole() {
        return this.hole;
    }

    public Penguin getTux() {
        return this.tux;
    }

    public Penguin getWaddles() {
        return this.waddles;
    }

    public Penguin getIcy() {
        return this.icy;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Disc hole = new Disc();
    private final Penguin tux = new Penguin(PenguinResource.ADULT);
    private final Penguin waddles = new Penguin(PenguinResource.ADULT);
    private final Penguin icy = new Penguin(PenguinResource.ADULT);
}
