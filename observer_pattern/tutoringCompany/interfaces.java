public interface Subject {
	public void registerTutor(Observer t);
	public void removeTutor(Observer t);
	public void notifyTutors(Observer t);
}

public interface Observer {
	public void update(char grade);
}

public interface TutorSession {
	public void tutorStudent();
}
