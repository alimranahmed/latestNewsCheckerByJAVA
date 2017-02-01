import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.*;
public class View extends JFrame{
    private JPanel windowPanel = new JPanel();
    Font headingFont = new Font("Noto Serif Bengali", Font.PLAIN, 18);
    int height = 400;
    int width = 400;
    int rightPadding = 10;
    int topPadding = 0;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public View(){
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);//to hide minimize and maximize buttons
        this.setLocation((int)screenSize.getWidth() - width, 25);

        this.setLayout(null);
        this.setResizable(false);
        this.add(this.windowPanel);
        this.windowPanel.setBounds(rightPadding, topPadding, width - rightPadding, height - topPadding);
        this.setVisible(true);
    }

    public void inflate(ArrayList<String> headingList){
        //Clear all previous component in windowPanel
        this.windowPanel.removeAll();
        int numberOfHeading = headingList.size();
        this.windowPanel.setLayout(new GridLayout(numberOfHeading, 1));

        for(int i = 0; i < numberOfHeading; i++){
            String heading = headingList.get(i);
            JLabel labelToShow = new JLabel(heading);
            labelToShow.setFont(this.headingFont);
            this.windowPanel.add(labelToShow);
        }
        System.out.println("End of Inflation");
        //this.windowPanel.setBorder(new EmptyBorder(10, 10, 10, 10))
        this.windowPanel.revalidate();
        this.windowPanel.repaint();
    }
}
