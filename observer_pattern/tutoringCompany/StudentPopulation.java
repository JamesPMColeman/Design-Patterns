public class StudentPopulation implements Subject {
	private ArrayList tutors;
	private ArrayList students;

	public StudentPopulation() {
		tutors = new ArrayList()
		students = new ArrayList()
	}

	public void registerTutor(Observer o) {
		tutors.add(o);
	}
	
	public void removeTutor(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0 && i < tutors.Size()) tutors.remove(i);
	}
	
	public void notifyTutors() {
		for (int i = 0; i < observers.size(); i++) {
			Observer tutor = (Observer)tutors.get(i);
			observer.update(grade);
		}
	}
}	 
