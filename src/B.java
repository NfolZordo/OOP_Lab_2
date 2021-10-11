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

        JButton areaBtn=new JButton("Вивести дані");
        areaBtn.setBounds(250,130,150,50);
        frame.add(areaBtn);

        JTextField nameBrandTf = new JTextField("");
        nameBrandTf.setBounds(145, 30, 100, 30);
        frame.add(nameBrandTf);
        Label nameBrandLb = new Label("Назва кави");
        nameBrandLb.setBounds(25, 30, 100, 30);
        frame.add(nameBrandLb);
        JTextField numberPackagesTf = new JTextField("");
        numberPackagesTf.setBounds(145, 70, 100, 30);
        frame.add(numberPackagesTf);
        Label numberPackagesLb = new Label("Кількість упаковок");
        numberPackagesLb.setBounds(25, 70, 100, 30);
        frame.add(numberPackagesLb);
        JTextField weightOneTf = new JTextField("");
        weightOneTf.setBounds(145, 110, 100, 30);
        frame.add(weightOneTf);
        Label weightOneLb = new Label("Вага 1 упаковки");
        weightOneLb.setBounds(25, 110, 100, 30);
        frame.add(weightOneLb);
        JTextField numberDaysStorageTf = new JTextField("");
        numberDaysStorageTf.setBounds(145, 150, 100, 30);
        frame.add(numberDaysStorageTf);
        Label numberDaysStorageLb = new Label("Кі-сть дн. зберігання");
        numberDaysStorageLb.setBounds(25, 150, 100, 30);
        frame.add(numberDaysStorageLb);
        JTextArea allTextArea = new JTextArea("");
        allTextArea.setBounds(25, 200, 370, 110);
        frame.add(allTextArea);

        createBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    t1 = new Tree(nameBrandTf.getText(), Integer.parseInt(numberPackagesTf.getText()), Float.parseFloat(weightOneTf.getText()), Integer.parseInt(numberDaysStorageTf.getText()));
                }
                catch(Exception ex) {
                    t1 = new Tree();
                }
            }
        });
        areaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                allTextArea.setText("");
                allTextArea.append("Назва кави - ");
                allTextArea.append(String.valueOf(t1.getNameBrand()));
                allTextArea.append("\n");
                allTextArea.append("Кількість упаковок - ");
                allTextArea.append(String.valueOf(t1.getNumberPackages()));
                allTextArea.append("\n");
                allTextArea.append("Вага 1 упаковки - ");
                allTextArea.append(String.valueOf(t1.getWeightOne()));
                allTextArea.append("\n");
                allTextArea.append("Загальна вага партії - ");
                allTextArea.append(String.valueOf(t1.getWeightTotal()));
                allTextArea.append("\n");
                allTextArea.append("Кі-сть дн. зберігання - ");
                allTextArea.append(String.valueOf(t1.getNumberDaysStorage()));
                allTextArea.append("\n");

            }
        });


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
