import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** ������ѧ�����Գɼ�:
 * ����,80,80,80
 * ����,70,75,65
 * ����,90,95,80
 * ����,60,60,60
 * quit
 * 
 * ������ѧ����Ϣ:
 * ����,90,95,80,265
 * ����,80,80,80,240
 * ����,70,75,65,210
 * ����,60,60,60,180
*/


public class paixu {

	public static void main(String[] args) {
		 List data = new ArrayList();	
		 
		 
		 Student s0=new Student();
		 s0.setName("����");
		 s0.setChengji1(80);
		 s0.setChengji2(80);
		 s0.setChengji3(80);
		 s0.getChengji4();
		 data.add(s0);
		 
		 
		 Student s1=new Student();
		 s1.setName("����");
		 s1.setChengji1(90);
		 s1.setChengji2(95);
		 s1.setChengji3(80);
		 s1.getChengji4();
		 data.add(s1);
		 
		 Student s2=new Student();
		 s2.setName("����");
		 s2.setChengji1(70);
		 s2.setChengji2(75);
		 s2.setChengji3(65);
		 s2.getChengji4();
		 data.add(s2);
		 
		 Student s3=new Student();
		 s3.setName("����");
		 s3.setChengji1(60);
		 s3.setChengji2(60);
		 s3.setChengji3(60);
		 s3.getChengji4();
		 data.add(s3);
		
		 System.out.println("*����ǰ");
		 
		 Student s=new Student();
		 s.setbooleanfalse();
		 s.show(data);
		
		 System.out.println("*�����");
		 
		 Student.sort(data);
		 s.setbooleantrue();
		 s.show(data);
		
		
		
		
		
		
	
		 
		 
		 
		 
		    
		}
	
	
		
	
}

class Student  {

    

    

	private  String name;

	private int chengji1;
    private int chengji2;
    private int chengji3;
    private int chengji4;
    
    private static boolean flag=true; 
    
    public boolean setbooleanfalse(){
    	return flag=false;
    	
    }
    
    public boolean setbooleantrue(){
    	return flag=true;
    	
    }
    
    public int getChengji1() {
        return chengji1;
    }

    public void setChengji1(int chengji1) {
        this.chengji1 = chengji1;
    }
    
    public int getChengji2() {
        return chengji1;
    }

    public void setChengji2(int chengji2) {
        this.chengji2 = chengji2;
    }
    
    public int getChengji3() {
    	
    	return chengji1;
    }

    public void setChengji3(int chengji3) {
        this.chengji3 = chengji3;
    }

    public int getChengji4() {
    	
    	return chengji4=this.chengji1+this.chengji2+this.chengji3;
    }

    /*public void setChengji4(int chengji4) {
        this.chengji4 = chengji4;
    }*/
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        
    	if(flag)
        	return "*����:" + name + ", �ɼ�1: " + chengji1 +" , �ɼ�2: " + 
    		chengji2 +" , �ɼ�3: " + chengji3+" , �ܳɼ� " + chengji4;
        else
        	return "*����:" + name + ", �ɼ�1: " + chengji1 +" , �ɼ�2: " + 
        		chengji2 +" , �ɼ�3: " + chengji3;
        
        
                
        
    }
    
   
    public static void show(List data) {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }
    
    public static void sort(List data) {
        Collections.sort(data, new Comparator() {

            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return (int) (s2.getChengji1()+ s2.getChengji2()+s2.getChengji3()-
                		s1.getChengji1()-s1.getChengji2()-s1.getChengji3());
            }
        });
    
    }

}






