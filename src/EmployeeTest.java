public class EmployeeTest {

    public static void main(String[] args) {
        Date birthDate =new Date(15,10,1999);
        Date hireDate = new Date(12,20,2000);
        hireDate.setDay(31);
        hireDate.setMonth(9);
        hireDate.setYear(2023);
        Date weddingDate=new Date(9, 4, 2016);
        Employee sarah =new Employee("Serah","Adelola","22224567890", Gender.FEMALE, birthDate,hireDate,weddingDate);


        sarah.displayEmployeeInfo();
    }
}
