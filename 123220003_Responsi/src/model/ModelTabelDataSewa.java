package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTabelDataSewa extends AbstractTableModel{
    List <DataSewa> ds; // data sewa 
    
    public ModelTabelDataSewa (List <DataSewa> ds) {
        this.ds = ds;
    }

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nama Penyewa";
            case 1:
                return "Nama Buku";
            case 2:
                return "Jenis Buku";
            case 3:
                return "Nomor Telepon";
            case 4:
                return "Durasi Penitipan";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return ds.get(row).getNP();
            case 1:
                return ds.get(row).getNB();
            case 2:
                return ds.get(row).getJB();
            case 3:
                return ds.get(row).getNT();
            case 4:
                return ds.get(row).getDP();
            default:
                return null;
        }
    }
}
