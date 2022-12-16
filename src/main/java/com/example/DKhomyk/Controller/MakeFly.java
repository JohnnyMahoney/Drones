package com.example.DKhomyk.Controller;

import com.example.DKhomyk.model.Airplane;
import com.example.DKhomyk.model.AirplaneCharacteristics;
import com.example.DKhomyk.model.TemporaryPoint;
import com.example.DKhomyk.service.PlaneCalculation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MakeFly {
  PlaneCalculation planeCalculation;

  @Autowired
  public MakeFly(PlaneCalculation planeCalculation) {
    this.planeCalculation = planeCalculation;
  }

  Airplane airplane = new Airplane
      (4L, new AirplaneCharacteristics(4, 5, 6, 6), new TemporaryPoint(1.1, 1.2));
  List<TemporaryPoint> result = planeCalculation.count(airplane.getCharacteristics().getMaxSpeed());

}
