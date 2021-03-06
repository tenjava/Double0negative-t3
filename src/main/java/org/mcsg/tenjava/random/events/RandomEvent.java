package org.mcsg.tenjava.random.events;

import org.bukkit.event.Event;


/**
 * Interface for a random event.
 * @author drew
 *
 */
public interface RandomEvent {

	/**
	 * Test if this event should start. 
	 * @param event
	 * @return should it start?
	 */
	public<T extends Event> boolean isRandom(T event);
	
	/**
	 * Start the event
	 * 
	 */
	public <T extends Event> void startEvent(T event);
	
	
	
	/**
	 * return a new instance of this event
	 * @return get and instance of this event
	 */
	public RandomEvent getInstance();
}
