package Java;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GUI extends JPanel implements ActionListener {

    private JTextField textField;
    private JLabel resultPicture;

    private JPanel searchPanel;
    private JPanel resultPanel;

    public GUI() {

        initializeLabels();
        initializeSearchResult();

        setLayout(new GridLayout(2,1));
        add(searchPanel);
        add(resultPanel);

    }

    public void actionPerformed(ActionEvent event) {

    }

    private void initializeLabels() {
        searchPanel = new JPanel();
        searchPanel.setLayout(new GridLayout(1,3));
        resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(1,2));

        searchPanel.add(new JLabel("Search: "));
        searchPanel.add(textField);
        searchPanel.add(new JButton("Search!"));
        resultPanel.add(new JLabel("Result: "));
        resultPanel.add(resultPicture);
    }

    private void initializeSearchResult() {

    }
}
