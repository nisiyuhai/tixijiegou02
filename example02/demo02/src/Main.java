public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("F:\\class\\31\\体系结构\\实验二\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("F:\\class\\31\\体系结构\\实验二\\output2.txt");
    }
}
