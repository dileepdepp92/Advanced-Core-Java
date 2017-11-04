/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.biped.YetiBabyResource;
import org.lgna.story.event.SceneActivationEvent;
import static org.lgna.common.ThreadUtilities.doTogether;

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
        this.delay(2.0);
        doTogether(() -> {
            this.playAudio(new AudioSource(Resources.Hokey_Pokey_mp3));
            this.playAudio(new AudioSource(Resources.Hokey_Pokey_mp3));
        }, () -> {
            this.tortoise.hokeyPokey();
        }, () -> {
            this.tortoise2.hokeyPokey();
        },  () -> {
            this.yetiBaby.hokeyPokey();
        },  () -> {
            this.alien.hokeyPokey();
        });
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
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.992542, 0.121902, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(0.0303, 2.72, -11.0));
        this.tortoise.setPaint(Color.WHITE);
        this.tortoise.setOpacity(1.0);
        this.tortoise.setName("tortoise");
        this.tortoise.setVehicle(this);
        this.tortoise.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tortoise.setPositionRelativeToVehicle(new Position(0.321, 0.0, 0.376));
        this.tortoise.setSize(new Size(0.75, 1.2, 0.554));
        this.tortoise2.setPaint(Color.WHITE);
        this.tortoise2.setOpacity(1.0);
        this.tortoise2.setName("tortoise2");
        this.tortoise2.setVehicle(this);
        this.tortoise2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tortoise2.setPositionRelativeToVehicle(new Position(-1.16, 0.0, -2.04));
        this.tortoise2.setSize(new Size(0.75, 1.2, 0.554));
        this.alien.setPaint(Color.WHITE);
        this.alien.setOpacity(1.0);
        this.alien.setName("alien");
        this.alien.setVehicle(this);
        this.alien.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.alien.setPositionRelativeToVehicle(new Position(2.67, 0.0, -2.27));
        this.alien.setSize(new Size(0.566, 1.44, 0.578));
        this.yetiBaby.setPaint(Color.WHITE);
        this.yetiBaby.setOpacity(1.0);
        this.yetiBaby.setName("yetiBaby");
        this.yetiBaby.setVehicle(this);
        this.yetiBaby.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.yetiBaby.setPositionRelativeToVehicle(new Position(1.07, 0.0, -2.76));
        this.yetiBaby.setSize(new Size(1.12, 1.2, 0.811));
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public Tortoise getTortoise() {
        return this.tortoise;
    }

    public Tortoise getTortoise2() {
        return this.tortoise2;
    }

    public Alien getAlien() {
        return this.alien;
    }

    public YetiBaby getYetiBaby() {
        return this.yetiBaby;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Tortoise tortoise = new Tortoise();
    private final Tortoise tortoise2 = new Tortoise();
    private final Alien alien = new Alien();
    private final YetiBaby yetiBaby = new YetiBaby(YetiBabyResource.TUTU);
}
