package com.axeiya.gwtckeditor.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class KeyPressedEvent extends GwtEvent<KeyPressedHandler> {
	
	public static Type<KeyPressedHandler> TYPE = new Type<KeyPressedHandler>();
	
	private final static Integer ENTER_Key = 13;
	private final static Integer UP_Key = 38;
	private final static Integer DOWN_Key = 40;
	
	private int _keyCode = -1;
	
	public KeyPressedEvent(Integer keyCode) {
		this._keyCode = keyCode;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<KeyPressedHandler> getAssociatedType() {
		return TYPE;
	}	
	
	public static void fire(HasKeyPressedHandlers source, int keyCode) {
		KeyPressedEvent event = new KeyPressedEvent(keyCode);
		source.fireEvent(event);
	}

	@Override
	protected void dispatch(KeyPressedHandler handler) {
		if(this._keyCode == ENTER_Key)
			handler.onEnterKeyPressed(this);
		if(this._keyCode == UP_Key)
			handler.onUpKeyPressed(this);
		if(this._keyCode == DOWN_Key)
			handler.onDownKeyPressed(this);
		
	}

}
