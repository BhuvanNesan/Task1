package org.comp;

public class Desktop implements HardWare,Coredata{

	

	@Override
	public void hardwareResource() {
		System.out.println("computer");
	}
	public void desktopModel() {
		System.out.println("desktop");
	}
	
	@Override
	public void coredata() {
System.out.println("CoreData");		
	}
	@Override
	public void datas() {
System.out.println("data");		
	}
	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.hardwareResource();
		des.desktopModel();
		des.coredata();
		des.datas();
		
	}
	

}
