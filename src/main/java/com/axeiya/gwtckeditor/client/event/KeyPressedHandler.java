package com.axeiya.gwtckeditor.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface KeyPressedHandler extends EventHandler {
	
	void onUpKeyPressed(KeyPressedEvent event);
	
	void onDownKeyPressed(KeyPressedEvent event);
	
	void onEnterKeyPressed(KeyPressedEvent event);

}
