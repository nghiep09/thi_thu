import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    ArrayList<Student> students= new ArrayList<>();
    Reader rd=new Reader();
    Write wt=new Write();
    Scanner scanner = new Scanner(System.in);
    public void manu(){
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN---");
        System.out.println("Chọn chức năng theo số(để tiếp tục)");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5.Sắp xếp");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng:");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                show();
                break;
            case 2:
                createStudent();
                break;
            case 3:
                update();
                break;
            case 4:
                delete();
                break;
            case 5:
                sort();
                break;
            case 6:
                read();
                break;
            case 7:
                wite();
                break;
            case 8:
                System.exit(0);
                break;
        }
    }
    public void read(){
            rd.reader(students);
            System.out.println("Đọc thành công");
        }
    public void wite(){
            wt.write(students);
            System.out.println("Viết thành công");
    }
    public Student createStudent(){
        try {
            System.out.println("1. Nhập MSV: ");
            String msv= scanner.nextLine();
            System.out.println("2. Nhập họ tên: ");
            String name = scanner.nextLine();
            System.out.println("3. Nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("4. Nhập giới tính: ");
            String sex = scanner.nextLine();
            System.out.println("5 Nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println("6. Điểm trung bình: ");
            double mediumScore = Double.parseDouble(scanner.nextLine());
            students.add(new Student(msv,name,age,sex,address,mediumScore));
        } catch (Exception e) {
            System.out.println("Nhập sai kiểu giữ liệu nhập lại");
            System.out.println("Bạn nhấn y để tiếp tục");
            String choice1=scanner.nextLine();
            if(choice1.equals("y")){
               createStudent();

            }
        }
        return null;
    }
    public void show(){
        for (Student st:students) {
            System.out.println(st);
        }
    }
     public void update(){
        System.out.println("Nhập mã sinh viên cần cập nhật");
        String msv=scanner.nextLine();
        int index= Msv(msv);
        if(index==-1){
            System.out.println("Không có mã sinh viên ");
            System.out.println("Bạn nhấn y để tiếp tục");
            String check=scanner.nextLine();
            if(check.equals("y")){
                update();
            }
        }else {
            Student student = createStudent();
            if(student != null){
                students.set(index, createStudent());
            }else {
                System.out.println("sửa không thành công");
            }
        }
    }
    public int Msv(String msv){
        int index=-1;
        for (int i=0;i<students.size();i++){
            if(students.get(i).getMsv().equals(msv)){
                index=i;
            }
        }
        return index;
    }
    public void delete(){
        System.out.println("Nhập mã sinh viên muốn xóa");
        String msv =scanner.nextLine();
        int index=Msv(msv);
        if(index==-1){
            System.out.println("Không tìm được sinh viên với mã sinh viên trên");
            System.out.println(" bạn muốn tiếp tục thì nhập y");
            String check=scanner.nextLine();
            if(check.equals("y")){
                delete();
            }
        }else {
            System.out.println("xóa sinh viên có msv là "+msv);
            System.out.println("bạn nhấn y để tiếp tục");
            String yes=scanner.nextLine();
            if(yes.equals("y")){
                students.remove(index);
            }
        }
    }
    public void sort(){
        System.out.println("---Sắp Xếp Học Sinh Theo Điểm Trung Bình---");
        System.out.println("chọn chức năng thế số(để tiếp tục)");
        System.out.println("1. Sắp xếp điểm trung bình tăng dần");
        System.out.println("2. Sắp xếp điểm trung bình giảm dần");
        System.out.println("3. Thoát");
        System.out.println("Chọn chức năng");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                students.sort(new SortDiemTBTang());
            case 2:
                students.sort(new SortDiemTBGiam());
            case 3:
                System.exit(0);
                break;
        }

    }

}
