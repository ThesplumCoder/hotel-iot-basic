package com.thesplum.hoteliotbasic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
