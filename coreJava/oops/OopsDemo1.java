class Student{
	private int stdId;
	private String name;
	
	public void setStdId(int stdId){
		this.stdId=stdId;
	}
	public void setStdId(String name){
		this.name=name;
	}
	public int getStdId(){
		return stdId;
	}
	public String getName(){
		return name;
	}
}

class OopsDemo1{
	public static void main(String[] args){
		Student std1=new Student();
		System.out.println(":stdId:"+std1.getStdId());
		System.out.println(":name:"+std1.getName());
	}

}