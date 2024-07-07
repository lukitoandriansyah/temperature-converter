package org.clientless.temperatureConverter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.clientless.temperatureConverter.model.Response;
import org.clientless.temperatureConverter.service.ConverterToReaumurService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature_converter")
public class ConverterToReaumurController {

    private final ConverterToReaumurService converterToReaumurService;

    public ConverterToReaumurController(ConverterToReaumurService converterToReaumurService) {
        this.converterToReaumurService = converterToReaumurService;
    }


    @GetMapping("/celsius-to-reaumur")
    public Response converterCelsiusToReaumur(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToReaumurService.celsiusToReaumur(valueTemperature, unitTemperature);
    }

    @GetMapping("/fahrenheit-to-reaumur")
    public Response converterFahrenheitToReaumur(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToReaumurService.fahrenheitToReaumur(valueTemperature, unitTemperature);
    }

    @GetMapping("/kelvin-to-reaumur")
    public Response converterKelvinToReaumur(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToReaumurService.kelvinToReaumur(valueTemperature, unitTemperature);
    }

    @GetMapping("/celsius-to-reaumur")
    public Response converterReaumurToReaumur(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToReaumurService.reaumurToReaumur(valueTemperature, unitTemperature);
    }

}
