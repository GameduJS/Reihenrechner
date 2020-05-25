import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OuPuts {

	static int x = 500;
	static int y = 100;
	
	
public void loggin() throws IOException {
		
		File localFolder = new File("pwd");
		File localFile = new File("pwd/password.txt");
		
		create(localFolder, localFile);
	//  save(localFile);
		read(localFile);
		load(localFile);

	}

	private static void load(File localFile) throws FileNotFoundException {
		
		File localfile = localFile;
		
		if(localfile.exists()) {
			Scanner s2 = new Scanner(localfile);
			
			if(s2.hasNextLine()) {
				x = s2.nextInt();
				y = s2.nextInt();
			}
		}
		
		
	}

	private static void read(File localFile) throws FileNotFoundException {
		
		File localfile = localFile;
		
		if(localfile.exists()) {
			Scanner s = new Scanner(localfile);
			
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		}
	}

	
	private static void save(File localFile) throws IOException {
		
		File localfile = localFile;
		
		String contentsToWrite = x + "\n" + y;
		
		OutputStream out = new FileOutputStream(localfile);
		out.write(contentsToWrite.getBytes());
		out.close();
		
	}

	public static void create(File localFolder, File localFile) {
		
		File localfile = localFile;
		File localfolder = localFolder;
		
		if(!localfolder.exists()) {
			localfolder.mkdirs();
			System.out.println("Neuer Ordner!");
		} else {
			System.out.println("Exestiert schon!");
		}
		if(!localfile.exists()){
			localfolder.mkdir();
			System.out.println("Neuer Datei!");
		} else {
			System.out.println("Exestiert schon Datei!");
	}
}
}
