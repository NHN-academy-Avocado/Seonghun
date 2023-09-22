package chapter9_3;
public class Base {
    public Base () {
        infob = "I am an object of the Base class";
    }
    public String getInfo() {
        return infob;
    }
    private String infob;
}
    
class Derived extends Base  {
    public Derived() {
        super();
        infod = "I am an object of the Derived class";
    }
    public String getInfo() {
        return infod + ", " + super.getInfo();
    }
    private String infod;
}

class Exercise3 {
    public static void main(String[] args) {
        Base  b = new Base ();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }
}

// public class는 한 파일에 하나씩만 있어야 한다.
// public을 지워주면 실행 된다.
// b = d에서 Derived type은 Base type을 extends 했으므로 할당 가능