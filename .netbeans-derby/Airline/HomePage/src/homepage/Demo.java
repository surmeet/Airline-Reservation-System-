
package homepage;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;


class demoHome extends JFrame
{
    demoHome()
    {
        Container c=getContentPane();
        
        JPanel parent=new JPanel();
        c.add(parent);
        
        CardLayout cl=new CardLayout();
        parent.setLayout(cl);
        
        Home2 h1=new Home2(parent);
       // Status s1=new Status(parent);
        //book b1=new book(parent);
        
        parent.add("Home2",h1);
        //parent.add("Book",b1);
      // parent.add("Status",s1);
       
        cl.show(parent,"Home2");
        setSize(500,500);
        setVisible(true); 
 
    }
    
}

public class Demo 
{
    public static void main(String [] args)
    {  
       new demoHome();
    }
}
