package thread;

//쓰레드를 정의한다
public class MyThread2 extends Thread {

	//쓰레드로 구현할 코드는 반드시 이미 정해진 run 메서드에 넣어야 한다.
	public void run() {
		while(true) {
			System.out.println("★");
		}
	}
}
