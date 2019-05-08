class GreatestElement{
	public static void main(String args[]){
	int[] array_={2,3,4,1,8};
	int c=array_[2];
	int max=0;
	
	for(int i=0;i<=array_.length-1;i++){
		if(c<array_[i]){
			
			max=array_[i];
			break;
		}
		
	}
	System.out.println("The greatest element is:"+max);
	}
}