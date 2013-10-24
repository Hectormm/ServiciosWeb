package master;

public class SensorTemperatura {
	private String LeerSensorResponse;
	private Sensor s;
	
	public String LeerSensor() {
		s = new Sensor("T", 2);
		
		LeerSensorResponse = s.getIdentificadorSensor() + "#" + s.getTipoSensor() + "#" 
			+ s.getValorSensor() + "#" + s.getFechaHoraLectura();
		
		return LeerSensorResponse;
	}
}
