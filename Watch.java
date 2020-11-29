import java.util.ArrayList;

public class Watch implements Runnable, Subject{
	Flag f;
	
	int time;

	ArrayList observers;
	Watch()
	{
		time = 0;
		observers = new ArrayList();
	}
	Watch(boolean flag)
	{
		time = 0;
		observers = new ArrayList();
		f = new Flag(flag);
		Thread t = new Thread(this);
		t.start();
	}
	synchronized Flag getFlag()
	{
		return f;
	}
	synchronized void setFlag(Flag f)
	{
		this.f = f;

	}

	@Override
	public void run() {
		try {
			Thread.sleep(60000);
			time++; notifyObservers(time);
			Thread.sleep(60000);
			time++; notifyObservers(time);
			Thread.sleep(60000);
			time++; notifyObservers(time);
			Thread.sleep(60000);
			time++; notifyObservers(time);
			Thread.sleep(60000);
			time++;
			notifyObservers(time);
			Thread.sleep(10000);

			if(f.flag == false) 
			{
				System.out.println("You've been caught! the Marauders map has been confiscated");
				System.exit(0);
			}
			else {
				System.exit(0);
			}

		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void notifyObservers(int time) {
		for (int i =0; i<observers.size(); i++)
		{
			Observer observer = (Observer)observers.get(i);
			observer.update(time);
		}

	}
	@Override
	public void registerObserver(Student s) {
		observers.add(s);
	}
	@Override
	public void removeObsever(Student s) {
		int i = observers.indexOf(s);
		if (i>=0) observers.remove(i);

	}

}
