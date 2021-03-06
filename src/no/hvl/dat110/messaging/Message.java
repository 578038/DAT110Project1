package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		this.payload = payload; // TODO: check for length within boundary
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		
		byte[] encoded = null;
		
	
		encoded = new byte[128];
		
		encoded[0] = (byte) payload.length;
		
		for(int i = 0; i < payload.length; i++) {
			encoded[i+1] = payload[i];
		}
		
		
//		for(int i : encoded) {
//			encoded[i+1] = payload[i];
//		}
//		
//		int i = 0;
//		while(i < payload.length) {
//			encoded[i+1] = payload[i];
//			i++;
//		}
		
		// TODO
		// encapulate/encode the payload of this message in the
		// encoded byte array according to message format
		
//		if (true)
//		   throw new UnsupportedOperationException(TODO.method());

		return encoded;
		
	}

	public void decapsulate(byte[] received) {

		payload =  new byte[received[0]];
		
		for(int i = 0; i < payload.length; i++) {
			payload[i] = received[i+1];
		}
		
		
		// TODO
		// decapsulate the data contained in the received byte array and store it 
		// in the payload of this message
		
//		throw new UnsupportedOperationException(TODO.method());
		
	}
}
