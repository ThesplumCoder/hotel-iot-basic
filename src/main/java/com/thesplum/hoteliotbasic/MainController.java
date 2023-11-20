package com.thesplum.hoteliotbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * MainController es el controlador que va a responder todas las peticiones del
 * servidor.
 */
@RestController
public class MainController {

  @GetMapping("/greeting")
  @ResponseBody
  public PacketMessage greeting() {
    return new PacketMessage("Hi from server.");
  }

  @PostMapping("/reflection")
  @ResponseBody
  public PacketMessage reflection(@RequestBody PacketMessage message) {
    return message;
  }

  @GetMapping("/test-room")
  @ResponseBody
  public Room testRoom() {
    return new Room(10, true, "0x13242342");
  }

  @PostMapping("/reflect-room")
  @ResponseBody
  public Room reflectRoom(@RequestBody Room room) {
    return room;
  }
}

class PacketMessage {
  private String message;

  public PacketMessage() {
    //
  }

  public PacketMessage(String message) {
    setMessage(message);
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

class Room {
  private Integer number;
  private boolean occupied;
  private String rfidCard;

  public Room(Integer number, boolean occupied, String rfidCard) {
    setNumber(number);
    setOccupied(occupied);
    setRfidCard(rfidCard);
  }

  public Integer getNumber() {
    return number;
  }

  public boolean getOccupied() {
    return occupied;
  }

  public String getRfidCard() {
    return rfidCard;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public void setOccupied(boolean occupied) {
    this.occupied = occupied;
  }

  public void setRfidCard(String rfidCard) {
    this.rfidCard = rfidCard;
  }
}
