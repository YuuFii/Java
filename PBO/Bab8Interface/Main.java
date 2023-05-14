package Bab8Interface;

/*
 * By Nico Arya Divano (225150207111045)
 */

interface Payable{
    public int getPayableAmount();
}

class Invoice implements Payable{
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem){
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public int getPayableAmount(){
        return quantity * pricePerItem;
    }

}

class Employee implements Payable{
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;
    private int index = 0;

    public Employee(int registrationNumber, String name, int salaryPerMonth){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new Invoice[100];
    }

    public String getName() {
        return name;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void buyItem(String productName, int quantity, int pricePerItem){
        invoices[index] = new Invoice(productName, quantity, pricePerItem);
        index++;
    }

    public int getPayableAmount(){
        int payableAmount = 0;
        for(int i = 0; i < invoices.length; i++){
            if(invoices[i] == null) break;
            payableAmount += invoices[i].getPayableAmount();
        }

        return payableAmount;
    }

    public void employeeProfile(){
        System.out.println("=========================================");
        System.out.println("              DATA KARYAWAN              ");
        System.out.println("          PERUSAHAAN NV. MENEER          ");
        System.out.println("=========================================");
        System.out.printf("%-20s : %s\n", "Nama", getName());
        System.out.printf("%-20s : %d\n", "Nomor Registrasi", getRegistrationNumber());
        System.out.printf("%-20s : Rp%d\n", "Gaji", getSalaryPerMonth());
        System.out.println("=========================================");
        for (int i = 0; i < invoices.length; i++) {
            if(invoices[i] != null){
                System.out.println(invoices[i].getProductName());
                System.out.printf("%5d x Rp%8d           Rp%10d\n", invoices[i].getQuantity(), invoices[i].getPricePerItem(), invoices[i].getPayableAmount());
            }
        }
        System.out.println("=========================================");
        System.out.printf("%-20s :       Rp%10d\n", "Total Belanja", getPayableAmount());
        System.out.printf("%-20s :       Rp%10d\n", "Total Gaji Bersih", (getSalaryPerMonth() - getPayableAmount()));
    }
}

public class Main{
    public static void main(String[] args){
        Employee employee = new Employee(241104, "Nico Arya Divano", 5000000);
        employee.buyItem("Beng-Beng", 20, 2500);
        employee.buyItem("Teh Pucuk", 5, 3500);
        employee.buyItem("Japota", 3, 11000);
        employee.employeeProfile();
    }
}