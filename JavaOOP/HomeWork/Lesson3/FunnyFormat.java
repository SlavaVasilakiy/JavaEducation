// вариант формата
public class FunnyFormat implements TitleFormat{

    @Override
    public void print(String text) {
        System.out.println("😄 " + text + " 😄");
    }
}
