import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammingLangService {


  public static List<Data> languages() throws IOException, InterruptedException {
    Thread.sleep(5000);
    URL url = new URL("https://programminglanguages-3d0fe-default-rtdb.firebaseio.com/Object.json");
    InputStreamReader reader = new InputStreamReader(url.openStream());
    Data[] dto = new Gson().fromJson(reader, Data[].class);
   // System.out.println(dto);
    for(Data d: dto){
      System.out.println(d);
    }
    //System.setProperty("http.agent", "Netscape 1.0");
    return new ArrayList<>(Arrays.asList(dto));
  }




}
