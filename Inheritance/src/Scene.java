/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.event.SceneActivationEvent;

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
        this.cat.getMouth().turn(TurnDirection.LEFT, 0.25);
        this.cat.getMouth().turn(TurnDirection.RIGHT, 0.25);
        this.cow.say("ZZZZZzzzzzZZZZZZ");
        this.cow.roll(RollDirection.RIGHT, 0.25);
        cow . eat () ;
        cow . speak () ;
        cow . sleep () ;
        dog . eat () ;
        dog . speak () ;
        dog . sleep () ;
        cat . eat () ;
        cat.  speak () ;
        cat . sleep () ;
        rover.speak();

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
        this.dog.setPaint(Color.WHITE);
        this.dog.setOpacity(1.0);
        this.dog.setName("dog");
        this.dog.setVehicle(this);
        this.dog.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.dog.setPositionRelativeToVehicle(new Position(-2.59, 0.0, -1.53));
        this.dog.setSize(new Size(0.324, 0.616, 0.826));
        this.cat.setPaint(Color.WHITE);
        this.cat.setOpacity(1.0);
        this.cat.setName("cat");
        this.cat.setVehicle(this);
        this.cat.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cat.setPositionRelativeToVehicle(new Position(0.234, 0.0, -3.31));
        this.cat.setSize(new Size(0.165, 0.45, 0.679));
        this.cow.setPaint(Color.WHITE);
        this.cow.setOpacity(1.0);
        this.cow.setName("cow");
        this.cow.setVehicle(this);
        this.cow.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cow.setPositionRelativeToVehicle(new Position(1.44, 0.0, -2.37));
        this.cow.setSize(new Size(0.611, 1.25, 2.0));
        this.rover.setPaint(Color.WHITE);
        this.rover.setOpacity(1.0);
        this.rover.setName("rover");
        this.rover.setVehicle(this);
        this.rover.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.rover.setPositionRelativeToVehicle(new Position(0,0,0));
        this.rover.setSize(new Size(0.324, 0.616, 0.826));
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public ScottyDog getDog() {
        return this.dog;
    }

    public AbyssinianCat getCat() {
        return this.cat;
    }

    public Cow getCow() {
        return this.cow;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final ScottyDog dog = new ScottyDog();
    private final AbyssinianCat cat = new AbyssinianCat();
    private final Cow cow = new Cow();
    private final ScottyDog rover= new ScottyDog ("female");
}
