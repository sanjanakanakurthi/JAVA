package NRCM2;


class InvalidEmployeeIDException extends Exception{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;

	public InvalidEmployeeIDException(String message) {
		super(message);
	}
}

public class Demo2 {
	public static void main(String[]args) {
		try {
			if(args.length==0) {
				System.out.println("Please enter an Employee ID:");
				return;
			}
			int empID = Integer.parseInt(args[0]);
            validateEmployeeID(empID);
            System.out.println("Valid Employee ID");
        } catch (InvalidEmployeeIDException e) {
            System.out.println("Please Reenter your valid Employee ID ");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number as Employee ID.");
        }
		}
	public static void validateEmployeeID(int id) throws InvalidEmployeeIDException {
        if (id < 0 || id > 999) {
            throw new InvalidEmployeeIDException("Invalid Employee ID");
        }
    }
}
		
	

