package abc;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Read_Write_Append {
	public static void main(String[] args) 
	{
		try {
			String data = "Something Doing Big";
			File f1 = new File("C:\\Simpli_file\\a.txt.txt");
			if(!f1.exists()) {
				f1.createNewFile();
			}
			FileWriter fileWritter = new FileWriter(f1.getName(),true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write(data);
			bw.close();
			System.out.println("Done");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}