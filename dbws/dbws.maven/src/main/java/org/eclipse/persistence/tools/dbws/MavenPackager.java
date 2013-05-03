/*******************************************************************************
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *       dclarke - initial
 ******************************************************************************/
package org.eclipse.persistence.tools.dbws;

import static org.eclipse.persistence.tools.dbws.DBWSPackager.ArchiveUse.noArchive;

public class MavenPackager extends IDEPackager {

    public MavenPackager() {
        super(null, "maven", noArchive);
        srcDirname = "dbws-src";
        publicHTMLDirname = "dbws-web";
    }

}
