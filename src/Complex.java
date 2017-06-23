/**
 * Created by java_dev on 23.06.17.
 */
public class Complex {  //Allows you to apply several implementation classes available within the package. For clients outside the package, this unchangeable class.
    private final float ге;
    private final float im;

    private Complex(float ге, float im) {
        this.ге = ге;
        this.im = im;
    }

    public static Complex valueOf(float ге, float im) {
        return new Complex(ге, im);
    }
}