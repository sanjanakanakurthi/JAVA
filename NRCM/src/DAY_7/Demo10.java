package DAY_7;
class nikuendukuException extends Exception{
	public nikuendukuException(String message) {
		super(message);
	}
}
public class Demo10 {
	public static void  check(int n)  throws nikuendukuException{
		if(n%2==0) {
			throw new nikuendukuException("maths is coming");
		}else {
			System.out.println("maths not coming");
		}
	}
	public static void main(String[] args) {
		try {
			check(18);
		}catch(nikuendukuException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy happy");
		}
	}
	}


