class Authur{


	private String name;


	private String email;


	private char gender;


	Authur(String name,String email,char gender){


		this.name=name;


		this.email=email;


		this.gender=gender;


	}


	public void setEmail(String email){


		this.email=email;


	}


	public String getName(){


		return name;


	}


	public String getEmail(){


		return email;


	}


	public char getGender(){


		return gender;


	}


	public String toString(){


		return ("\"Authur[name="+getName()+", email="+getEmail()+", gender="+getGender()+"]\"");


	}


}class Task1{


	public static void main(String args[]){


		Authur auth1=new Authur("Robert Lafore","robert112@c++.com",'m');


		System.out.println(auth1.toString());


	}


} 