
import org.lgna.story.*;

class Program extends SProgram {

    public Program() {
        super();
    }

    public Scene getMyScene() {
        return this.myScene;
    }
    private final Scene myScene = new Scene();

    public static void main(String[] args) {
        final Program story = new Program();
        story.initializeInFrame(args);
        story.setActiveScene(story.getMyScene());
    }
}
