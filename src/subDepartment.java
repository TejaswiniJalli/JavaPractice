abstract class Department
        {
abstract int getDepartmentSize();
        }



class subDepartment extends Department {

    public int getDepartmentSize()
    {
        return 40;
    }
    public static void main(String[] args)
    {

        Department d= new subDepartment();
        System.out.println(d.getDepartmentSize());

    }
}