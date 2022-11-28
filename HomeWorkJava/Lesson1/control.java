package HomeWorkJava.Lesson1;

public class control {
    public static void Run() throws Exception
    {
        String pathForRead = "HomeWorkJava/Lesson1/input.txt";
        String pathForWrite = "HomeWorkJava/Lesson1/output.txt";
        workWithFile file = new workWithFile(pathForRead);
        String result = operations.Exponentiation(file.numFirst, file.numSecond);
        file.WriteInFile(pathForWrite, result);
    }
}
