/*import java.awt.*;  
import java.awt.event.*;  
public class AdapterExample extends WindowAdapter{  
    Frame f;  
    AdapterExample(){  
        f=new Frame();  
        f.addWindowListener(this);  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void windowClosing(WindowEvent e) {  
    f.dispose();  
}  
public static void main(String[] args) {  
    new AdapterExample();  
}  
} */
import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
public class WindowExample extends Frame implements WindowListener{  
    WindowExample(){  
        addWindowListener(this);  
          
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
      
public static void main(String[] args) {  
    new WindowExample();  
}  
public void windowActivated(WindowEvent e) {}  
public void windowClosed(WindowEvent e) {}  
public void windowClosing(WindowEvent e) {  
    dispose();  
}  
public void windowDeactivated(WindowEvent e) {}  
public void windowDeiconified(WindowEvent e) {}  
public void windowIconified(WindowEvent e) {}  
public void windowOpened(WindowEvent arg0) {}  
}   