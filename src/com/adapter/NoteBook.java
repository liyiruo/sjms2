package com.adapter;

public class NoteBook {
	/*
	 * �ʼǱ���Ҫ����Ĳ��������
	 */
	private ThreePlugIf  plug;
	//����һ���вεĺ���
	public NoteBook(ThreePlugIf plug){
		this.plug = plug;
	}

	//ʹ�ò������
	public void charge(){
		plug.powerWithThree();
	}

	public static void main(String[] args) {
		//����һ��2��Ĳ���
		GBTwoPlug two =  new GBTwoPlug();
		ThreePlugIf three = new TwoPlugAdapter(two);
		NoteBook nb = new NoteBook(three);
		nb.charge();
		
		
		three = new TwoPlugAdapterExtends();
		nb = new NoteBook(three);
		nb.charge();

	}

}
