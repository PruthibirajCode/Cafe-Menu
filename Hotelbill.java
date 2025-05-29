import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hotelbill{
    public Hotelbill()
    {
        JFrame jframe=new JFrame("Shiva Cafe");
        jframe.setSize(600,700);
        JLabel jlabel1=new JLabel("Shivasakti");
        jlabel1.setBounds(40,20,100,20);
        JLabel jlabel2=new JLabel("Bar and Resturant");
        jlabel2.setBounds(20,40,200,20);
        JLabel jlabel3=new JLabel("MENU");
        jlabel3.setBounds(200,40,150,20);
        JLabel jlabel4=new JLabel("COFFEE");
        jlabel4.setBounds(30,80,150,20);
        JLabel jlabel5=new JLabel("TEA");
        jlabel5.setBounds(30,270,100,20);
        JLabel jlabel6=new JLabel("NON COFFEE");
        jlabel6.setBounds(300,80,200,20);
        JLabel jlabel7=new JLabel("FRESH JUICE");
        jlabel7.setBounds(300,270,200,20);
        Font font=new Font("Arial", Font.BOLD,20);
        jlabel3.setFont(font);
        Font font2=new Font("Garamond", Font.BOLD,18);
        jlabel2.setFont(font2);
        jlabel1.setFont(font2);
        jlabel4.setFont(font);
        jlabel5.setFont(font);
        jlabel6.setFont(font);
        jlabel7.setFont(font);

        

        
        JCheckBox checkBoxone =new JCheckBox("Espresso                  1200");
        checkBoxone.setBounds(20,100,250,20);
        JCheckBox checkBoxtwo =new JCheckBox("Caffe Americano      1500");
        checkBoxtwo.setBounds(20,125,250,20);
        JCheckBox checkBoxthree =new JCheckBox("Cappuccino              1800");
        checkBoxthree.setBounds(20,150,250,20);
        JCheckBox checkBoxfour =new JCheckBox("Flat White                 2000");
        checkBoxfour.setBounds(20,175,250,20);
        JCheckBox checkBoxfive =new JCheckBox("Caffe Latte               1400");
        checkBoxfive.setBounds(20,200,250,20);
        JCheckBox checkBoxsix =new JCheckBox("Caramel Macchiato   1800");
        checkBoxsix.setBounds(20,225,250,20);
        JCheckBox checkBox7=new JCheckBox("Green Tea                    2500");
        checkBox7.setBounds(20,295,250,20);
        JCheckBox checkBox8 =new JCheckBox("Earl Gray Tea               4000");
        checkBox8.setBounds(20,320,250,20);
        JCheckBox checkBox9=new JCheckBox("Earl Gray Tea Latte     5000");
        checkBox9.setBounds(20,345,250,20);
        JCheckBox checkBox10 =new JCheckBox("Hojicbe Tea Latte        5500");
        checkBox10.setBounds(20,370,250,20);
        JCheckBox checkBox11 =new JCheckBox("Iced Green Tea           5000");
        checkBox11.setBounds(20,395,250,20);
        JCheckBox checkBox12 =new JCheckBox("Hot Milk                       3000");
        checkBox12.setBounds(280,100,250,20);
        JCheckBox checkBox13 =new JCheckBox("Hot Chocolate            2500");
        checkBox13.setBounds(280,125,250,20);
        JCheckBox checkBox14 =new JCheckBox("Iced Chocolate           3000");
        checkBox14.setBounds(280,150,250,20);
        JCheckBox checkBox15 =new JCheckBox("Soy Milk                       2400");
        checkBox15.setBounds(280,175,250,20);
        JCheckBox checkBox16 =new JCheckBox("Almond Milk                 1700");
        checkBox16.setBounds(280,200,250,20);
         JCheckBox checkBox17=new JCheckBox("Watermelon Juice      2000");
        checkBox17.setBounds(280,295,250,20);
        JCheckBox checkBox18 =new JCheckBox("Orange Juice              2500");
        checkBox18.setBounds(280,320,250,20);
        JCheckBox checkBox19=new JCheckBox("Apple Juice                 4000");
        checkBox19.setBounds(280,345,250,20);
        JCheckBox checkBox20 =new JCheckBox("Coconut Juice            3000");
        checkBox20.setBounds(280,370,250,20);
        JCheckBox checkBox21 =new JCheckBox("Grape Juice                2400");
        checkBox21.setBounds(280,395,250,20);
        JCheckBox checkBox22 =new JCheckBox("Lemon Juice               2600");
        checkBox22.setBounds(280,395,250,20);
        JCheckBox checkBox23 =new JCheckBox("Pineapple Juice          3800");
        checkBox23.setBounds(280,420,250,20);
        JButton b=new JButton("Total");
        b.setBounds(170,550,150,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                float ammount=0;
                String msg="";
                if(checkBoxone.isSelected()){
                    ammount+=1200;
                    msg+="Hot Milk  1200\n";
                }
                if(checkBoxtwo.isSelected()){
                    ammount+=1500;
                    msg+="Hot Milk  1500\n";
                }
                if(checkBoxthree.isSelected()){
                    ammount+=1800;
                    msg+="Hot Milk  1800\n";
                }
                if(checkBoxfour.isSelected()){
                    ammount+=2000;
                    msg+="Hot Milk  2000\n";
                }
                if(checkBoxfive.isSelected()){
                    ammount+=1400;
                    msg+="Hot Milk  1400\n";
                }
                if(checkBoxsix.isSelected()){
                    ammount+=1800;
                    msg+="Hot Milk  1800\n";
                }
                if(checkBox7.isSelected()){
                    ammount+=2500;
                    msg+="Hot Milk  2500\n";
                }
                if(checkBox8.isSelected()){
                    ammount+=4000;
                    msg+="Hot Milk  4000\n";
                }
                if(checkBox9.isSelected()){
                    ammount+=5000;
                    msg+="Hot Milk  5000\n";
                }
                if(checkBox10.isSelected()){
                    ammount+=5500;
                    msg+="Hot Milk  5500\n";
                }
                if(checkBox11.isSelected()){
                    ammount+=5000;
                    msg+="Hot Milk  5000\n";
                }
                if(checkBox12.isSelected()){
                    ammount+=3000;
                    msg+="Hot Milk  3000\n";
                }
                if(checkBox13.isSelected()){
                    ammount+=2500;
                    msg+="Hot Milk  2500\n";
                }
                if(checkBox14.isSelected()){
                    ammount+=3000;
                    msg+="Hot Milk  3000\n";
                }
                if(checkBox15.isSelected()){
                    ammount+=2400;
                    msg+="Hot Milk  2400\n";
                }
                if(checkBox16.isSelected()){
                    ammount+=1700;
                    msg+="Hot Milk  1700\n";
                }
                if(checkBox17.isSelected()){
                    ammount+=2000;
                    msg+="Hot Milk  2000\n";
                }
                if(checkBox18.isSelected()){
                    ammount+=2500;
                    msg+="Hot Milk  2500\n";
                }
                if(checkBox19.isSelected()){
                    ammount+=4000;
                    msg+="Hot Milk  4000\n";
                }
                if(checkBox20.isSelected()){
                    ammount+=3000;
                    msg+="Hot Milk  3000\n";
                }
                if(checkBox21.isSelected()){
                    ammount+=2400;
                    msg+="Hot Milk  2400\n";
                }
                if(checkBox22.isSelected()){
                    ammount+=2600;
                    msg+="Hot Milk  2600\n";
                }
                if(checkBox23.isSelected()){
                    ammount+=3800;
                    msg+="Hot Milk  3800\n";
                }
                msg+="------------------------\n";
                JOptionPane.showMessageDialog(jframe,msg+" Total "+ammount);
            }
        });
        jframe.add(b);
        jframe.add(jlabel1);
        jframe.add(jlabel2);
        jframe.add(jlabel3);
        jframe.add(jlabel4);
        jframe.add(jlabel5);
        jframe.add(jlabel6);
        jframe.add(jlabel7);
        jframe.add(checkBoxone);
        jframe.add(checkBoxtwo);
        jframe.add(checkBoxthree);
        jframe.add(checkBoxfour);
        jframe.add(checkBoxfive);
        jframe.add(checkBox7);
        jframe.add(checkBox8);
        jframe.add(checkBox9);
        jframe.add(checkBox10);
        jframe.add(checkBox11);
        jframe.add(checkBox12);
        jframe.add(checkBox13);
        jframe.add(checkBox14);
        jframe.add(checkBox15);
        jframe.add(checkBox16);
        jframe.add(checkBox17);
        jframe.add(checkBox18);
        jframe.add(checkBox19);
        jframe.add(checkBox20);
        jframe.add(checkBox21);
        jframe.add(checkBox22);
        jframe.add(checkBox23);
        
        
        
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        Hotelbill h=new Hotelbill();
    }

}    
    

