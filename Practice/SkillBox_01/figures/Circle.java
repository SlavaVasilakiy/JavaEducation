package figures;

public class Circle extends Figure2D
{
    private  double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    /**
     * @return
     */
    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * @return
     */
    @Override
    public double getVisibleHeight() {
        return getSquare();
    }

    /**
     * @return
     */
    @Override
    public double getVisibleWidth() {
        return getSquare();
    }
}
