/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alber
 */
//Table to show lists that contains pictures
public class MyTable extends AbstractTableModel {

        private String[] columns;
        private Object[][] rows;

        public MyTable() {
        }

        public MyTable(Object[][] data, String[] columnsName) {
                this.columns = columnsName;
                this.rows = data;
        }

        public Class getColumnClass(int col) {
                // the index of the image column is 4
                if (col == 4) {
                        return Icon.class;
                } else {
                        return getValueAt(0, col).getClass();
                }
        }

        @Override
        public int getRowCount() {
                return this.rows.length;
        }

        @Override
        public int getColumnCount() {
                return this.columns.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
                return this.rows[rowIndex][columnIndex];
        }

        @Override
        public String getColumnName(int col) {
                return this.columns[col];
        }
}
