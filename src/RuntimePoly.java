class Parent{
    void draw(){System.out.println("parent class");}
}
class Child1 extends Parent{
    void draw(){System.out.println("child1 class");}
}
class Child2 extends Parent{
    void draw(){System.out.println("child2 class");}
}


class RuntimePoly{
    public static void main(String args[]){
        Parent p;
        p=new Child1();
        p.draw();
        p=new Child2();
        p.draw();

    }
}
