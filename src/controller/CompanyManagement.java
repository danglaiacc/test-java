package controller;

import java.util.ArrayList;
import utilities.Inputter;

public class CompanyManagement {

    private ArrayList<Developer> developers;
    private ArrayList<Tester> testers;
    private ArrayList<TeamLeader> teamLeaders;

    public function showEmployeeList() {

    }

    public function addNewEmployee() {
        Inputter inputer = new Inputter();

        print('Enter employee type (1=Developer, 2=tester, 3=TeamLeader): ');
        Integer newEmployeeType = inputer.inputInt("id must be integer and in range(1, 3)", 1, 3);

        print('Enter employee id: ');
        Integer newEmployeeId = inputer.inputInt("id must be integer and in range(1, 2000000000)", 1, 20000000);
        print('Enter base salary: ');
        Integer newEmployeebaseSalary = inputer.inputInt("id must be integer and in range(1, 2000000000)", 1, 20000000);
        // input emp name

        // for developer
        if (newEmployeeType == 1) {
            print('Enter team name: ');
            String teamName = inputer.inputNonBlankStr("Do not enter empty string");
            // make the same for programing language and exp year

            for each (developerItem in this.developers) {
                if (newEmployeeId == developerItem.getEmpId()) {
                    print('employee id cannot be duplicate')
                    return;
                }
            }

            for each (testerItem in this.testers) {
                if (newEmployeeId == testerItem.getEmpId()) {
                    print('employee id cannot be duplicate')
                    return;
                }
            }

            for each (tempLeaderItem in this.teamLeaders) {
                if (newEmployeeId == tempLeaderItem.getEmpId()) {
                    print('employee id cannot be duplicate')
                    return;
                }
            }
            Developer newDeveloper = new Developer(
                employeeId,
                baseSalary,
                ... 
                teamName,
                ...
            );

            this.developers.add(newDeveloper);
            print('New developer has been added.');

        }

    }


}
