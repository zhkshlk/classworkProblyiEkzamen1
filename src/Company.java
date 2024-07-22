public class Company {
    private static String companyName;

    public static void printCompanyName() {
        System.out.println(companyName);
    }
    public static void changeCompanyName (String newName) {
        companyName = newName;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Company.companyName = companyName;
    }
}
