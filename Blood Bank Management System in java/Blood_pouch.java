class Blood_pouch{
	private int id;
	private String blood_type;
	private String location;
	private int cholestrol_level;
	private String expiration_date;
	//.......................................default constructor................................
	Blood_pouch(){
		id=0;
		blood_type=null;
		location=null;
		cholestrol_level=0;
		expiration_date=null;
	}

	//.......................................Overloaded Constrcutor..............................
	Blood_pouch(int id ,String blood_type,String location,int cholestrol_level,String expiration_date){
		setId(id);
		setBlood_Type(blood_type);
		setLocation(location);
		setCholestrol_level(cholestrol_level);
		setExpiredate(expiration_date);
	}


	//......................................setters.............................................
	void setId(int id){this.id=id;}
	void setBlood_Type(String blood_type){this.blood_type=blood_type;}
	void setExpiredate(String expiration_date){this.expiration_date=expiration_date;}
	void setCholestrol_level(int cholestrol_level){this.cholestrol_level=cholestrol_level;}
	void setLocation(String location){this.location=location;}

	//......................................getters..........................................
	int 	getId(){return id;}
	String 	getBlood_type(){return blood_type;}
	String 	getExpiredate(){return expiration_date;}
	int 	getCholestrrol_level(){return cholestrol_level;}
	String 	getLocation(){return location;}

	//...................................Upadate blood Pouchs.................................
	void updateBloodpouch(int id ,String blood_type,String location,int cholestrol_level,String expiration_date){
		setId(id);
		setBlood_Type(blood_type);
		setLocation(location);
		setCholestrol_level(cholestrol_level);
		setExpiredate(expiration_date);
	}
	//...................................remove Blood pouchs................................
	static void removebloodpouchs(Blood_pouch bp){

		bp.setId(0);
		bp.setBlood_Type(null);
		bp.setLocation(null);
		bp.setCholestrol_level(0);
		bp.setExpiredate(null);
	
	}

	//........................................isEqual-Method........................................
	Boolean isEqual(Blood_pouch bp){
		if (this.getId()==bp.getId()) {
			return true;
		}
		return false;
	}
	//.........................................toString Method.......................................
	public String toString(){
		return "Blood_pouch id is:"+getId()+"\nBloooType is :"+getBlood_type()+"\nlocation is :"+getLocation()+"\nCholestrol_level is :"+getCholestrrol_level()+"\nExpiration_date is :"+getExpiredate();


	}
	//.....................................End...........................................................
}