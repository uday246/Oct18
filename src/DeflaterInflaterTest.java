import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterInputStream;

public class DeflaterInflaterTest {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\teegu\\Desktop\\original.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\teegu\\Desktop\\deflated.txt");
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);

		doCopy(fis, dos); // copy original.txt to deflated.txt and compress it

		FileInputStream fis2 = new FileInputStream("C:\\Users\\teegu\\Desktop\\deflated.txt");
		InflaterInputStream iis = new InflaterInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream("C:\\Users\\teegu\\Desktop\\inflated.txt");

		doCopy(iis, fos2); // copy deflated.txt to inflated.txt and uncompress it

	}

	public static void doCopy(InputStream is, OutputStream os) throws Exception {
		int oneByte;
		while ((oneByte = is.read()) != -1) {
			os.write(oneByte);
		}
		os.close();
		is.close();
	}

}