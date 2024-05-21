package controller;

import java.util.List;
import java.util.ArrayList;
import Datasewa.dataSewa;
import DataSewaImplement.datasewaImplement;
import model.*;
import view.MainViewSewa;

public class DataSewaController {
    MainViewSewa frame;
    
    datasewaImplement ids; // implement data sewa
    List <DataSewa> ds;
    
    public DataSewaController(MainViewSewa frame) {
        this.frame = frame;
        ids = new dataSewa();
        ds = ids.getAll();
    }
    
    public void insert() {
        DataSewa ds = new DataSewa();
        ds.setNP(frame.getNP().getText());
        ds.setNB(frame.getNB().getText());
        ds.setJB(frame.getJB().getText());
        ds.setNT(frame.getNT().getText());
        ds.setDP(Double.parseDouble(frame.getDP().getText()));
        ds.setTB(ds.htb());
        ids.insert(ds);
    }
    
    public void update() {
        DataSewa ds = new DataSewa();
        ds.setNP(frame.getNP().getText());
        ds.setNB(frame.getNB().getText());
        ds.setJB(frame.getJB().getText());
        ds.setNT(frame.getNT().getText());
        ds.setDP(Double.parseDouble(frame.getDP().getText()));
        ds.setTB(ds.htb());
        ids.update(ds);
    }
    
    public void delete() {
        String np = frame.getNP().getText();
        ids.delete(np);
    }
}
