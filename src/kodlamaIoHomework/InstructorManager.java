package kodlamaIoHomework;

public class InstructorManager extends UserManager{
	@Override
	public void signUp(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu iþveren siteye kayýt oldu");
	}
	
	public void addLesson(Instructor user , String[] givenLessonsName) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Ders ekledi");
		user.setGivenLessonsName(givenLessonsName);
		for (String lesson : givenLessonsName) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Kiþisinin dersleri " + lesson);
		}
		
	}
	
	public void writeCompanyName(Instructor user) {
		System.out.println(user.getFirstName() + " Kiþisinin çalýþtýðý þirket ismi: " + user.getCompanyName());
	}
}
