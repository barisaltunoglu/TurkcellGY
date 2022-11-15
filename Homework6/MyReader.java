import java.io.*;
import java.util.ArrayList;

public class MyReader extends BufferedReader
{
    public MyReader(String file) throws FileNotFoundException
    {
        super(new FileReader(file));
    }

    @Override
    public void close()
    {
        try
        {
            super.close();
        }
        catch (IOException e)
        {
            System.err.println("Hata alındı ! " + e.getMessage());
        }
    }

    public String readLineAt(int lineNumber)
    {
        String line ="";
        try
        {
            int counter = 1;
            while(ready())
            {
                line = readLine();
                if (counter == lineNumber)
                {
                    break;
                }
                counter++;
            }
        } catch (IOException e) {
            System.err.println("Hata alındı ! " + e.getMessage());
        }

        return line;
    }


    public ArrayList<String> readWords()
    {
        ArrayList<String> words = new ArrayList<>();
        try
        {
            String word = "";
            while(ready())
            {
                int value = read();
                //ASCI tablosunda 32 - space ,10 ise line feed'e denk geliyor.
                if (value!=32 && value != 10)
                {
                    word += (char) value;
                }
                else
                {
                    words.add(word);
                    word="";
                }
            }
        } catch (IOException e) {
            System.err.println("Hata aldınız ! " + e.getMessage());
        }
        return words;
    }
}
