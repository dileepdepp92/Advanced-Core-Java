/**
 * @author Dileep
 **/
import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.ChildFullBodyOutfitPuffyPJ;
import org.lgna.story.resources.sims2.ChildFullBodyOutfitPirate;
import org.lgna.story.resources.sims2.FemaleChildHairBraids;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.sims2.ChildHairHatTricorn;
import org.lgna.story.resources.sims2.ChildPersonResource;
import org.lgna.story.resources.sims2.FemaleChildHairAcornTuck;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.FemaleChildFullBodyOutfitBlazerPleats;

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
        jess.setHeight(1.5);
        double beccaHeight = becca.getHeight();
        double jessHeight = jess.getHeight();
        double anneHeight = anne.getHeight();
        if (beccaHeight>jessHeight && beccaHeight>anneHeight)
        {
            becca.say("i am tallest ");
        }
        else if (jessHeight>anneHeight)
        {
            jess.say("i am tallest");            
        }
        else {
            anne.say("i am tallest ");
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
        this.becca.setPaint(Color.WHITE);
        this.becca.setOpacity(1.0);
        this.becca.setName("becca");
        this.becca.setVehicle(this);
        this.becca.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.becca.setPositionRelativeToVehicle(new Position(1.5, 0.0, -3.0));
        this.becca.setSize(new Size(0.365, 1.5, 0.3));
        this.jess.setPaint(Color.WHITE);
        this.jess.setOpacity(1.0);
        this.jess.setName("jess");
        this.jess.setVehicle(this);
        this.jess.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.jess.setPositionRelativeToVehicle(new Position(0.0, 0.0, -3.0));
        this.jess.setSize(new Size(0.353, 1.4, 0.256));
        this.anne.setPaint(Color.WHITE);
        this.anne.setOpacity(1.0);
        this.anne.setName("anne");
        this.anne.setVehicle(this);
        this.anne.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.anne.setPositionRelativeToVehicle(new Position(-1.5, 0.0, -3.0));
        this.anne.setSize(new Size(0.303, 1.2, 0.205));
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public ChildPerson getBecca() {
        return this.becca;
    }

    public ChildPerson getJess() {
        return this.jess;
    }

    public ChildPerson getAnne() {
        return this.anne;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final ChildPerson becca = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.718, 0.486, 0.325), BaseEyeColor.GREEN, ChildHairHatTricorn.BLACK_RED_RIBBON, 0.3, ChildFullBodyOutfitPirate.RED_STRIPE, BaseFace.HUMAN_13));
    private final ChildPerson jess = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GRAY, FemaleChildHairAcornTuck.BROWN, 0.174974, FemaleChildFullBodyOutfitBlazerPleats.PVT_SCHOOL_BLUE, BaseFace.HUMAN_01));
    private final ChildPerson anne = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GREEN, FemaleChildHairBraids.BROWN, 0.489141, ChildFullBodyOutfitPuffyPJ.CREAM_TEDDYBEAR, BaseFace.HUMAN_02));
}
