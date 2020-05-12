

import javax.swing.*;
import javax.swing.table.*;

class Model extends AbstractTableModel{

    private String [] column;
    private Object[][] row;
    private int count;
    public Model(){}
    public Model(Object[][]data, String[] c, int co){
        this.column = c;
        this.row = data;
        this.count = co;
    }
    public Class getColumnClass(int colum){
    if(colum == count){
        return Icon.class;
    }
    else{
        return getValueAt(0,colum).getClass();
    }
    }
    public int getRowCount() {
         return this.row.length;
    }

 
    public int getColumnCount() {
        return column.length;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        return row [rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.column[col];
    }
    
}
