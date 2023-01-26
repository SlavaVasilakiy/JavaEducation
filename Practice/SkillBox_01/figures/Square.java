package figures;

public class Square extends Rectangle
    implements Comparable<Square>
{

    private Square(int width, int height)
    {
        super(width, height);
        if (width != height) {
            System.out.println("The width doesn't equals the height!");
        }
    }

    public Square(double width)
    {
        super(width, width);
    }

    @Override
    public void setWidth(double width)
    {
        setWidth(width);
        setHeight(width);
    }

    @Override
    public void setHeight(double height)
    {
        setHeight(height);
        setWidth(height);
    }

    @Override
    public int compareTo(Square square) {
        if (getWidth() > square.getWidth())
        {
            return -1;
        }
        if (getWidth() < square.getWidth())
        {
            return 1;
        }
        return 0;
    }
}
