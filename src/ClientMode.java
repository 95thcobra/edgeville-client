public enum ClientMode {

	LOCAL("127.0.0.1", 43594), LIVE("127.0.0.1", 43594);
	
	private final String address;
	private final int port;
	
	private ClientMode(String address, int port) {
		this.address = address;
		this.port = port;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getPort() {
		return port;
	}
	
}