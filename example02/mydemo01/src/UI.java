import java.util.Scanner;

public class UI {

    public static void run(){
        UI ui=new UI();
        while(true){
            int command=ui.menu();
            if(command<0){
                System.out.println("请输入合法字符，如1，2，3，4");
                continue;
            }else if(command==0) break;
            ui.fun(command);
        }
    }
    public int menu(){
        Scanner sc=new Scanner(System.in);
        System.out.print("--------------经典软件体系结构教学软件--------------\n" +
                "1.主程序-子程序\n" +
                "2.面向对象\n" +
                "3.事件系统\n" +
                "4.管道过滤\n" +
                "0.退出\n" +
                "请选择想要了解的软件体系结构：");
        String str=sc.next();
        int res=-1;
        if("0".equals(str)) res=0;
        else if ("1".equals(str)) res=1;
        else if ("2".equals(str)) res=2;
        else if ("3".equals(str)) res=3;
        else if ("4".equals(str)) res=4;
        return res;
    }

    public void fun(int command){
        Output output=new Output();
        if(command==1){
            System.out.println("---------------------结果--------------------------");
            Demo1 demo1=new Demo1();
            demo1.run();
            output.outfile("F:\\class\\31\\体系结构\\实验二\\output1.txt");
            System.out.println("---------------------描述--------------------------");
            output.outfile("F:\\class\\31\\体系结构\\实验二\\主程序-子程序.txt");
        }
        else if(command==2){
            System.out.println("---------------------结果--------------------------");
            Demo2 demo2=new Demo2();
            demo2.run();
            output.outfile("F:\\class\\31\\体系结构\\实验二\\output2.txt");
            System.out.println("---------------------描述--------------------------");
            output.outfile("F:\\class\\31\\体系结构\\实验二\\面向对象.txt");
        }
        else if(command==3){
            System.out.println("---------------------结果--------------------------");
            Demo3 demo3=new Demo3();
            demo3.run();
            output.outfile("F:\\class\\31\\体系结构\\实验二\\output3.txt");
            System.out.println("---------------------描述--------------------------");
            output.outfile("F:\\class\\31\\体系结构\\实验二\\事件系统.txt");
        }else if(command==4){
            System.out.println("---------------------结果--------------------------");
            Demo4 demo4=new Demo4();
            demo4.run();
            output.outfile("F:\\class\\31\\体系结构\\实验二\\output4.txt");
            System.out.println("---------------------描述--------------------------");
            output.outfile("F:\\class\\31\\体系结构\\实验二\\管道-过滤器.txt");
        }
    }


}
