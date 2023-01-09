public class Word {
    Model model;
    TitleFormat format;

    public void setModel(Model model) {
        this.model = model;
    }
    // добавление текста
    public void appendData(String text) {
        model.appendRawData(text);
    }
    // форматирование текста
    public void setFormat(TitleFormat f) {
        format = f;
    }
    // кнопка вывода
    void click() {
        format.print(model.getRawData());
    }
}