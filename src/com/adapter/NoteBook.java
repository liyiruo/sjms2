package com.adapter;

public class NoteBook {
	/*
	 * 笔记本需要三项的插座来充电
	 */
	private ThreePlugIf  plug;
	//这是一个有参的函数
	public NoteBook(ThreePlugIf plug){
		this.plug = plug;
	}

	//使用插座充电
	public void charge(){
		plug.powerWithThree();
	}

	public static void main(String[] args) {
		//创建一个2项的插座
		GBTwoPlug two =  new GBTwoPlug();
		ThreePlugIf three = new TwoPlugAdapter(two);
		NoteBook nb = new NoteBook(three);
		nb.charge();
		
		
		three = new TwoPlugAdapterExtends();
		nb = new NoteBook(three);
		nb.charge();

	}

}
