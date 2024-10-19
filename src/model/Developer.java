
public class Developer extends Employee {

    private  string teamName;
    private  string programmingLanguages;
    private  int expYear;

    public function  getSalary() {
        // return 0;

        if (this.expYear >= 5){
            return this.getBaseSal() + this.expYear * 2000000;
        }

        if (3<= this.expYear && this.expYear < 5){
            return this.getBaseSal() + this.expYear * 1000000;
        }
        return this.getBaseSal();
    }

    public function  toString() {
        // print ... empID_empName_baseSal_teamName_expYear 
    }
}