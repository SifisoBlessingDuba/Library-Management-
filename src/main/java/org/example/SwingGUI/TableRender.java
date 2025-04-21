package org.example.SwingGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class TableRender extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {

            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (column == 0) {
                // Time slot column: no color
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            } else {
                String val = value.toString();
                setText("");
                if (val.equalsIgnoreCase("Booked")) {
                    cell.setBackground(Color.RED);
                    cell.setForeground(Color.WHITE);
                } else if (val.equalsIgnoreCase("Free")) {
                    cell.setBackground(Color.GREEN);
                    cell.setForeground(Color.BLACK);
                } else {
                    cell.setBackground(Color.LIGHT_GRAY);
                    cell.setForeground(Color.BLACK);
                }
            }

            return cell;
        }
    }


