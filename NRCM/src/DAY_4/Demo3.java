package DAY_4;


	public class Demo3 {
		private String firstName;
		private String lastName;
		private String email;
		private long phonenumber;
		public void setFirstName(String fn) {
			firstName=fn;
		}
		public void setLastName(String ln) {
			lastName=ln;
		}
		public void setEmail(String em) {
			email=em;
		}
		public void setPhoneNumber(long pn) {
			phonenumber=pn;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getEmail() {
			return email;
		}
		public long getPhoneNumber() {
			return phonenumber;
		}
		public static void main(String[] args) {
			Demo3 d1=new Demo3();
			d1.setFirstName("Kanakurthi");
			d1.setLastName("Sanjana");
			d1.setEmail("sanjanakanakurthi@gmail.com");
			d1.setPhoneNumber(9849788714l);
			System.out.println(d1.getFirstName());
			System.out.println(d1.getLastName());
			System.out.println(d1.getEmail());
			System.out.println(d1.getPhoneNumber());


			
		}
		
		

	}
