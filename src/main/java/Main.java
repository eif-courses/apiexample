import java.io.IOException;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
   List<Data> dataList =  ProgrammingLangService.languages();

   for (Data d: dataList){
     System.out.println(d.getName());
   }

  }
}
