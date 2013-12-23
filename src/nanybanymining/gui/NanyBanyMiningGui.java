package rsbot.src.nanybanymining.gui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;

import rsbot.src.nanybanymining.gui.listeners.ButtonListener;
import rsbot.src.nanybanymining.gui.listeners.CheckBoxListener;
import rsbot.src.nanybanymining.gui.listeners.ComboBoxListener;
import rsbot.src.nanybanymining.gui.listeners.ListListener;

public class NanyBanyMiningGui extends JFrame {
    
    public static String[] comboBoxItems = 
	{"None", "Lumbridge East", "Lumbridge West",
	"Varrock East", "Varrock West", "Al Kharid"};
    
    private JPanel containerPanel = new JPanel();
    private JPanel checkBoxContainerPanel = new JPanel();
    private JPanel areaPanel = new JPanel();
    private JPanel checkBoxPanel = new JPanel();
    private JPanel rocksToMinePanel = new JPanel();
    private JPanel chosenRocksPanel = new JPanel();
    private JPanel buttonsPanel = new JPanel();
    
    private JLabel areasToMineLabel = new JLabel("Areas To Mine");
    public static JComboBox areasToMineComboBox = new JComboBox(comboBoxItems);
    
    public static JCheckBox powerMineCheckBox = new JCheckBox("Powermine");
    public static JCheckBox actionBarCheckBox = new JCheckBox("Use action bar");
    
    private JLabel rocksToMineLabel = new JLabel("Rocks To Mine");
    public static DefaultListModel<String> rocksToMineListModel =
            new DefaultListModel<>();
    public static JList<String> rocksToMineList = new JList<>();
    public JScrollPane rocksToMineScrollPane = new JScrollPane(rocksToMineList);
    
    private JLabel chosenRocksLabel = new JLabel("Chosen Rocks");
    public static DefaultListModel<String> chosenRocksListModel = 
            new DefaultListModel<>();
    public static JList<String> chosenRocksList = new JList<>();
    private JScrollPane chosenRocksScrollPane = new JScrollPane(chosenRocksList);
    
    public static JButton startButton = new JButton("Start");
    public static JButton cancelButton = new JButton("Cancel");
    
    private GridBagConstraints c = new GridBagConstraints();
    
    public NanyBanyMiningGui() {
        setTitle("Nany Bany Mining");
        setSize(466, 254);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridBagLayout());
        
        setUpComponents();
        
        setVisible(true);
    }
    
    public void setUpComponents() {
        
        containerPanel.setLayout(new GridBagLayout());
        
        areaPanel.setPreferredSize(new Dimension(140, 60));
        areaPanel.add(areasToMineLabel);
        areasToMineComboBox.addActionListener(new ComboBoxListener());
        areaPanel.add(areasToMineComboBox);
        c.gridx = 0;
        c.gridy = 0;
        containerPanel.add(areaPanel, c);
        
        checkBoxContainerPanel.setLayout(new GridLayout(2, 0));
        checkBoxPanel.setLayout(new GridLayout(2, 0));
        checkBoxContainerPanel.setPreferredSize(new Dimension(110, 110));
        checkBoxContainerPanel.add(checkBoxPanel);
        powerMineCheckBox.addItemListener(new CheckBoxListener());
        actionBarCheckBox.addItemListener(new CheckBoxListener());
        actionBarCheckBox.setEnabled(false);
        checkBoxPanel.add(powerMineCheckBox);
        checkBoxPanel.add(actionBarCheckBox);
        c.gridx = 0;
        c.gridy = 1;
        c.weighty = .1;
        containerPanel.add(checkBoxContainerPanel, c);
        
        rocksToMineList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        rocksToMineList.setModel(rocksToMineListModel);
        rocksToMineList.addListSelectionListener(new ListListener());
        rocksToMineScrollPane.setPreferredSize(new Dimension(125, 150));
        rocksToMinePanel.add(rocksToMineLabel);
        rocksToMinePanel.add(rocksToMineScrollPane);
        
        chosenRocksList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        chosenRocksList.setModel(chosenRocksListModel);
        chosenRocksList.addListSelectionListener(new ListListener());
        chosenRocksScrollPane.setPreferredSize(new Dimension(125, 150));
        chosenRocksPanel.add(chosenRocksLabel);
        chosenRocksPanel.add(chosenRocksScrollPane);
        
        startButton.addActionListener(new ButtonListener());
        cancelButton.addActionListener(new ButtonListener());
        buttonsPanel.add(startButton);
        buttonsPanel.add(cancelButton);
        
        containerPanel.setPreferredSize(new Dimension(150, 180));
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0;
        c.weightx = 0;
        add(containerPanel, c);
        
        rocksToMinePanel.setPreferredSize(new Dimension(150, 180));
        c.gridx = 1;
        add(rocksToMinePanel, c);
        
        chosenRocksPanel.setPreferredSize(new Dimension(150, 180));
        c.gridx = 2;
        add(chosenRocksPanel, c);
        
        buttonsPanel.setPreferredSize(new Dimension(300, 35));
        c.gridx = 0;
        c.gridy = 1;
        c.weighty = .5;
        c.gridwidth = 3;
        add(buttonsPanel, c);
    }
    
}
