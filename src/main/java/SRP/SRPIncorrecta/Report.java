/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRP.SRPIncorrecta;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Report {

    private String title;
    private String body;

    public Report(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void generateReport() {
        // Genera el reporte en un formato específico
        System.out.println("Generating report...");
    }

    public void printReport() {
        // Imprime el reporte
        System.out.println("Printing report: " + title);
    }
    
     public static void main(String[] args) {
         Report report1 = new Report("Reporte 1", "El reporte es Incorrecto");
         
         report1.generateReport();
         
         report1.printReport();
     }
}
