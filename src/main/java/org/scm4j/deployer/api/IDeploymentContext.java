package org.scm4j.deployer.api;

import java.io.File;
import java.net.URL;
import java.util.Map;

public interface IDeploymentContext {

    String getMainArtifact();
    Map<String, File> getArtifacts();
    URL getDeploymentURL();

}
