package ufs.view;

import ufs.Model;

import javax.swing.*;
import java.awt.*;

public class View {
    private Model model;
    private JFrame frame;

    public View(Model model){
        this.model = model;
        this.frame = new JFrame();

        frame.setTitle("Under Falling Skies");
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void refresh(){

    }

    public Model getModel() {
        return model;
    }

    public JFrame getFrame() {
        return frame;
    }
}
