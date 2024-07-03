import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Gui_Awt_Calculator {
    Frame frame;
    Label L1;

    int check;
    double calculate;
    Button one,two,three,four,five,six,seven,eight,nine,zero,doubleZero;
    Button add,sub,mul,div,mod,ce,equ,back,dot;
    double num1,num2,num3;
    public Gui_Awt_Calculator(){
        frame = new Frame("Calculator");

//        Label

        L1 = new Label();
        L1.setBounds(50,50,270,60);
        L1.setBackground(Color.lightGray);

        ce = new Button("CE");
        ce.setBounds(50,120,60,50);

        back = new Button("Back");
        back.setBounds(120,120,60,50);

        mod = new Button("%");
        mod.setBounds(190,120,60,50);

        div = new Button("/");
        div.setBounds(260,120,60,50);



        seven = new Button("7");
        seven.setBounds(50,180,60,50);

        eight = new Button("8");
        eight.setBounds(120,180,60,50);

        nine = new Button("9");
        nine.setBounds(190,180,60,50);

        mul = new Button("*");
        mul.setBounds(260,180,60,50);


        four = new Button("4");
        four.setBounds(50,240,60,50);

        five = new Button("5");
        five.setBounds(120,240,60,50);

        six = new Button("6");
        six.setBounds(190,240,60,50);

        sub = new Button("-");
        sub.setBounds(260,240,60,50);


        one = new Button("1");
        one.setBounds(50,300,60,50);

        two = new Button("2");
        two.setBounds(120,300,60,50);

        three = new Button("3");
        three.setBounds(190,300,60,50);

        add = new Button("+");
        add.setBounds(260,300,60,50);


        doubleZero = new Button("00");
        doubleZero.setBounds(50,360,60,50);

        zero = new Button("0");
        zero.setBounds(120,360,60,50);

        dot = new Button(".");
        dot.setBounds(190,360,60,50);

        equ = new Button("=");
        equ.setBounds(260,360,60,50);


        one.addActionListener(this::actionPerformed);
        two.addActionListener(this::actionPerformed);
        three.addActionListener(this::actionPerformed);
        four.addActionListener(this::actionPerformed);
        five.addActionListener(this::actionPerformed);
        six.addActionListener(this::actionPerformed);
        seven.addActionListener(this::actionPerformed);
        eight.addActionListener(this::actionPerformed);
        nine.addActionListener(this::actionPerformed);
        zero.addActionListener(this::actionPerformed);
        dot.addActionListener(this::actionPerformed);
        doubleZero.addActionListener(this::actionPerformed);


        add.addActionListener(this::actionPerformed);
        sub.addActionListener(this::actionPerformed);
        mul.addActionListener(this::actionPerformed);
        div.addActionListener(this::actionPerformed);
        mod.addActionListener(this::actionPerformed);

        ce.addActionListener(this::actionPerformed);
        equ.addActionListener(this::actionPerformed);
        back.addActionListener(this::actionPerformed);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.add(L1);

        frame.add(ce);      frame.add(back);    frame.add(mod);     frame.add(div);

        frame.add(seven);      frame.add(eight);    frame.add(nine);     frame.add(mul);

        frame.add(four);      frame.add(five);    frame.add(six);     frame.add(sub);

        frame.add(one);      frame.add(two);    frame.add(three);     frame.add(add);

        frame.add(doubleZero);      frame.add(zero);    frame.add(dot);     frame.add(equ);

        frame.setSize(370,450);
        frame.setLayout(null);
        frame.setVisible(true);

        WindowActivities();
    }

    public void actionPerformed(ActionEvent e){
        String textFieldText, newText;
        if(e.getSource()==one){
            textFieldText = L1.getText();
            newText = textFieldText+"1";
            L1.setText(newText);
        }
        if(e.getSource()==two){
            textFieldText = L1.getText();
            newText = textFieldText+"2";
            L1.setText(newText);
        }
        if(e.getSource()==three){
            textFieldText = L1.getText();
            newText = textFieldText+"3";
            L1.setText(newText);
        }
        if(e.getSource()==four){
            textFieldText = L1.getText();
            newText = textFieldText+"4";
            L1.setText(newText);
        }
        if(e.getSource()==five){
            textFieldText = L1.getText();
            newText = textFieldText+"5";
            L1.setText(newText);
        }
        if(e.getSource()==six){
            textFieldText = L1.getText();
            newText = textFieldText+"6";
            L1.setText(newText);
        }
        if(e.getSource()==seven){
            textFieldText = L1.getText();
            newText = textFieldText+"7";
            L1.setText(newText);
        }
        if(e.getSource()==eight){
            textFieldText = L1.getText();
            newText = textFieldText+"8";
            L1.setText(newText);
        }
        if(e.getSource()==nine){
            textFieldText = L1.getText();
            newText = textFieldText+"9";
            L1.setText(newText);
        }
        if(e.getSource()==dot){
            textFieldText = L1.getText();
            newText = textFieldText+".";
            L1.setText(newText);
        }
        if(e.getSource()==zero){
            textFieldText = L1.getText();
            newText = textFieldText+"0";
            L1.setText(newText);
        }
        if(e.getSource()==doubleZero){
            textFieldText = L1.getText();
            newText = textFieldText+"00";
            L1.setText(newText);
        }

        if(e.getSource()==add){
            try{
                num1 = Double.parseDouble(L1.getText());
            }catch(NumberFormatException e1){
                L1.setText("Invalid Input");
                return;
            }
            newText = "";
            L1.setText(newText);
            check = 1;
        }
        if(e.getSource()==sub){
            try{
                num1 = Double.parseDouble(L1.getText());
            }
            catch(NumberFormatException e1){
                L1.setText("Invalid Input");
                return;
            }
            newText = "";
            L1.setText(newText);
            check = 2;
        }
        if(e.getSource()==mul){
            try{
                num1 = Double.parseDouble(L1.getText());
            }
            catch(NumberFormatException e1){
                L1.setText("Invalid Input");
                return;
            }
            newText = "";
            L1.setText(newText);
            check = 3;
        }
        if(e.getSource()==div){
            try{
                num1 = Double.parseDouble(L1.getText());
            }
            catch(NumberFormatException e1){
                L1.setText("Invalid Input");
                return;
            }
            newText = "";
            L1.setText(newText);
            check = 4;
        }
        if(e.getSource()==mod){
            try{
                num1 = Double.parseDouble(L1.getText());
            }
            catch(NumberFormatException e1){
                L1.setText("Invalid Input");
                return;
            }
            newText = "";
            L1.setText(newText);
            check = 5;
        }

        if(e.getSource()==equ){
            try {
                num2 = Double.parseDouble(L1.getText());
            }catch(Exception e2){
                L1.setText("Input The value First");
                return;
            }
            if(check == 1){
                calculate = num1+num2;
            }
            if(check == 2){
                calculate = num1-num2;
            }
            if(check == 3){
                calculate = num1*num2;
            }
            if(check == 4){
                calculate = num1/num2;
            }
            if(check == 5){
                calculate = num1%num2;
            }
            L1.setText(String.valueOf(calculate));
        }

        if(e.getSource() == ce) {
            num1 = 0;
            num2 = 0;
            calculate = 0;
            newText = "";
            L1.setText(newText);
        }

        if(e.getSource()==back){  // FOR  BACKSPACE
            textFieldText=L1.getText();
            try{
                newText=textFieldText.substring(0, textFieldText.length()-1);
            }catch(StringIndexOutOfBoundsException f){return;}
            L1.setText(newText);
        }

    }


    public double convertStringToDouble(){
        String text = L1.getText().trim();
        double value = Double.parseDouble(String.valueOf(text));
        return value;
    }
    public void WindowActivities(){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window is Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window is Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window is Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window is Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
        });
    }
}
