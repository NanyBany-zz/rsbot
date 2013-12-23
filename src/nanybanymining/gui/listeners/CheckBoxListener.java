package rsbot.src.nanybanymining.gui.listeners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

import rsbot.src.nanybanymining.gui.NanyBanyMiningGui;

public class CheckBoxListener implements ItemListener {
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox checkBox = (JCheckBox)e.getSource();
        
        if (checkBox.equals(NanyBanyMiningGui.powerMineCheckBox) &&
                NanyBanyMiningGui.powerMineCheckBox.isSelected()) {
            NanyBanyMiningGui.actionBarCheckBox.setEnabled(true);
        }
        else if (checkBox.equals(NanyBanyMiningGui.powerMineCheckBox) &&
                    !NanyBanyMiningGui.powerMineCheckBox.isSelected()) {
            
            if (NanyBanyMiningGui.actionBarCheckBox.isSelected()) {
                
                NanyBanyMiningGui.actionBarCheckBox.setSelected(false);
            }
            
            NanyBanyMiningGui.actionBarCheckBox.setEnabled(false);
        }
    }
}