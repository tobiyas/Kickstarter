package me.simplex.pluginkickstarter.util;

public enum TemplateType {
	Plugin,
	MainClass,
	PlayerListener,
	BlockListener,
	EntityListener,
	WorldListener,
	WeatherListener,
	VehicleListener,
	InventoryListener,
	Command,
	Task,
	Configuration;
	
	public String giveFilename(){
		return this.toString()+".template";
	}
}