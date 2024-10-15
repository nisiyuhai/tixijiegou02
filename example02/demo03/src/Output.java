import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Output implements Observer {
    private ArrayList<String> kwicList;
    private BufferedWriter outputFile;
    private String filename;
    public Output(ArrayList<String> kwicList,String filename) {
        this.kwicList = kwicList;
        this.filename = filename;
    }

    public Output(ArrayList<String> kwicList) {
        this.kwicList = kwicList;

        for (String s : kwicList) {
            System.out.print((s + "\n"));
        }

        System.out.println("面向对象文字说明：");
        Iterator<String> it = kwicList.iterator();
        try{
            String filename="F:\\class\\31\\体系结构\\实验二\\面向对象.txt";
            outputFile = new BufferedWriter(new FileWriter(filename));
            while (it.hasNext()) {
                outputFile.write(it.next()+"\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void toDo(){
        Iterator<String> it = kwicList.iterator();
        try {
            outputFile = new BufferedWriter(new FileWriter(filename));
            while (it.hasNext()) {
                outputFile.write(it.next()+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (outputFile!=null) {
                    outputFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
