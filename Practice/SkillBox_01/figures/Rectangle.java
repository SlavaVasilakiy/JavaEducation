package figures;

import java.util.Date;

public class Rectangle extends Figure2D
{
    private double width;
    private double height;

    private Date creationTime;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
        setCreationTime();
    }

    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getSquare()
    {
        return width * height;
    }

    private void setCreationTime()
    {
        creationTime = new Date();
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    /**
     * @return
     */
    @Override
    public double getVisibleHeight() {
        return getHeight();
    }

    /**
     * @return
     */
    @Override
    public double getVisibleWidth() {
        return getWidth();
    }
}
