import java.util.ArrayList;

public class test {

    private ArrayList<people> peo;


public test() {
    peo = new ArrayList<>();
}


//เพิ่ม

public void addpeople(people People){
    
    peo.add(People);
}






//โชว์ข้อมููลทั้งหมด

public void ShowAlldata() {

    for(people People : peo) {
        System.out.println("ID : " + People.getID() + "Name : " + People.getname() + "Age : " + People.age());
    }
}
   
    


    
} 