/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Anderson
 */
public class Reportes {  

    /**
     * 
     * 
     * @param args the command line arguments
     */
    public void reporteUsuarios() throws JRException,SQLException{
        
        //try {
           // Class.forName("com.mysql.jdbc.Driver");//libreria
            
            Connection conec;
            
            conec=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/db_peslac","root","");
            
            JasperReport report=(JasperReport)JRLoader.loadObjectFromFile("C:\\Users\\Anderson\\Desktop\\reportes\\src\\reportes\\newReport1.jasper");
            JasperPrint im=JasperFillManager.fillReport(report, null, conec);
            JasperViewer ver=new JasperViewer(im);
            ver.setTitle("Usuarios");
            ver.setVisible(true);
            
        /*} catch (ClassNotFoundException ex) {
           Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
    
    }

}
