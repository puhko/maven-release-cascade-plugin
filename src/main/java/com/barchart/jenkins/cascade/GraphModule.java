/**
 * Copyright (C) 2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.jenkins.cascade;

import hudson.Extension;
import hudson.plugins.depgraph_view.model.graph.EdgeProvider;
import hudson.plugins.depgraph_view.model.graph.SubProjectProvider;

import java.util.logging.Logger;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * Provide cascade project graph wiring.
 * <p>
 * Not used, since we need remove default providers contributed by depgraph-view
 * plugin.
 * 
 * @author Stefan Wolf
 * @author Andrei Pozolotin
 */
@Extension
public class GraphModule extends AbstractModule {

	protected final static Logger log = Logger.getLogger(GraphModule.class
			.getName());

	@Override
	protected void configure() {

		log.info("### GraphModule");

		final Multibinder<EdgeProvider> edgeProviderMultibinder = Multibinder
				.newSetBinder(binder(), EdgeProvider.class);

		// edgeProviderMultibinder.addBinding().to(GraphEdgeProvider.class);

		final Multibinder<SubProjectProvider> subProjectProviderMultibinder = Multibinder
				.newSetBinder(binder(), SubProjectProvider.class);

		// subProjectProviderMultibinder.addBinding().to(
		// GraphSubProjectProvider.class);

	}

}
