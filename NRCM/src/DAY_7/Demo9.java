package DAY_7;
class nikuendukuException extends Exception{
	public nikuendukuException(String message) {
		super(message);
	}
}
public class Demo9 {
	public static void  agecheck(int age)  throws nikuendukuException{
		if(age<18) {
			throw new nikuendukuException("nikuenduku");
		}else {
			System.out.println("ra batta");
		}
	}
	public static void main(String[] args) {
		try {
			agecheck(18);
		}catch(nikuendukuException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy happy");
		}
	}
	}


