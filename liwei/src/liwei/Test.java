package liwei;

import java.util.Set;

/**
 * 
 * @author Administrator
 * 创建测试类
 */
public class Test {

	public static void main(String[] args) {
		//创建学院对象
		College college = new College();
		
		//创建两个学生
		Student s1 = new Student("001","张三",'男',"1508javaj");
		Student s2 = new Student("002","李四",'女',"1508javaj");
		Student s3 = new Student("002","李四",'女',"1508javaj");
		
		//在学院类中要求能够对学生新增
		college.addStudent(s1);
		college.addStudent(s2);
		college.addStudent(s3);
		
//		//根据学号查询学生
//		Student student1 = college.getStudentById("002");
//		System.out.println(student1);
//		
//		//根据姓名查询学生
//		Student student2 = college.getStudentByName("李四");
//		System.out.println(student2);
//		
//		//在学院类中要求能够对学生信息，按照学号进行修改
//		s2.setName("王五");
//		s2.setSex('男');
//		s2.setClazz("1509javah");
//		college.updateStudent(s2);
//		Student student3 = college.getStudentById("002");
//		System.out.println(student3);
//		
//		//在学院类中要求能够对学生信息，按照学号进行删除
//		college.deleteStudent("002");
//		Student student4 = college.getStudentById("002");
//		System.out.println(student4);
//		
		//取出学院的所有学生
		Set<Student> list = college.getList();
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
	
}
