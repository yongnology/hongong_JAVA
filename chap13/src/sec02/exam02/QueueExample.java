package sec02.exam02;
// Queue�� �̿��� �޽��� ť
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// �޼��� ����
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKaKaotalk", "ȫ�β�"));
		
		while(!messageQueue.isEmpty()) {
		// �޼��� ť�� ����ִ��� Ȯ��
			Message message = messageQueue.poll();
			// �޼��� ť���� 1���� �޽��� ����
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
	}

}
/* ��°�
ȫ�浿�Կ��� ������ �����ϴ�.
�ſ�ǴԿ��� SMS�� �����ϴ�.
ȫ�β��Կ��� īī������ �����ϴ�.
*/