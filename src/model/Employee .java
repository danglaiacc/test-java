public abstract class Employee {
    private integer empID; // employee code cannot be changed after created, so it does not have setter
    private string empName;
    private integer baseSal;

    public abstract function  getSalary();

    public function toString(){
        system.out.println(this.empID + "_"+this.empName +...);
    }

    public float getBaseSal(){
        return this.baseSal;
    }

}