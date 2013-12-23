package rsbot.src.nanybanymining.gui.listeners;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import rsbot.src.nanybanymining.gui.NanyBanyMiningGui;

public class ListListener implements ListSelectionListener {

    @Override
    public void valueChanged(ListSelectionEvent e) {
        JList list = (JList) e.getSource();

        if (e.getValueIsAdjusting()) {
            if (list.equals(NanyBanyMiningGui.rocksToMineList)) {
                if (list.getSelectedIndex() != -1) {
                    NanyBanyMiningGui.chosenRocksListModel.addElement(
                            NanyBanyMiningGui.rocksToMineListModel.getElementAt(
                                    list.getSelectedIndex()));
                    NanyBanyMiningGui.rocksToMineListModel.remove(list.getSelectedIndex());
                }
            }
            if (list.equals(NanyBanyMiningGui.chosenRocksList)) {
                if (list.getSelectedIndex() != -1) {
                    NanyBanyMiningGui.rocksToMineListModel.addElement(
                            NanyBanyMiningGui.chosenRocksListModel.getElementAt(
                                    list.getSelectedIndex()));
                    NanyBanyMiningGui.chosenRocksListModel.remove(list.getSelectedIndex());
                }
            }
        }
    }

}
