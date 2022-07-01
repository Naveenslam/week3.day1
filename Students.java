import org.student.Student;

public class Students {

    public int getStudentInfo(int id) {
        return id;
    }

    public void getStudentInfo(int id, String name) {
        System.out.println("Enter Student id :" + id + " and name is :" + name);
    }

    private void getStudentInfo(String email, long phoneNumber) {
        System.out.println("Enter Student email :" + email + " and phoneNumber is : " + phoneNumber);
    }

    public static void main(String[] args) {
        Students stuInfo = new Students();
        stuInfo.getStudentInfo(14579);
        stuInfo.getStudentInfo(14579, "Ramkumar");
        stuInfo.getStudentInfo("ramkumarslam123@gamil.com", 9757884455l);

    }

}
