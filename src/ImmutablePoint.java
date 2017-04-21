/**
 * Created by java_dev on 21.04.17.
 */
public class ImmutablePoint {
    private final int x;
    private final int y;
    private final String description;

    public ImmutablePoint(int x, int y, String description) {
        this.x = x;
        this.y = y;
        this.description = description;
    }
}
