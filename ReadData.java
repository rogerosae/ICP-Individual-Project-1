import java.io.*;
import java.io.FileReader;
import java.util.*;
public class ReadData {
    public static ArrayList<String[]> ReadData(String file_name){
        ArrayList<String[]> contents=new ArrayList<>();
        BufferedReader reader=null;
        try{
            File file=new File(file_name);
            reader=new BufferedReader(new FileReader(file));
            String content;
            String[]old_object;
            String[]new_object;
            while((content=reader.readLine())!=null){
                old_object=content.split(",");
                contents.add(old_object);
            }

        }catch (FileNotFoundException fne){
            fne.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }
        finally {
            try{
                if (reader!=null)
                    reader.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }

        }
        return contents;
        
    }
}
