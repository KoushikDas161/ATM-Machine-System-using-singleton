
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			ATMController ob1 = ATMController.getInstance();
			ob1.withdraw(2000);
		}
	});
     
     Thread t2 = new Thread(new Runnable() {
 		
 		@Override
 		public void run() {
 			// TODO Auto-generated method stub
 			ATMController ob1 = ATMController.getInstance();
 			ob1.deposit(500);
 		}
 	});
     
     Thread t3 = new Thread(new Runnable() {
 		
 		@Override
 		public void run() {
 			// TODO Auto-generated method stub
 			ATMController ob1 = ATMController.getInstance();
 			ob1.checkBalance();
 		}
 	});
     
     t1.start();
     t1.join();

     t2.start();
     t2.join();

     t3.start();
     t3.join();
	}

}
