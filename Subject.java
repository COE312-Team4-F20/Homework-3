
public interface Subject {

	public void registerObserver(Student s);
	public void removeObsever(Student s);
	public void notifyObservers(int time);

}
