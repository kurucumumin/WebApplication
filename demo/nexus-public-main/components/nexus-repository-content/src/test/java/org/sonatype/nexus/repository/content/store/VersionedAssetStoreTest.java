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
package org.sonatype.nexus.repository.content.store;

import org.junit.Before;
import org.junit.Test;

public class VersionedAssetStoreTest
    extends AssetStoreTestSupport
{
  @Before
  public void setup() {
    initialiseStores(true);
  }

  @Test
  public void testDeleteAsset() {
    super.testDeleteAsset();
  }

  @Test
  public void testBrowseUpdatedAssetsDifferentDates() {
    super.testBrowseUpdatedAssetsDifferentDates();
  }

  @Test
  public void testBrowseUpdatedAssetsIdenticalDates() {
    super.testBrowseUpdatedAssetsIdenticalDates();
  }

  @Test
  public void testDeleteAssetsByPaths() {
    super.testDeleteAssetsByPaths();
  }
}
