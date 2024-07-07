package org.clientless.temperature_converter.service;

import org.clientless.temperature_converter.data.accessObject.*;
import org.clientless.temperature_converter.data.transferObject.*;
import org.clientless.temperature_converter.model.Response;
import org.springframework.stereotype.Service;

@Service
public class ConverterToFahrenheitService {

    public Response fahrenheitToFahrenheit(Double valueTemperature, String unitTemperature){
        //Data Access Object
        ConverterToFahrenheitAccessObject converterToFahrenheitAccessObject = new ConverterToFahrenheitAccessObject(valueTemperature,unitTemperature);
        //Data Transfer Object
        ConverterToFahrenheitTransferObject converterToFahrenheitTransferObject = new ConverterToFahrenheitTransferObject(converterToFahrenheitAccessObject.getValue(), "oF");
        //return
        return new Response("Successfully Converted Data",converterToFahrenheitTransferObject, 2000);
    }

    public Response celsiusToFahrenheit(Double valueTemperature, String unitTemperature){
        Double lowestPointCelsius = 0.0;
        Double highestPointCelsius = 100.0;
        Double deltaHighestToLowestCelsius = highestPointCelsius - lowestPointCelsius;
        Double deltaPresentToLowestCelsius = valueTemperature - lowestPointCelsius;

        Double lowestPointFahrenheit = 32.0;
        Double highestPointFahrenheit = 212.0;
        Double deltaHighestToLowestFahrenheit = highestPointFahrenheit - lowestPointFahrenheit;

        Double presentFahrenheit = ((deltaPresentToLowestCelsius/deltaHighestToLowestCelsius)*deltaHighestToLowestFahrenheit)+lowestPointFahrenheit;
        //Data Access Object
        ConverterToFahrenheitAccessObject converterToFahrenheitAccessObject = new ConverterToFahrenheitAccessObject(presentFahrenheit,unitTemperature);
        //Data Transfer Object
        ConverterToFahrenheitTransferObject converterToFahrenheitTransferObject = new ConverterToFahrenheitTransferObject(converterToFahrenheitAccessObject.getValue(), "oF");
        //return
        return new Response("Successfully Converted Data",converterToFahrenheitTransferObject, 2000);
    }

    public Response kelvinToFahrenheit(Double valueTemperature, String unitTemperature){
        Double lowestPointKelvin = 273.0;
        Double highestPointKelvin = 373.0;
        Double deltaHighestToLowestKelvin = highestPointKelvin - lowestPointKelvin;
        Double deltaPresentToLowestPointKelvin = valueTemperature - lowestPointKelvin;

        Double lowestPointFahrenheit = 32.0;
        Double highestPointFahrenheit = 212.0;
        Double deltaHighestToLowestFahrenheit = highestPointFahrenheit - lowestPointFahrenheit;

        Double presentFahrenheit = ((deltaPresentToLowestPointKelvin/deltaHighestToLowestKelvin)*deltaHighestToLowestFahrenheit)+lowestPointFahrenheit;
        //Data Access Object
        ConverterToFahrenheitAccessObject converterToFahrenheitAccessObject = new ConverterToFahrenheitAccessObject(presentFahrenheit,unitTemperature);
        //Data Transfer Object
        ConverterToFahrenheitTransferObject converterToFahrenheitTransferObject = new ConverterToFahrenheitTransferObject(converterToFahrenheitAccessObject.getValue(), "oF");
        //return
        return new Response("Successfully Converted Data",converterToFahrenheitTransferObject, 2000);
    }

    public Response reaumurToFahrenheit(Double valueTemperature, String unitTemperature){
        Double lowestPointReaumur = 0.0;
        Double highestPointReaumur = 80.0;
        Double deltaHighestToLowestReaumur = highestPointReaumur - lowestPointReaumur;
        Double deltaPresentToLowestPointReaumur = valueTemperature - lowestPointReaumur;

        Double lowestPointFahrenheit = 32.0;
        Double highestPointFahrenheit = 212.0;
        Double deltaHighestToLowestFahrenheit = highestPointFahrenheit - lowestPointFahrenheit;

        Double presentFahrenheit = ((deltaPresentToLowestPointReaumur/deltaHighestToLowestReaumur)*deltaHighestToLowestFahrenheit)+valueTemperature;
        //Data Access Object
        ConverterToFahrenheitAccessObject converterToFahrenheitAccessObject = new ConverterToFahrenheitAccessObject(presentFahrenheit,unitTemperature);
        //Data Transfer Object
        ConverterToFahrenheitTransferObject converterToFahrenheitTransferObject = new ConverterToFahrenheitTransferObject(converterToFahrenheitAccessObject.getValue(), "oF");
        //return
        return new Response("Successfully Converted Data",converterToFahrenheitTransferObject, 2000);
    }


}
