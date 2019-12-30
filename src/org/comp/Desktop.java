package org.comp;

public class Desktop implements HardWare{

	

	@Override
	public void hardwareResource() {
		System.out.println("computer");
	}
	public void desktopModel() {
		System.out.println("desktop");
	}
	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.hardwareResource();
		des.desktopModel();
		
	}
	

}
