public interface Figure2D
{
    default Double getSquare()
    {
        return 0.0;
    }

    static Figure2D createFigure(Object data)
    {
        return null;
    }
}
