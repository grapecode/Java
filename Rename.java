import java.nio.file.Files;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Rename{
	public static void main(String args[])
	{
		File[] files = new File("./files").listFiles();
		for (File file : files) {
			if (file.isFile()) {
				String name = file.getName();
				String fileName = name.replaceFirst("[.][^.]+$", "");
				file.renameTo( new File("./files/"+fileName+".jpg"));
				System.out.println(file.getName());
			}
		}
	}
}
