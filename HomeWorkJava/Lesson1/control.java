package Lesson1;

public class control {
    public static void Run() throws Exception
    {
        String pathForRead = "HomeWorkJava/Lesson1/input.txt";
        String pathForWrite = "HomeWorkJava/Lesson1/output.txt";
        Lesson1.workWithFile file = new Lesson1.workWithFile(pathForRead);
        String result = Lesson1.operations.Exponentiation(file.numFirst, file.numSecond);
        file.WriteInFile(pathForWrite, result);
    }
}
