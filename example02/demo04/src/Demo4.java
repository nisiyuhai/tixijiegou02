import java.io.File;
import java.io.IOException;

public class Demo4 {
    public void run(){
        File inFile = new File("F:\\class\\31\\体系结构\\实验二\\input.txt");
        File outFile = new File("F:\\class\\31\\体系结构\\实验二\\output4.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        try {
            input.transform();
            shift.transform();
            alphabetizer.transform();
            output.transform();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
