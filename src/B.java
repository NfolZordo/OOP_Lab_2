import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class B {

    static Tree t1;

    public static void main(String[] args) {

        JFrame frame=new JFrame("Tree");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,350);
        frame.setResizable(false);

        JButton createBtn=new JButton("Створити об’єкт");
        createBtn.setBounds(250,30,150,50);
        frame.add(createBtn);
        JButton ageBtn=new JButton("Площа тіні");
        ageBtn.setBounds(250,80,150,50);
        frame.add(ageBtn);
        JButton areaBtn=new JButton("S приств. крура");
        areaBtn.setBounds(250,130,150,50);
        frame.add(areaBtn);
        JButton heightBtn=new JButton("Вивести висоту");
        heightBtn.setBounds(250,180,150,50);
        frame.add(heightBtn);


        JTextField typeTf = new JTextField("");
        typeTf.setBounds(145, 30, 100, 30);
        frame.add(typeTf);
        Label typeLb = new Label("Вид дерева");
        typeLb.setBounds(25, 30, 100, 30);
        frame.add(typeLb);
        JTextField heightTf = new JTextField("");
        heightTf.setBounds(145, 70, 100, 30);
        frame.add(heightTf);
        Label heightLb = new Label("Висота дерева");
        heightLb.setBounds(25, 70, 100, 30);
        frame.add(heightLb);
        JTextField widthTrunkTf = new JTextField("");
        widthTrunkTf.setBounds(145, 110, 100, 30);
        frame.add(widthTrunkTf);
        Label widthTrunkLb = new Label("Діаметр стовбуру");
        widthTrunkLb.setBounds(25, 110, 100, 30);
        frame.add(widthTrunkLb);
        JTextField widthVrownTf = new JTextField("");
        widthVrownTf.setBounds(145, 150, 100, 30);
        frame.add(widthVrownTf);
        Label widthVrownLb = new Label("Діаметр крони");
        widthVrownLb.setBounds(25, 150, 100, 30);
        frame.add(widthVrownLb);
        JTextField ageTf = new JTextField("");
        ageTf.setBounds(145, 190, 100, 30);
        frame.add(ageTf);
        Label ageLb = new Label("Вік дерева");
        ageLb.setBounds(25, 190, 100, 30);
        frame.add(ageLb);


        Label resultLb = new Label("");
        resultLb.setBounds(25, 230, 300, 30);
        frame.add(resultLb);

        createBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1 = new Tree();
                t1.type = typeTf.getText();
                System.out.println(typeTf.getText());
                try {
                    t1.height = Integer.parseInt(heightTf.getText());
                }
                catch(Exception ex) {}
                try{
                t1.widthTrunk = Float.parseFloat(widthTrunkTf.getText());
                }
                catch(Exception ex){}
                try{
                t1.widthVrown = Float.parseFloat(widthVrownTf.getText());
                }
                catch(Exception ex){}
                try{
                t1.age = Integer.parseInt(ageTf.getText());
                }
                catch(Exception ex){}
                try{
                ageTf.setToolTipText(String.valueOf(t1.age));
                }
                catch(Exception ex){}
            }
        });

//        createBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//
//                int height;          //висота
//                float widthTrunk;    //діаметр стовбуру
//                float widthVrown;    //діаметр крони
//
//                height = Integer.parseInt(heightTf.getText());
//                widthTrunk = Float.parseFloat(widthTrunkTf.getText());
//                widthVrown = Float.parseFloat(widthVrownTf.getText());
//                t1 = new Tree(widthVrown,widthTrunk,height);
//                t1.age = Integer.parseInt(ageTf.getText());
//                t1.height = Integer.parseInt(heightTf.getText());
//                t1.type = typeTf.getText();
//            }
//        });
        areaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLb.setText(String.valueOf(t1.getArea()));
            }
        });
        ageBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLb.setText(String.valueOf(t1.getAge()));
            }
        });
        heightBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLb.setText(String.valueOf(t1.getHeight()));


            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
