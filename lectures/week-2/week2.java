import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class week2{

    public static void main(String[] args) {
        try {
            String address="C:\\Users\\Shahzad\\Desktop\\abc.txt";
            //The reason it was not appending is because FileWriter needed another argument
            //FileWriter(String filename, boolean append)
            BufferedWriter bw =new BufferedWriter(new FileWriter(address,true));
            String str="hi this is a str\n";    
            bw.append(str);
            bw.close();


            BufferedReader br=new BufferedReader(new FileReader(address));
            String temp;
            List<String> list=new ArrayList<String>();

            while ((temp=br.readLine())!=null){
                list.add(temp);
            }
            for(String var:list){
                System.out.println(var);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}