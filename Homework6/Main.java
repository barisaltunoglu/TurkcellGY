import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            //Buraya lokaldeki yolu giriniz.
            MyReader reader = new MyReader("path");
            reader.mark(1453);
            System.out.println(reader.readWords());
            reader.reset();
            System.out.println(reader.readLineAt(1));
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Dosya bulunamadı." + e.getMessage());
        }
        catch (IOException e)
        {
            System.err.println("Dosya okuma yazma hatası" + e.getMessage());
        }
    }
}