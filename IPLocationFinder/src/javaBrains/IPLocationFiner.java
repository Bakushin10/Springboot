package javaBrains;

import com.cdyne.ws.weatherws.ForecastReturn;
import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherSoap;

public class IPLocationFiner {
	 
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("you need to pass oneip adress");
		}else {
			// http://www.visualwebservice.com/wsdl/wsf.cdyne.com/Weather.asmx%3FWSDL
			// http://wsf.cdyne.com/WeatherWS/Weather.asmx?wsdl
			String zip = args[0];
			Weather weather = new Weather();
			WeatherSoap weathersoap = weather.getWeatherSoap();
			ForecastReturn forecast = weathersoap.getCityForecastByZIP(zip);
			System.out.println(forecast.getCity());
		}
	}
}