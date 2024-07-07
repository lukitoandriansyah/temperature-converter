package org.clientless.temperatureConverter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.clientless.temperatureConverter.model.Response;
import org.clientless.temperatureConverter.service.ConverterToKelvinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature_converter")
public class ConverterToKelvinController {

    private final ConverterToKelvinService converterToKelvinService;

    public ConverterToKelvinController(ConverterToKelvinService converterToKelvinService) {
        this.converterToKelvinService = converterToKelvinService;
    }


    @GetMapping("/celsius-to-kelvin")
    public Response converterCelsiusToKelvin(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToKelvinService.celsiusToKelvin(valueTemperature, unitTemperature);
    }

    @GetMapping("/fahrenheit-to-kelvin")
    public Response converterFahrenheitToKelvin(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToKelvinService.fahrenheitToKelvin(valueTemperature, unitTemperature);
    }

    @GetMapping("/kelvin-to-kelvin")
    public Response converterKelvinToKelvin(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToKelvinService.kelvinToKelvin(valueTemperature, unitTemperature);
    }

    @GetMapping("/celsius-to-kelvin")
    public Response converterReaumurToKelvin(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToKelvinService.reaumurToKelvin(valueTemperature, unitTemperature);
    }

}
