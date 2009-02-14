/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.builtin.parser.packrat.consumers;

import org.eclipse.xtext.parser.packrat.consumers.AbstractRuleAwareTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.ConsumeResult;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumerConfiguration;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public final class XtextBuiltinML_COMMENTConsumer extends AbstractRuleAwareTerminalConsumer {

	public XtextBuiltinML_COMMENTConsumer(ITerminalConsumerConfiguration configuration) {
		super(configuration);
	}

	@Override
	public int doConsume() {
		boolean result = true;
		// '/*'
		result = readString("/*");
		if (result) {
			result = readUntil("*/");
		}
		return result ? ConsumeResult.SUCCESS : ConsumeResult.EMPTY_MATCH;
	}

}