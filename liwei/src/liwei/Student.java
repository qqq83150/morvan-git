package liwei;
/**
 * 
 * @author Administrator
 * （1）	要求定义一个学生类：包括学号 姓名，性别和班级进行封装
 *
 */
public class Student {

	private String id;//学号
	private String name;//姓名
	private char sex ;//性别
	private String clazz;//班级
	
	public Student() {
		super();
	}
	public Student(String id, String name, char sex, String clazz) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.clazz = clazz;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	
	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", clazz=" + clazz + "]";
	}
	
	/**
	 * 重写equals方法
	 * 如果两个学生的学号和姓名相同就认为是同一个学生
	 */
	@Override
	public boolean equals(Object obj) {
		//把obj强转成学生对象
		Student s = (Student) obj;
		//判断当学生的学号和姓名都相等时
		if(this.getId().equals(s.getId()) && this.getName().equals(s.getName())) {
			return true;
		}
		return false;
	}
	
}
