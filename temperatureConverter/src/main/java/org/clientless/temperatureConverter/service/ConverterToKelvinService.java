package org.clientless.temperatureConverter.service;

import org.clientless.temperatureConverter.data.accessObject.ConverterToKelvinAccessObject;
import org.clientless.temperatureConverter.data.transferObject.ConverterToKelvinTransferObject;
import org.clientless.temperatureConverter.model.Response;
import org.springframework.stereotype.Service;

@Service
public class ConverterToKelvinService {
    public Response kelvinToKelvin(Double valueTemperature, String unitTemperature){
        //Data Access Object
        ConverterToKelvinAccessObject converterToKelvinAccessObject = new ConverterToKelvinAccessObject(valueTemperature,unitTemperature);
        //Data Transfer Object
        ConverterToKelvinTransferObject converterToKelvinTransferObject = new ConverterToKelvinTransferObject(converterToKelvinAccessObject.getValue(), "K");
        //return
        return new Response("Successfully Converted Data",converterToKelvinTransferObject, 2000);
    }



    public Response celsiusToKelvin(Double valueTemperature, String unitTemperature){
        Double lowestPointKelvin = 273.0;
        Double highestPointKelvin = 373.0;
        Double deltaHighestToLowestKelvin = highestPointKelvin - lowestPointKelvin;

        Double lowestPointCelsius = 0.0;
        Double highestPointCelsius = 100.0;
        Double deltaHighestToLowestCelsius = highestPointCelsius - lowestPointCelsius;
        Double deltaPresentToLowestCelsius = valueTemperature - lowestPointCelsius;


        Double presentKelvin = ((deltaPresentToLowestCelsius/deltaHighestToLowestCelsius)*deltaHighestToLowestKelvin)+lowestPointKelvin;
        //Data Access Object
        ConverterToKelvinAccessObject converterToKelvinAccessObject = new ConverterToKelvinAccessObject(presentKelvin,unitTemperature);
        //Data Transfer Object
        ConverterToKelvinTransferObject converterToKelvinTransferObject = new ConverterToKelvinTransferObject(converterToKelvinAccessObject.getValue(), "K");
        //return
        return new Response("Successfully Converted Data",converterToKelvinTransferObject, 2000);

    }

    public Response fahrenheitToKelvin(Double valueTemperature, String unitTemperature){
        Double lowestPointKelvin = 273.0;
        Double highestPointKelvin = 373.0;
        Double deltaHighestToLowestKelvin = highestPointKelvin - lowestPointKelvin;

        Double lowestPointFahrenheit = 32.0;
        Double highestPointFahrenheit = 212.0;
        Double deltaHighestToLowestFahrenheit = highestPointFahrenheit - lowestPointFahrenheit;
        Double deltaPresentToLowestFahrenheit = valueTemperature - lowestPointFahrenheit;

        Double presentKelvin = ((deltaPresentToLowestFahrenheit/deltaHighestToLowestFahrenheit)*deltaHighestToLowestKelvin)+lowestPointKelvin;
        //Data Access Object
        ConverterToKelvinAccessObject converterToKelvinAccessObject = new ConverterToKelvinAccessObject(presentKelvin,unitTemperature);
        //Data Transfer Object
        ConverterToKelvinTransferObject converterToKelvinTransferObject = new ConverterToKelvinTransferObject(converterToKelvinAccessObject.getValue(), "K");
        //return
        return new Response("Successfully Converted Data",converterToKelvinTransferObject, 2000);
    }

    public Response reaumurToKelvin(Double valueTemperature, String unitTemperature){
        Double lowestPointKelvin = 273.0;
        Double highestPointKelvin = 373.0;
        Double deltaHighestToLowestKelvin = highestPointKelvin - lowestPointKelvin;

        Double lowestPointReaumur = 0.0;
        Double highestPointReaumur = 80.0;
        Double deltaHighestToLowestReaumur = highestPointReaumur - lowestPointReaumur;
        Double deltaPresentToLowestPointReaumur = valueTemperature - lowestPointReaumur;

        Double presentKelvin = ((deltaPresentToLowestPointReaumur/deltaHighestToLowestReaumur)*deltaHighestToLowestKelvin)+lowestPointKelvin;
        //Data Access Object
        ConverterToKelvinAccessObject converterToKelvinAccessObject = new ConverterToKelvinAccessObject(presentKelvin,unitTemperature);
        //Data Transfer Object
        ConverterToKelvinTransferObject converterToKelvinTransferObject = new ConverterToKelvinTransferObject(converterToKelvinAccessObject.getValue(), "K");
        //return
        return new Response("Successfully Converted Data",converterToKelvinTransferObject, 2000);
    }



}
