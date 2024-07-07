package org.clientless.temperature_converter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.clientless.temperature_converter.model.Response;
import org.clientless.temperature_converter.service.ConverterToCelsiusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature_converter")
public class ConverterToCelsiusController {

    private final ConverterToCelsiusService converterToCelsiusService;

    public ConverterToCelsiusController(ConverterToCelsiusService converterToCelsiusService) {
        this.converterToCelsiusService = converterToCelsiusService;
    }


    @GetMapping("/celsius-to-celsius")
    public Response converterCelsiusToCelsius(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToCelsiusService.celsiusToCelsius(valueTemperature, unitTemperature);
    }

    @GetMapping("/fahrenheit-to-celsius")
    public Response converterFahrenheitToCelsius(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToCelsiusService.fahrenheitToCelsius(valueTemperature, unitTemperature);
    }

    @GetMapping("/kelvin-to-celsius")
    public Response converterKelvinToCelsius(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToCelsiusService.kelvinToCelsius(valueTemperature, unitTemperature);
    }

    @GetMapping("/celsius-to-celsius")
    public Response converterReaumurToCelsius(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToCelsiusService.reaumurToCelsius(valueTemperature, unitTemperature);
    }

}
