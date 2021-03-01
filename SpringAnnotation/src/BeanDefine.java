/**
 * @Description:
 * @ClassName: BeanDefinition
 * @Project: spring-aop
 * @Author: zxf
 * @Date: 2011-6-3
 */
public class BeanDefine {

	public String id;
	public String className;

	public BeanDefine(String id, String className) {
		this.id = id;
		this.className = className;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
