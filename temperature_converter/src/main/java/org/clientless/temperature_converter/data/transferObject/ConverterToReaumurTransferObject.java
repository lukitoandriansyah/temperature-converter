package org.clientless.temperature_converter.data.transferObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConverterToReaumurTransferObject {
    private Double value;
    private String unit;
}
