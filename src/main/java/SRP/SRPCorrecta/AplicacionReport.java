/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRP.SRPCorrecta;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class AplicacionReport {
    
     public static void main(String[] args) {
         Report reporte = new Report("Reporte 1", "El reporte es correcto");         
         ReportGenerator rg = new ReportGenerator();        
         ReportPrinter rp = new ReportPrinter();
         rg.generateReport(reporte);
         rp.printReport(reporte);
         
     }
     
     
}
