import java.awt.Button;

// клиентский код
public class Main {
    public static void main(String[] args) {
        Word doc1 = new Word();
        Buton buton = new Buton();
        doc1.setModel(new StringFormat());
        doc1.appendData("Раз");

        doc1.setFormat(new FunnyFormat());
        buton.click();
        doc1.click();

        doc1.appendData("Два");
        doc1.setFormat(new SadFormat());
        buton.click();
        doc1.click();

        doc1.appendData("Три");
        doc1.setFormat(new NewFormat());
        buton.click();
        doc1.click();
    }
}
