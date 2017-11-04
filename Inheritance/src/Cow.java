/**
 * @author Dileep
 **/
import org.lgna.story.resources.quadruped.CowResource;

class Cow extends Quadruped {

    public Cow() {
        super(CowResource.DEFAULT);
    }
    public void speak () {
         this. say ("MoooooOOO " ) ;
   }

    @Override
    public void sleep () {
        this . say ("ZZZzzzzZZZZ") ;
      }

}
