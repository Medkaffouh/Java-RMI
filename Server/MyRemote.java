import java.rmi.*;

public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;

	public String sayMyName() throws RemoteException;

	public String talkAboutRemote() throws RemoteException;
}
