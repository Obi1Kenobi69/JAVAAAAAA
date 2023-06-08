package morskoy;

import javax.swing.*;
import java.awt.*;
public class okno  extends JFrame {
	public okno()
	{
		pole pan= new pole();
		Container cont=getContentPane();
		cont.add(pan);
		setTitle("Игра\"РЕЗНЯЯЯЯ ЗВЁЗДНОЙ ПЫЛИ\"");
		setBounds(0,0,900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

}
