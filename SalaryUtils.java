public class SalaryUtils {
//Создать класс SalaryUtils, в котором будет статический метод
// calculateSalaryForOneMonth(Employee employee, Month month),
// который рассчитает зарплату для переданного сотрудника за указанный месяц.
//
//В том же классе создать статический
// метод calculateSalaryForManyMonths(Employee employee, Month[] months),
// который вычислит зарплату сотрудника за несколько месяцев.
public static double calculateSalaryForOneMonth(Employee employee, Month month) {
    double eachSalaryPerMonth = employee.salaryPerDay * month.workDay;
    return eachSalaryPerMonth;
}

   public static double calculateSalaryForManyMonths(Employee employee, Month[] months){
    double severalSalary=0;

    for (int i=0; i< months.length; i++){
        Month current =months[i];
        double s= calculateSalaryForOneMonth(employee,current);
        severalSalary+=s ;
    }
    return severalSalary;
   }
    public static void main(String[] args) {
        Employee empl1 = new Employee("Леся", 35, "female", 145.0);
        Employee empl = new Employee("Иван", 38, "male", 123.0);
        Month jan = MonthUtils.JAN;
        Month feb = MonthUtils.FEB;
        Month mar = MonthUtils.MAR;

        Month[] months= MonthUtils. allMonth;
        System.out.println(calculateSalaryForOneMonth(empl, jan));
        System.out.println(calculateSalaryForOneMonth(empl1, mar));
        System.out.println(calculateSalaryForManyMonths(empl,months));
    }
    }






