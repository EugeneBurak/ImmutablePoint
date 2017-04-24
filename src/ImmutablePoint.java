/**
 * Created by java_dev on 21.04.17.
 */
public class ImmutablePoint {
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDescription() {
        return description;
    }

    private final int x;
    private final int y;
    private final String description;

    public ImmutablePoint(int x, int y, String description) {
        this.x = x;
        this.y = y;
        this.description = description;
    }

    public void setX(int x) {
        new ImmutablePoint(x, getY(), getDescription());
    }

    public void setY(int y) {
        new ImmutablePoint(getX(), y, getDescription());
    }

    public void setDescription(String description) {
        new ImmutablePoint(getX(), getY(), description);
    }
}
