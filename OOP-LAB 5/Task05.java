class Task05{
	float percentage;
     int  totalmarks=300;
	int  obtainmarks;
    String grade;
    void percentage(){
    	this.percentage=(float)obtainmarks*100/totalmarks;
        System.out.print("Percentage:"+percentage);
    }
    void totalmarks(){
    	int computer_Programming=87;
    	int dcld=70;
    	int electronics=70;
    	this.obtainmarks=computer_Programming+dcld+electronics;
    	  System.out.println("Obtain-Marks:"+obtainmarks);


    }
    void grade(){
    	if(percentage>=80 && percentage>=100){
          System.out.println("A-1 Grade");
    	}
    	if(percentage>=70 && percentage<=85){
    		System.out.println("A-Grade");
    	}
    	if(percentage>=60 && percentage<=70){
    		System.out.println("B-Grade");
    	}
    	if(percentage<=60){
    		System.out.println("C-Grade");
    	}
    }
    public static void main(String args[]){
     Task05 marksheet=new Task05();
     marksheet.totalmarks();
     marksheet.percentage();
     marksheet.grade();   
    }
}