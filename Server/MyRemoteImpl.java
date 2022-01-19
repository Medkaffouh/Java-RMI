import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public String sayHello() {
		return "Server says Hey";
	}

	public String sayMyName() {
		return "My Name Is Mohamed Kaffouh I'm learning RMI";
	}

	public String talkAboutRemote() {
		return "I'm following the steps for make the RMI works";
	}

	public MyRemoteImpl() throws RemoteException {
	}

	
}
