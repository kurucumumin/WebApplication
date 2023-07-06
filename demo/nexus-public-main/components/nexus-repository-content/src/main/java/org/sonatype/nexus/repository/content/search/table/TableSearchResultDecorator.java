/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.content.search.table;

import org.sonatype.nexus.repository.content.SearchResult;
import org.sonatype.nexus.repository.search.ComponentSearchResult;

/**
 * Allows for data to be contributed to the {@link ComponentSearchResult}. Implement this interface when you need to
 * contribute data depending on format, field or some other condition which is not true for every row in the search
 * table.
 */
public interface TableSearchResultDecorator
{
  void updateComponent(ComponentSearchResult component, SearchResult searchResult);
}
