package master;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Sensor {
	private int IdentificadorSensor;
	private String TipoSensor;
	private float ValorSensor;
	private String FechaHoraLectura;
	
	public Sensor(String TipoSensor, int id) {
		this.TipoSensor = TipoSensor;
		this.IdentificadorSensor = id;
	}
	
	public int getIdentificadorSensor() {
		return IdentificadorSensor;
	}
	public String getTipoSensor() {
		return TipoSensor;
	}
	
	public float getValorSensor() {
		if(TipoSensor.equals("H"))
			ValorSensor = (int) (Math.random()*(100-1+1)+1);
		else if(TipoSensor.equals("T"))
			ValorSensor = (int) (Math.random()*(45-(-10)+1)+(-10));
		
		return ValorSensor;
	}
	public String getFechaHoraLectura() {
		Calendar c = new GregorianCalendar();
		
		FechaHoraLectura = getFecha(c) + "/" + getHora(c);
		return FechaHoraLectura;
	}
	
	private String getFecha(Calendar c) {
		String fecha = "";
		
		fecha+=Integer.toString(c.get(Calendar.DAY_OF_MONTH)) + "/";
		fecha+=Integer.toString(c.get(Calendar.MONTH) + 1) + "/";
		fecha+=Integer.toString(c.get(Calendar.YEAR));
		
		return fecha;
	}
	
	private String getHora(Calendar c) {
		String hora = "";
		
		hora += Integer.toString(c.get(Calendar.HOUR_OF_DAY)) + ":";
		hora += Integer.toString(c.get(Calendar.MINUTE)) + ":";
		hora += Integer.toString(c.get(Calendar.SECOND)) + "     ";
		
		return hora;
	}
}
 