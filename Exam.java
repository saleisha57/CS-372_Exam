import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.net.URL;

public class Exam extends javax.swing.JComponent
{
    JFrame frame;
    String line, m;
    int x = 0, y = 50;
    InputStreamReader ir;
    BufferedReader rdr;
    Circle c;
    Square sq;
    Triangle tr;
    Rectangle re;
    JLabel circle, square, rectangle, triangle;
    
    public static void main(String[] args)
    {
	Exam exam = new Exam();
    }

    public Exam()
    {
	init();

	frame.setVisible(true);
    }

    private void init()
    {
	frame = new JFrame("Exam");
	frame.setBounds(100, 100, 500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	frame.setLayout(new FlowLayout());


	c = new Circle();
	sq = new Square();
	tr = new Triangle();
	re = new Rectangle();
	
	String file_name = "shapes.txt";
	
	File file = new File(file_name);
	

	
	try(FileInputStream is = new FileInputStream(file))
	       {
		   ir = new InputStreamReader(is);
		   rdr = new BufferedReader(ir);
	
		   line = "a";
		   	
		   while( line != null)
		       {
			   line = rdr.readLine();
			    System.out.println(line);
		       }
		   
	       }
	catch(Exception ex) {;}
	
	buttons();
	
    }



    private void buttons()
    {
	JButton bu = new JButton("Square");
	JButton b = new JButton("Circle");
	JButton bto = new JButton("Rectangle");
	JButton button = new JButton("Triangle");
	
	frame.add(b);
	frame.add(bu);
	frame.add(bto);
	frame.add(button);


	try
	    {		
		Toolkit t = Toolkit.getDefaultToolkit();
		URL imgurl = getClass().getResource("/images/circle.png");
		Image img = t.getImage(imgurl);
		img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		
		ImageIcon icon = new ImageIcon(img);
		circle = new JLabel(icon);
		b.addActionListener( new ActionListener() 
		    {
			public void actionPerformed(ActionEvent ae) 
			{		    
			    System.out.println(c.getDetailString());
			    frame.add(circle);			    
			}
			
		    });
	    }
		    
	catch(Exception e) {;}
	

	try
	    {		
		Toolkit t = Toolkit.getDefaultToolkit();
		URL imgurl = getClass().getResource("/images/square.png");
		Image img = t.getImage(imgurl);
		img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		
		ImageIcon icon = new ImageIcon(img);
		square = new JLabel(icon);
		bu.addActionListener( new ActionListener() 
		    {
			public void actionPerformed(ActionEvent ae) 
			{		    
			    System.out.println(sq.getDetailString());
			    frame.add(square);			    
			}
			
		    });
	    }
		    
	catch(Exception e) {;}




	try
	    {		
		Toolkit t = Toolkit.getDefaultToolkit();
		URL imgurl = getClass().getResource("/images/rectangle.png");
		Image img = t.getImage(imgurl);
		img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		
		ImageIcon icon = new ImageIcon(img);
		rectangle = new JLabel(icon);
		bto.addActionListener( new ActionListener() 
		    {
			public void actionPerformed(ActionEvent ae) 
			{		    
			    System.out.println(re.getDetailString());
			    frame.add(rectangle);			    
			}
			
		    });
	    }
		    
	catch(Exception e) {;}

	try
	    {		
		Toolkit t = Toolkit.getDefaultToolkit();
		URL imgurl = getClass().getResource("/images/triangle.png");
		Image img = t.getImage(imgurl);
		img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		
		ImageIcon icon = new ImageIcon(img);
		triangle = new JLabel(icon);
		button.addActionListener( new ActionListener() 
		    {
			public void actionPerformed(ActionEvent ae) 
			{		    
			    System.out.println(tr.getDetailString());
			    frame.add(triangle);			    
			}
			
		    });
	    }
		    
	catch(Exception e) {;}
	
	



	


	
	
	
    }


}


