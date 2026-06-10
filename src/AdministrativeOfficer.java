public class AdministrativeOfficer extends Employee {
    private String officeSection;

    public AdministrativeOfficer(int memberId,
                                 String name,
                                 double salary,
                                 String officeSection) {

        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    public void manageOffice() {
        System.out.println("Office Section: " + officeSection);
    }

    @Override
    public void performDuty() {
        System.out.println("Managing university administration.");
    }
}