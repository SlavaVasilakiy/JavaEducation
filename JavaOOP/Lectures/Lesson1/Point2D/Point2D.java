package Lectures.Lesson1.Point2D;


/** 
 * Это точка 2D
*/
public class Point2D {
    private int x, y;

    /**
     * Это конструктор ...
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    /**
     *
     * @param value конструктор принимает значения value
     */
    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    /**
     *
     * @return получение координаты X
     */
    public int getX(){
        return x;
    }

    /**
     *
     * @return получение координаты Y
     */
    public int getY(){
        return y;
    }

    /**
     *
     * @param value запись координаты X
     */
    public void setX(int value){
        this.x = value;
    }
    /**
     *
     * @param value  запись координаты Y
     */
    public void setY(int value){
        this.y = value;
    }

    /**
     *
     * @return метод форматирующий строку
     */
    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    /**
     *
     * @return переопределение метода
     */
    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) { // вычислительный метод
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // ctor
    // get; set;
    // docs
    //
}
