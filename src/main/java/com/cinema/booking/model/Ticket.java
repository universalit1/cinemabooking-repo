package com.cinema.booking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private  String movieName;
    private  float price;
    private String cinemaHall;
    //docker run -p 5000:5000 in28min/todo-rest-api-h2:1.0.0.RELEASE
}
