/**
 * @author Dileep
 **/
import org.lgna.story.resources.quadruped.ScottyDogResource;

class ScottyDog extends Quadruped {
    String gender;
    public ScottyDog() {
        super(ScottyDogResource.DEFAULT);
        gender ="unknown";
    }
    public ScottyDog (String x)
    {
        super(ScottyDogResource.DEFAULT);
        gender = x;
    }
    public void speak () {
         this. say ("ARF! ARF! My sex is "+gender ) ;
   }

}
