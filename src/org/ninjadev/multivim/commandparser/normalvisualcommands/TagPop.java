package org.ninjadev.multivim.commandparser.normalvisualcommands;

import java.util.EnumSet;

import org.ninjadev.multivim.commandparser.NormalVisualFlag;
import org.ninjadev.multivim.notimplemented.NotImplemented;

import com.googlecode.lanterna.input.Key;

public class TagPop extends NormalVisualCommand{

	public TagPop(Key commandKey, EnumSet<NormalVisualFlag> flags, int arg) {
		super(commandKey, flags, arg);
	}

	public void executeCommand() {
		NotImplemented.warn();
	}
}
