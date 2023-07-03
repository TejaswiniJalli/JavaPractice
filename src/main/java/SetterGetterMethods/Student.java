package SetterGetterMethods;

class Student {
    public String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("tejaswini jalli");
        System.out.println(obj.getName());

    }
}


