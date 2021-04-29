package kodlamaIoHomework;

public class StudentManager extends UserManager{
	@Override
	public void signUp(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu öðrenci siteye kayýt oldu");
	}
	
	public void enterLesson(Student user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu öðrenci derse kayýt oldu");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu öðrenci " + user.getTotalLesson() + " Derse kayýtlý");
	}
}
