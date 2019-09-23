package pojo;
/**
 * 用户表
 * @author Administrator
 *吾问无为谓吾问无为谓吾问无为谓吾问无为谓吾问无为谓
 */
public class User {
	private int id;//主键id
	private String name;//名称
	private String sex;//性别
	private int age;//年龄
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
