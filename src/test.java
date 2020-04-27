import java.io.*;

public class test {

    public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException {
        /*Student student = new Student();
        student.setName("nba");
        Student student1 = (Student)student.clone();
        System.out.println(student1);


        Bird<String> stringBird = new Bird<>();
        stringBird.setName("asd");
        System.out.println(stringBird.getName());*/

        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\28950\\Desktop\\简历\\1.txt")) {

            FileOutputStream out = new FileOutputStream("C:\\Users\\28950\\Desktop\\简历\\2.txt");

            int len = 0;
            byte[] b = new byte[1024];

            while ((len = inputStream.read(b)) != -1) {

                out.write(b, 0, b.length);

            }

            out.close();
            inputStream.close();


            Integer a = null;
            switch (a) {
                case 1:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
