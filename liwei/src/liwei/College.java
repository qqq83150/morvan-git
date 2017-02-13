package liwei;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * （2） 要求定义一个学院类， 在学院类中要求能够对图书信息进行查询： 按照编号查询， 也可以按照姓名查询 （20分）
 * 
 * @author Administrator
 *
 */
public class College {

	// 定义一个学生集合，用来存储学生
//	private List<Student> list = new ArrayList<Student>();
	private Set<Student> list = new HashSet<Student>();

	/**
	 * 根据学号查询学生
	 * 
	 * @return
	 */
	public Student getStudentById(String id) {
		// 遍历集合
		for (Student student : list) {
			// 根据传进来的id查学生
			if (student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}

	/**
	 * 根据姓名查询学生
	 * 
	 * @return
	 */
	public Student getStudentByName(String name) {
		// 遍历集合
		for (Student student : list) {
			// 根据传进来的name查学生
			if (student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}

	/**
	 * （3） 在学院类中要求能够对学生新增
	 * 
	 * @param stu
	 */
	public void addStudent(Student stu) {
		list.add(stu);
	}

	/**
	 * （4） 在学院类中要求能够对学生信息，按照学号进行修改
	 * 
	 * @param stu
	 */
	public void updateStudent(Student stu) {
		// 遍历集合
		for (Student student : list) {
			// 根据传进来的id查学生
			if (student.getId().equals(stu.getId())) {
				// 修改集合中的学生信息
				student.setName(stu.getName());
				student.setSex(stu.getSex());
				student.setClazz(stu.getClazz());
			}
		}
	}

	/**
	 * （5） 在学院类中要求能够对学生信息，按照学号进行删除
	 * 
	 * @param id
	 */
	public void deleteStudent(String id) {
		// 声明学生变量
		Student s = null;
		// 遍历集合
		for (Student student : list) {
			// 根据传进来的id查学生
			if (student.getId().equals(id)) {
				s = student;
			}
		}
		//执行删除
		list.remove(s);
	}

	public Set<Student> getList() {
		return list;
	}

	public void setList(Set<Student> list) {
		this.list = list;
	}

//	public List<Student> getList() {
//		return list;
//	}
//
//	public void setList(List<Student> list) {
//		this.list = list;
//	}
	
	

}
