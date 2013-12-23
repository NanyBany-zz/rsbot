package rsbot.src.nanybanymining.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

import rsbot.src.nanybanymining.gui.NanyBanyMiningGui;

public class ComboBoxListener implements ActionListener {
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox areasComboBox = (JComboBox)e.getSource();
        
        switch (areasComboBox.getSelectedIndex()) {
            case 0:
                NanyBanyMiningGui.rocksToMineListModel.clear();
                NanyBanyMiningGui.chosenRocksListModel.clear();
                break;
            case 1:
                NanyBanyMiningGui.rocksToMineListModel.clear();
                NanyBanyMiningGui.rocksToMineListModel.addElement("Tin");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Copper");
                break;
            case 2:
                NanyBanyMiningGui.rocksToMineListModel.clear();
                NanyBanyMiningGui.rocksToMineListModel.addElement("Coal");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Mithril");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Adamantite");
                break;
            case 3:
                NanyBanyMiningGui.rocksToMineListModel.clear();
                NanyBanyMiningGui.rocksToMineListModel.addElement("Tin");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Copper");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Iron");
                break;
            case 4:
                NanyBanyMiningGui.rocksToMineListModel.clear();
                NanyBanyMiningGui.rocksToMineListModel.addElement("Tin");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Copper");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Iron");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Silver");
                break;
            case 5:
                NanyBanyMiningGui.rocksToMineListModel.clear();
                NanyBanyMiningGui.rocksToMineListModel.addElement("Tin");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Copper");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Iron");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Silver");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Coal");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Gold");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Mithril");
                NanyBanyMiningGui.rocksToMineListModel.addElement("Adamantite");
                break;
        }
    }
    
}

