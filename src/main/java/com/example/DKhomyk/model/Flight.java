package com.example.DKhomyk.model;

import java.util.List;
import lombok.Data;

@Data
public class Flight {
  private Long number;
  List<WayPoint> wayPoints;
  List<TemporaryPoint> passedPoints;

}
