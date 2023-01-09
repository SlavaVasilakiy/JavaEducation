// создание и заполнение
public class StringFormat extends Model{
    String text = "";

    @Override
    void appendRawData(String t) {
        text += t;
    }

    @Override
    String getRawData() {
        return text;

    }
}
