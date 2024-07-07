package org.clientless.temperature_converter.data.accessObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConverterToKelvinAccessObject {
    private Double value;
    private String unit;
}
