abstract class Person{
	private String cnic;
	private String name;
	private String address;
	private String gender;
	private String dob;
	private String email;
	private String phone;
	//....................................Default constructors..........................................
	Person(){
		cnic=null;
		name=null;
		address=null;
		gender=null;
		dob=null;
		email=null;
		phone=null;
	}
	//.................................Overloaded Constrcutor............................................
	Person(String cnic,String name,String address,String gender,String dob,String email,String phone){
		setCnic(cnic);
		setName(name);
		setAddress(address);
		setGender(gender);
		setDob(dob);
		setEmail(email);
		setPhone(phone);
	}

	//.....................................setters.....................................................
	void setCnic(String cnic){this.cnic=cnic;}
	void setName(String name){this.name=name;}
	void setAddress(String address){this.address=address;}
	void setGender(String gender){this.gender=gender;}
	void setDob(String dob){this.dob=dob;}
	void setEmail(String email){this.email=email;}
	void setPhone(String phone){this.phone=phone;}

	//...................................getters......................................................

	String getCnic(){return cnic;}
	String getName(){return name;}
	String getAddress(){return address;}
	String getGender(){return gender;}
	String getDob(){return dob;}
	String getEmail(){return email;}
	String getPhone(){return phone;}


	//.................................Craete an Abstarct Methods....................................
	public abstract  String toString();

	
	public abstract Boolean isEqual(Object c);
		
	//.....................................End...........................................................

}