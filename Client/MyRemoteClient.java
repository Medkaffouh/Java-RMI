import java.rmi.*;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			MyRemote stub = (MyRemote) Naming.lookup("rmi://localhost:7001/Kaffouh");
			String s = stub.sayHello();
			String s2 = stub.sayMyName();
			String s3 = stub.talkAboutRemote();
			System.out.println(s);
			System.out.println(s2);
			System.out.println(s3);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}