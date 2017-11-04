/**
 * @author Dileep
 **/
import org.lgna.story.resources.quadruped.AbyssinianCatResource;

class AbyssinianCat extends Quadruped {

    public AbyssinianCat() {
        super(AbyssinianCatResource.DEFAULT);
    }
    public void speak () {
         this. say ("Meow " ) ;
   }
}
