package master;

public class SensorHumedad {
	private String LeerSensorResponse;
	private Sensor s;
	
	public String LeerSensor() {
		s = new Sensor("H", 1);
		
		LeerSensorResponse = s.getIdentificadorSensor() + "#" + s.getTipoSensor() + "#" 
			+ s.getValorSensor() + "#" + s.getFechaHoraLectura();
		
		return LeerSensorResponse;
	}
}
