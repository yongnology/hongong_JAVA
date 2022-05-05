package sec01.qeustion.exam05;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());;
		checkBox.select();
	}

}
/* 출력값
배경을 변경합니다.
*/