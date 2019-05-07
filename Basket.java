/*
  Basket.java / COPY WWW
  Copyright (C) Galgotias University

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License as
  published by the Free Software Foundation; either version 2 of
  the License, or (at your option) any later version.
*/

package minicopier;
import java.util.*;

public class Basket {

	//Contains paths of files/folders to be copied
	private Vector<String> basketContent;
	
	/* Creation of an empty basket */
	public Basket () {
		this.basketContent = new Vector<String>() ;
	}
	
	/* Add a path to the basket
	 * @path path of a folder/file to be copied
	 */
	public void add (String path) {
		this.basketContent.add(path);
	}
	
	public Iterator<String> getIterator() {
		return basketContent.iterator();
	}
	
	public boolean isEmpty() {
		return this.basketContent.isEmpty();
	}
	
	public int getLength(){
		return basketContent.size();
	}
}
