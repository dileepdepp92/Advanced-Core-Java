/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.resources.prop.BoulderResource;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.prop.PlateauResource;
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
        alien.say("i will need to clear space for the UFOs to land ");
        alien.say("determinig the circumference will help me to figure "
        +" out how much space to clear. ");
        alien.say("the circumference of the UFOs are as follos : ");
        alien.say("UFO 1: ", ufoFirst.calculateCircumference());
        alien.say("UFO 2: ", ufoSecond.calculateCircumference());
        alien.say("UFO 3: ", ufoThird.calculateCircumference());
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
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.997547, 0.0700011, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.71, -13.0));
        this.alien.setPaint(Color.WHITE);
        this.alien.setOpacity(1.0);
        this.alien.setName("alien");
        this.alien.setVehicle(this);
        this.alien.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.alien.setPositionRelativeToVehicle(new Position(-0.478, 0.0, -2.85));
        this.alien.setSize(new Size(0.471, 1.2, 0.481));
        this.boulder.setPaint(Color.WHITE);
        this.boulder.setOpacity(1.0);
        this.boulder.setName("boulder");
        this.boulder.setVehicle(this);
        this.boulder.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boulder.setPositionRelativeToVehicle(new Position(2.47, 0.0, -5.28));
        this.boulder.setSize(new Size(1.45, 0.614, 1.15));
        this.boulder2.setPaint(Color.WHITE);
        this.boulder2.setOpacity(1.0);
        this.boulder2.setName("boulder2");
        this.boulder2.setVehicle(this);
        this.boulder2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boulder2.setPositionRelativeToVehicle(new Position(0.93, 0.0, -4.46));
        this.boulder2.setSize(new Size(0.985, 0.543, 0.898));
        this.ufoFirst.setPaint(Color.WHITE);
        this.ufoFirst.setOpacity(1.0);
        this.ufoFirst.setName("ufoFirst");
        this.ufoFirst.setVehicle(this);
        this.ufoFirst.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.ufoFirst.setPositionRelativeToVehicle(new Position(8.68, 0.0, 12.8));
        this.ufoFirst.setSize(new Size(6.17, 3.4, 6.94));
        this.ufoSecond.setPaint(Color.WHITE);
        this.ufoSecond.setOpacity(1.0);
        this.ufoSecond.setName("ufoSecond");
        this.ufoSecond.setVehicle(this);
        this.ufoSecond.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.ufoSecond.setPositionRelativeToVehicle(new Position(2.77, 0.0, 22.2));
        this.ufoSecond.setSize(new Size(6.17, 3.4, 6.94));
        this.ufoThird.setPaint(Color.WHITE);
        this.ufoThird.setOpacity(1.0);
        this.ufoThird.setName("ufoThird");
        this.ufoThird.setVehicle(this);
        this.ufoThird.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.ufoThird.setPositionRelativeToVehicle(new Position(-5.35, 0.0, 22.3));
        this.ufoThird.setSize(new Size(6.17, 3.4, 6.94));
        this.plateau.setPaint(Color.WHITE);
        this.plateau.setOpacity(1.0);
        this.plateau.setName("plateau");
        this.plateau.setVehicle(this);
        this.plateau.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.plateau.setPositionRelativeToVehicle(new Position(-1.67, 0.0, -8.43));
        this.plateau.setSize(new Size(1.65, 2.54, 1.25));
    }

    
    
    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public Alien getAlien() {
        return this.alien;
    }

    public Boulder getBoulder() {
        return this.boulder;
    }

    public Boulder getBoulder2() {
        return this.boulder2;
    }

    public UFO getUfoFirst() {
        return this.ufoFirst;
    }

    public UFO getUfoSecond() {
        return this.ufoSecond;
    }

    public UFO getUfoThird() {
        return this.ufoThird;
    }

    public Plateau getPlateau() {
        return this.plateau;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Alien alien = new Alien();
    private final Boulder boulder = new Boulder(BoulderResource.BOULDER1_RED);
    private final Boulder boulder2 = new Boulder(BoulderResource.BOULDER2_BROWN);
    private final UFO ufoFirst = new UFO();
    private final UFO ufoSecond = new UFO();
    private final UFO ufoThird = new UFO();
    private final Plateau plateau = new Plateau(PlateauResource.TALL_BROWN);
}
