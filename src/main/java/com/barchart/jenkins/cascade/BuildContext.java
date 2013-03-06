/**
 * Copyright (C) 2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.jenkins.cascade;

import hudson.model.BuildListener;
import hudson.model.AbstractBuild;

/**
 * Build context bean.
 * 
 * @author Andrei Pozolotin
 */
public class BuildContext<B extends AbstractBuild> {

	private final AbstractBuild build;
	private final BuildListener listener;

	public BuildContext(//
			final AbstractBuild build, //
			final BuildListener listener //
	) {
		this.build = build;
		this.listener = listener;
	}

	public B build() {
		return (B) build;
	}

	public BuildListener listener() {
		return listener;
	}

	/** Log text with plug-in prefix. */
	public void log(final String text) {
		listener.getLogger()
				.println(PluginConstants.LOGGER_PREFIX + " " + text);
	}

	/** Log error with plug-in prefix. */
	public void err(final String text) {
		listener.error(PluginConstants.LOGGER_PREFIX + " " + text);
	}

}