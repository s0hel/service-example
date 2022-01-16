package com.s0hel.service.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Message {
  private Integer id;
  private String message;
  private Date timestamp;
}
