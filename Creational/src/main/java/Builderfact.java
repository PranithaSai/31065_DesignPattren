
public class Builderfact {
	
	public String weight;
	public int screen_size;
	public int  cam_front,cam_back;
	public String os;
	int battery;
	int storage;
	int processor;
		public Builderfact setWeight(String weight) {
		this.weight = weight;
		return(this);
	}
	public Builderfact setScreen_size(int screen_size) {
		this.screen_size = screen_size;
		return(this);
	}
	public Builderfact setCam_front(int cam_front) {
		this.cam_front = cam_front;
		return(this);
	}
	public Builderfact setCam_back(int cam_back) {
		this.cam_back = cam_back;
		return(this);
	}
	public Builderfact setOs(String os) {
		this.os = os;
		return(this);
	}
	public Builderfact setBattery(int battery) {
		this.battery = battery;
		return(this);
	}
	
	public Builderfact setStorage(int storage) {
		this.storage = storage;
		return(this);
	}
		public Builderfact setProcessor(int processor) {
		this.processor = processor;
		return(this);
	}
		public Feature getall()
		{
			return  new Feature(weight, screen_size,cam_front,cam_back,os,battery,storage,processor);
			
}

}
