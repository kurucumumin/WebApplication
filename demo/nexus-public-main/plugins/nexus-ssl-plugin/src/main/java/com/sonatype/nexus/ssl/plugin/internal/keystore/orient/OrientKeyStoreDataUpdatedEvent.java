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
package com.sonatype.nexus.ssl.plugin.internal.keystore.orient;

import com.sonatype.nexus.ssl.plugin.internal.keystore.KeyStoreDataEvent;

import org.sonatype.nexus.common.entity.EntityMetadata;
import org.sonatype.nexus.common.entity.EntityUpdatedEvent;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Emitted when a {@link OrientKeyStoreData} entity has been updated.
 *
 * @since 3.1
 */
public class OrientKeyStoreDataUpdatedEvent
    extends EntityUpdatedEvent
    implements KeyStoreDataEvent
{
  private final String keyStoreName;

  public OrientKeyStoreDataUpdatedEvent(final EntityMetadata metadata, final String keyStoreName) {
    super(metadata);
    this.keyStoreName = checkNotNull(keyStoreName);
  }

  @Override
  public String getKeyStoreName() {
    return keyStoreName;
  }
}
