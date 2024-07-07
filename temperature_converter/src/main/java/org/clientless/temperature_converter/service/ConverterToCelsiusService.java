package org.clientless.temperature_converter.service;

import org.clientless.temperature_converter.data.accessObject.ConverterToCelsiusAccessObject;
import org.clientless.temperature_converter.data.transferObject.ConverterToCelsiusTransferObject;
import org.clientless.temperature_converter.model.Response;
import org.springframework.stereotype.Service;

@Service
public class ConverterToCelsiusService {

    public Response celsiusToCelsius(Double valueTemperature, String unitTemperature){
        //Data Access Object
        ConverterToCelsiusAccessObject converterToCelsiusAccessObject = new ConverterToCelsiusAccessObject(valueTemperature,unitTemperature);
        //Data Transfer Object
        ConverterToCelsiusTransferObject converterToCelsiusTransferObject = new ConverterToCelsiusTransferObject(converterToCelsiusAccessObject.getValue(), "oC");
        //return
        return new Response("Successfully Converted Data",converterToCelsiusTransferObject, 2000);
    }

    public Response fahrenheitToCelsius(Double valueTemperature, String unitTemperature){
        Double lowestPointFahrenheit = 32.0;
        Double highestPointFahrenheit = 212.0;
        Double deltaHighestToLowestFahrenheit = highestPointFahrenheit - lowestPointFahrenheit;
        Double deltaPresentToLowestPointFahrenheit = valueTemperature - lowestPointFahrenheit;

        Double lowestPointCelsius = 0.0;
        Double highestPointCelsius = 100.0;
        Double deltaHighestToLowestCelsius = highestPointCelsius - lowestPointCelsius;

        Double presentCelsius = ((deltaPresentToLowestPointFahrenheit/deltaHighestToLowestFahrenheit)*deltaHighestToLowestCelsius)+lowestPointCelsius;

        //Data Access Object
        ConverterToCelsiusAccessObject converterToCelsiusAccessObject = new ConverterToCelsiusAccessObject(presentCelsius,unitTemperature);
        //Data Transfer Object
        ConverterToCelsiusTransferObject converterToCelsiusTransferObject = new ConverterToCelsiusTransferObject(converterToCelsiusAccessObject.getValue(), "oC");
        //return
        return new Response("Successfully Converted Data",converterToCelsiusTransferObject, 2000);
    }

    public Response kelvinToCelsius(Double valueTemperature, String unitTemperature){
        Double lowestPointKelvin = 273.0;
        Double highestPointKelvin = 373.0;
        Double deltaHighestToLowestKelvin = highestPointKelvin - lowestPointKelvin;
        Double deltaPresentToLowestPointKelvin = valueTemperature - lowestPointKelvin;

        Double lowestPointCelsius = 0.0;
        Double highestPointCelsius = 100.0;
        Double deltaHighestToLowestCelsius = highestPointCelsius - lowestPointCelsius;

        Double presentCelsius = ((deltaPresentToLowestPointKelvin/deltaHighestToLowestKelvin)*deltaHighestToLowestCelsius)+lowestPointCelsius;

        //Data Access Object
        ConverterToCelsiusAccessObject converterToCelsiusAccessObject = new ConverterToCelsiusAccessObject(presentCelsius,unitTemperature);
        //Data Transfer Object
        ConverterToCelsiusTransferObject converterToCelsiusTransferObject = new ConverterToCelsiusTransferObject(converterToCelsiusAccessObject.getValue(), "oC");
        //return
        return new Response("Successfully Converted Data",converterToCelsiusTransferObject, 2000);
    }

    public Response reaumurToCelsius(Double valueTemperature, String unitTemperature){
        Double lowestPointReaumur = 0.0;
        Double highestPointReaumur = 80.0;
        Double deltaHighestToLowestReaumur = highestPointReaumur - lowestPointReaumur;
        Double deltaPresentToLowestPointReaumur = valueTemperature - lowestPointReaumur;

        Double lowestPointCelsius = 0.0;
        Double highestPointCelsius = 100.0;
        Double deltaHighestToLowestCelsius = highestPointCelsius - lowestPointCelsius;

        Double presentCelsius = ((deltaPresentToLowestPointReaumur/deltaHighestToLowestReaumur)*deltaHighestToLowestCelsius)+lowestPointCelsius;

        //Data Access Object
        ConverterToCelsiusAccessObject converterToCelsiusAccessObject = new ConverterToCelsiusAccessObject(presentCelsius,unitTemperature);
        //Data Transfer Object
        ConverterToCelsiusTransferObject converterToCelsiusTransferObject = new ConverterToCelsiusTransferObject(converterToCelsiusAccessObject.getValue(), "oC");
        //return
        return new Response("Successfully Converted Data",converterToCelsiusTransferObject, 2000);
    }

}
