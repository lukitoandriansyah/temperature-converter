package id.clientless.tc.temperatureConverter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import id.clientless.tc.temperatureConverter.model.Response;
import id.clientless.tc.temperatureConverter.service.ConverterToFahrenheitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature_converter")
public class ConverterToFahrenheitController {

    private final ConverterToFahrenheitService converterToFahrenheitService;

    public ConverterToFahrenheitController(ConverterToFahrenheitService converterToFahrenheitService) {
        this.converterToFahrenheitService = converterToFahrenheitService;
    }


    @GetMapping("/celsius-to-fahrenheit")
    public Response converterCelsiusToFahrenheit(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToFahrenheitService.celsiusToFahrenheit(valueTemperature, unitTemperature);
    }

    @GetMapping("/fahrenheit-to-fahrenheit")
    public Response converterFahrenheitToFahrenheit(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToFahrenheitService.fahrenheitToFahrenheit(valueTemperature, unitTemperature);
    }

    @GetMapping("/kelvin-to-fahrenheit")
    public Response converterKelvinToFahrenheit(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToFahrenheitService.kelvinToFahrenheit(valueTemperature, unitTemperature);
    }

    @GetMapping("/celsius-to-fahrenheit")
    public Response converterReaumurToFahrenheit(@RequestParam String unitTemperature, @RequestParam Double valueTemperature) throws JsonProcessingException {
        return converterToFahrenheitService.reaumurToFahrenheit(valueTemperature, unitTemperature);
    }

}
