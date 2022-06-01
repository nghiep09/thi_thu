import java.io.*;
import java.util.ArrayList;

public class Reader {
    public void reader(ArrayList<Student>students){
        File file=new File("student.csv");
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String str=bufferedReader.readLine();
            while (str!=null){
                String[]arr=str.split(",");
                String msv=arr[0];
                String name=arr[1];
                int age =Integer.parseInt(arr[2]);
                String sex=arr[3];
                String address=arr[4];
                String mediumScore = arr[5];
                for (Student st:students){
                    if(st.getMsv().equals(msv)){
                        students.add(new Student(msv,name,age,sex,address,mediumScore,st));
                        break;
                    }
                    bufferedReader.close();
                    fileReader.close();
                }
            }
        } catch (IOException e) {
            System.out.println("File chưa tồn tại");
        }
    }
}
