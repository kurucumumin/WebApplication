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
package org.sonatype.nexus.selector;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Subset of JEXL selectors that can also be represented as SQL.
 *
 * @since 3.6
 */
public class CselSelector
    extends JexlSelector
{
  public static final String TYPE = "csel";

  private final CselToSql cselToSql;

  public CselSelector(final CselToSql cselToSql, final JexlExpression expression) {
    super(expression);
    this.cselToSql = checkNotNull(cselToSql);

  }

  @Override
  public void toSql(final SelectorSqlBuilder sqlBuilder) {
    cselToSql.transformCselToSql(expression.getSyntaxTree(), sqlBuilder);
  }

  @Override
  public void toSql(final SelectorSqlBuilder sqlBuilder, final CselToSql cselToSql) {
    cselToSql.transformCselToSql(expression.getSyntaxTree(), sqlBuilder);
  }
}
