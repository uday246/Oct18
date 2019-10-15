//Java program to demonstrate DeflaterOutputStream
 
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
 
public class DFA
{
    public static void main(String[] args) throws IOException 
    {
 
        FileOutputStream fos = new FileOutputStream("C:\\Users\\teegu\\Desktop\\file2.txt");
 
        //Assign FileOutputStream to DeflaterOutputStream
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);
 
        //write it into DeflaterOutputStream
        for (int i = 0; i <10 ; i++) 
        {
            dos.write(i);
        }
         
        //illustrating flush() method()
        dos.flush();
         
        //illustrating finish()
        //Finishes writing compressed data to the output stream
        // without closing the underlying stream
        dos.finish();
         
        //fos is not closed
        //writing some data on file
        fos.write('G');
     
        //Writes remaining compressed data to the output stream
        // closes the underlying stream.
        dos.close();
    }
}