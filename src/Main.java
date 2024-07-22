public class Main {
    public static void main(String[] args) {
        Company.setCompanyName("Beeline");
        Company.printCompanyName();
        Company.changeCompanyName("Megacom");
        Company.printCompanyName();
        Employee employee = new Employee("Жакшылык", 31, 101);
        System.out.println(employee);
    }
}