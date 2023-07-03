package com.example.jms.model;


import lombok.*;

import java.io.Serializable;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HellowWorldMessage implements Serializable {
 static final long serialVersionUID = -5213937224863675860L;

 private String message;
}
