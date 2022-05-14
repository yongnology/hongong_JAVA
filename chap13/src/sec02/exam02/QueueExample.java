package sec02.exam02;
// Queue를 이요한 메시지 큐
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메세지 저장
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKaKaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
		// 메세지 큐가 비어있는지 확인
			Message message = messageQueue.poll();
			// 메세지 큐에서 1개의 메시지 꺼냄
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}

}
/* 출력값
홍길동님에게 메일을 보냅니다.
신용권님에게 SMS를 보냅니다.
홍두께님에게 카카오톡을 보냅니다.
*/