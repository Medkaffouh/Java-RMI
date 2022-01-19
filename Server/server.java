import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

class server {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(7001);
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("rmi://localhost:7001/Kaffouh", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}