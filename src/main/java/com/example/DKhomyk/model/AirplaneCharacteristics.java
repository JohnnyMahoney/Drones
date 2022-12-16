package com.example.DKhomyk.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AirplaneCharacteristics {

  private Integer maxSpeed;
  private Integer maxOverdrive;
  private Integer rateOfChangeHeight;
  private Integer rateOfChangeCourse;
}
