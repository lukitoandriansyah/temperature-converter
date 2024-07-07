package org.clientless.temperature_converter.service;

import org.clientless.temperature_converter.data.accessObject.*;
import org.clientless.temperature_converter.data.transferObject.*;
import org.clientless.temperature_converter.model.Response;
import org.springframework.stereotype.Service;

@Service
public class ConverterToReaumurService {


    public Response reaumurToReaumur(Double valueTemperature, String unitTemperature){
        //Data Access Object
        ConverterToReaumurAccessObject converterToReaumurAccessObject = new ConverterToReaumurAccessObject(valueTemperature,unitTemperature);
        //Data Transfer Object
        ConverterToReaumurTransferObject converterToReaumurTransferObject = new ConverterToReaumurTransferObject(converterToReaumurAccessObject.getValue(), "oR");
        //return
        return new Response("Successfully Converted Data",converterToReaumurTransferObject, 2000);
    }
    public Response celsiusToReaumur(Double valueTemperature, String unitTemperature){
        Double lowestPointCelsius = 0.0;
        Double highestPointCelsius = 100.0;
        Double deltaHighestToLowestCelsius = highestPointCelsius - lowestPointCelsius;
        Double deltaPresentToLowestPointCelsius = valueTemperature - lowestPointCelsius;

        Double lowestPointReaumur = 0.0;
        Double highestPointReaumur = 80.0;
        Double deltaHighestToLowestReaumur = highestPointReaumur - lowestPointReaumur;

        Double presentReaumur = ((deltaPresentToLowestPointCelsius/deltaHighestToLowestCelsius)*deltaHighestToLowestReaumur)+lowestPointReaumur;
        //Data Access Object
        ConverterToReaumurAccessObject converterToReaumurAccessObject = new ConverterToReaumurAccessObject(presentReaumur,unitTemperature);
        //Data Transfer Object
        ConverterToReaumurTransferObject converterToReaumurTransferObject = new ConverterToReaumurTransferObject(converterToReaumurAccessObject.getValue(), "oR");
        //return
        return new Response("Successfully Converted Data",converterToReaumurTransferObject, 2000);
    }

    public Response fahrenheitToReaumur(Double valueTemperature, String unitTemperature){
        Double lowestPointFahrenheit = 32.0;
        Double highestPointFahrenheit = 212.0;
        Double deltaHighestToLowestFahrenheit = highestPointFahrenheit - lowestPointFahrenheit;
        Double deltaPresentToLowestPointFahrenheit = valueTemperature - lowestPointFahrenheit;

        Double lowestPointReaumur = 0.0;
        Double highestPointReaumur = 80.0;
        Double deltaHighestToLowestReaumur = highestPointReaumur - lowestPointReaumur;

        Double presentReaumur = ((deltaPresentToLowestPointFahrenheit/deltaHighestToLowestFahrenheit)*deltaHighestToLowestReaumur)+lowestPointReaumur;
        //Data Access Object
        ConverterToReaumurAccessObject converterToReaumurAccessObject = new ConverterToReaumurAccessObject(presentReaumur,unitTemperature);
        //Data Transfer Object
        ConverterToReaumurTransferObject converterToReaumurTransferObject = new ConverterToReaumurTransferObject(converterToReaumurAccessObject.getValue(), "oR");
        //return
        return new Response("Successfully Converted Data",converterToReaumurTransferObject, 2000);
    }

    public Response kelvinToReaumur(Double valueTemperature, String unitTemperature){
        Double lowestPointKelvin = 273.0;
        Double highestPointKelvin = 373.0;
        Double deltaHighestToLowestKelvin = highestPointKelvin - lowestPointKelvin;
        Double deltaPresentToLowestPointKelvin = valueTemperature - lowestPointKelvin;

        Double lowestPointReaumur = 0.0;
        Double highestPointReaumur = 80.0;
        Double deltaHighestToLowestReaumur = highestPointReaumur - lowestPointReaumur;

        Double presentReaumur = ((deltaPresentToLowestPointKelvin/deltaHighestToLowestKelvin)*deltaHighestToLowestReaumur)+lowestPointReaumur;
        //Data Access Object
        ConverterToReaumurAccessObject converterToReaumurAccessObject = new ConverterToReaumurAccessObject(presentReaumur,unitTemperature);
        //Data Transfer Object
        ConverterToReaumurTransferObject converterToReaumurTransferObject = new ConverterToReaumurTransferObject(converterToReaumurAccessObject.getValue(), "oR");
        //return
        return new Response("Successfully Converted Data",converterToReaumurTransferObject, 2000);
    }



}
