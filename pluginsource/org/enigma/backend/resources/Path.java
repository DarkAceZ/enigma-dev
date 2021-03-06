/*
 * Copyright (C) 2010 IsmAvatar <IsmAvatar@gmail.com>
 * 
 * This file is part of Enigma Plugin.
 * Enigma Plugin is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.enigma.backend.resources;

import java.util.Arrays;
import java.util.List;

import org.enigma.backend.sub.PathPoint;

import com.sun.jna.Structure;

public class Path extends Structure
	{
	public String name;
	public int id;

	public boolean smooth;
	public boolean closed;
	public int precision;

	public int snapX;
	public int snapY;

	public PathPoint.ByReference points;
	public int pointCount;

	@Override
	protected List<String> getFieldOrder()
		{
		return Arrays.asList("name","id","smooth","closed","precision","snapX","snapY","points",
				"pointCount");
		}

	public static class ByReference extends Path implements Structure.ByReference
		{
		}
	}
