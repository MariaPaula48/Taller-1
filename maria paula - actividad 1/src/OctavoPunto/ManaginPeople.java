package OctavoPunto;

public class ManaginPeople {

	public static void main(String[] args) {

		Person p1= new Person("Arial", 37);
		Person p2= new Person("Joseph", 15);
		
		if (p1.getAge()==p2.getAge()) {
			System.out.println(p1.getName()+" tiene el mismo nombre que "+p2.getName());
		}else {
			System.out.println(p1.getName()+" NO tiene el mismo nombre que "+p2.getName());
		}
	}
}
