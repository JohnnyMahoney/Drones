package com.example.DKhomyk.service;

import com.example.DKhomyk.model.TemporaryPoint;
import com.example.DKhomyk.model.WayPoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PlaneCalculation {


  public double calculateRoute(Double longitude1, Double longitude2, Integer speed) {
    double count = (longitude2 - longitude1) * 85.4 / speed;
    return count;

  }

  public List<TemporaryPoint> count(int speed) {
    List<WayPoint> wayPoints = List.of(new WayPoint(54.00, 34.00), new WayPoint(68.00, 47.00));

    WayPoint waypoint1 = wayPoints.get(0);
    WayPoint waypoint2 = wayPoints.get(1);
    double count = calculateRoute(waypoint1.getLongitude(), waypoint2.getLongitude(), 10);
    double diff1 = waypoint2.getLongitude() - waypoint1.getLongitude();
    double diff2 = waypoint2.getBreadth() - waypoint1.getBreadth();
    double dx = Math.abs(diff1);
    double dy = Math.abs(diff2);
    double ix = dx / count;
    double iy = dy / count;
    List<TemporaryPoint> temporaryPoints = new ArrayList<>();

    for (int i = 1; i < count; i++) {
      double x;
      double y;
      x = ix * i;
      y = iy * i;
      temporaryPoints.add(new TemporaryPoint(x, y));
    }
    return temporaryPoints;
  }


}
