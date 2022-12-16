package com.example.DKhomyk.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Airplane {

  private Long id;
  private AirplaneCharacteristics characteristics;
  private TemporaryPoint position;
}
