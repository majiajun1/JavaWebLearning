package LombokLearning;

public class lesson1 {
    public static void main(String[] args) {
//        Student student= new Student(1,"23","性别");
        Student student= Student.builder().name("23").sex("男")
                .build();
        System.out.println(student);
    }

}
