package org.scm4j.deployer.api;

import org.eclipse.aether.version.Version;

import java.io.File;

public interface ILegacyProduct {

    Version getLegacyVersion();

    File getLegacyFile();

    int removeLegacyProduct();

    boolean queryLegacyProduct();

}
