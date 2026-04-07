class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student Id-> " + id + "\nName-> " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (object.getClass() == this.getClass()) {
            Student st = (Student) object;
            if (this.id == st.id && this.name.equals(st.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return id ;
    }
}

public class OnlineDoubtClass {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman");
        System.out.println(s1);
        System.out.println("Student HasCode-> " + s1.hashCode());
        Student s2 = new Student(1, "Amit");
        System.out.println("Check result-> " + s1.equals(s2));
    }
}
