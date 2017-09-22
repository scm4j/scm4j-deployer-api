package org.scm4j.deployer.api;

import lombok.Data;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;

@Data
public class DeploymentContext implements IDeploymentContext {

    private Map<String, File> artifacts;
    private List<String> deps;
    private URL deploymentURL;
    private Map<String,Object> params;

}
