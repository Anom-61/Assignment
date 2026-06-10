import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<UniversityMember> members = new ArrayList<>();

        members.add(
                new Professor(
                        101,
                        "Dr. Khan",
                        90000,
                        "ICT",
                        "Software Engineering",
                        35
                )
        );

        members.add(
                new AdministrativeOfficer(
                        201,
                        "Mr. Anis",
                        50000,
                        "Examination Office"
                )
        );

        System.out.println("===== UNIVERSITY MEMBERS =====");

        for (UniversityMember member : members) {

            member.displayBasicInfo();

            System.out.print("Duty: ");
            member.performDuty();

            System.out.println();
        }

        System.out.println("===== PROFESSOR RESEARCH PROFILE =====");

        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor p = (Professor) member;

                p.showResearchProfile();

                System.out.println();
            }
        }
    }
}
