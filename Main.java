public class Main {
public static void main(String[] args) {
Student s1 = new Student("Jan", "Szymanowicz", "s99999", "s99999@pjwstk.edu.pl", "Koszykowa 56");
s1.addGrades(5);
s1.addGrades(3);
StudentGroup g1 = new StudentGroup("14c");
g1.add(s1);
System.out.println(s1.toString());
}
}
