package sec01.qeustion.exam04;

public class Chatting {
	void startChat(String chatId) {
		String nickName;
		nickName = chatId;
		
		class Chat {
			public void start() {
				while(true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}
