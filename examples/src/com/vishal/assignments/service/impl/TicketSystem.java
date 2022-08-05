package com.vishal.assignments.service.impl;

import com.vishal.assignments.service.Ticket;

//Ticket interface having one abstract method

public class TicketSystem {
	public static void main(String[] args) {
		Ticket ticket;

		ticket = new Bus();

		ticket.ticketType();

		ticket = new Movie();

		ticket.ticketType();

	}
}