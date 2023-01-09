// вариант формата
public class SadFormat implements TitleFormat{
    @Override
    public void print(String text) {
        System.out.println("😔 " + text + " 😔");
    }
}
