	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

	
public class EventRead {



		
		public ArrayList<Eventduom> readallevents(String fileName) {
			        ArrayList<Eventduom> sarasas = new ArrayList();
			        
			        try {
			            InputStream inputStream = new FileInputStream(fileName);  //("src/Skambutis.txt");
			            Reader reader = new InputStreamReader(inputStream, "UTF-8"); //StandardCharsets.UTF_8
		 
			            Gson gson = new GsonBuilder().create();
			            sarasas = gson.fromJson(reader, new TypeToken<ArrayList<Eventduom>>(){}.getType()); 
			            reader.close();
			        
			        } catch (FileNotFoundException ex) {
			            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			        } catch (UnsupportedEncodingException ex) {
			            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			        } catch (IOException ex) {
			            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			        }
			        
			        return sarasas;
			    }
		    }
	
