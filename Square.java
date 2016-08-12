# Square
public class Square {
	int x1,y1;
	static int a=0;
	void get(int x,int y){
		x1=x;
		y1=y;
	}
	static int sq(Square s,Square s1,Square s2,Square s3){
		if((s1.x1-s.x1)==(s3.x1-s2.x1) ){
			if((s1.y1-s.y1)==(s3.y1-s2.y1) ){
			a=0;
			
		}
			else 
				a=1;
		
	}
		return a;
	}
	public static void main(String[] args) {
		
		Square s=new Square();
		Square s1=new Square();
		Square s2=new Square();
		Square s3=new Square();
		//pls follow the orders mentioned below
		s.get(10,0);//leftbottom (x,y)
		s1.get(10, 10);//lefttop (x,y)
		s2.get(20,10);//rightbottom (x,y)
		s3.get(20,20);//righttop(x,y)
		
		int d2=sq(s,s1, s2, s3);
		
		if(d2==0){
			System.out.println("square");
		}
		else
		{
			System.out.println("not square");
		}
		
		
	}

}
