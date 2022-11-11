package Labday;

public class AirlinesMain {



		public static void main(String[] args) throws Exception {
			AirlinesTicket ticket = new AirlinesTicket();
			if (ticket.log_status == false) {
				ticket.login();
				ticket.bookFlight();
				ticket.detailList();
				ticket.Passenger();
				ticket.addPassenger();
				ticket.deletePassenger();
				ticket.fetchTicketData();
			}	
		}
	}
