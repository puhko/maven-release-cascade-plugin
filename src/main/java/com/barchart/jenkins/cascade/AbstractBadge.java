/**
 * Copyright (C) 2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.jenkins.cascade;

import hudson.model.BuildBadgeAction;

/**
 * Attach action to build to display a layout build icon in the project build
 * history.
 * 
 * @author Andrei Pozolotin
 */
public class AbstractBadge extends AbstractAction implements BuildBadgeAction {

	public AbstractBadge(final String displayName, final String iconFileName) {
		super(displayName, iconFileName);
	}

}
