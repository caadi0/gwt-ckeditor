package com.axeiya.gwtckeditor.client.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public interface HasKeyPressedHandlers extends HasHandlers {

	HandlerRegistration addKeyPressedHandler(KeyPressedHandler handler);
}
