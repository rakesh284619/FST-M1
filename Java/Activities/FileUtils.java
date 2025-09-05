package activities;

import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtilsExample {
	
	public static void main(String[] args) {
		try {
			usingFileUtils();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void usingFileUtils() throws IOException {
		 File file= FileUtils.getFile("C:\\Users\\RENIGUNTLARAKESHKUMA\\Downloads");
		 File tmpDir=FileUtils.getTempDirectory();
		 FileUtilsExample.copyFileToDirectory(file, tmpdir);
		 String data = FileUtilsExample.readFileToString(newTempFile, Charset.defaultCharset());
		 System.out.println(data);
	}

}