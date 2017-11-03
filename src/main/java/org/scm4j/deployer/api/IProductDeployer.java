package org.scm4j.deployer.api;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface IProductDeployer {

	int deploy(String artifactId, String version);

	int undeploy(String artifactId, String version);

	int upgrade(String artifactId, String version);

	File download(String artifactId, String version);

	List<String> listProducts();

	List<String> refreshProducts();

	Map<String, Boolean> listProductVersions(String artifactId);

	Map<String, Boolean> refreshProductVersions(String artifactId);

	Map<String, Object> listDeployedProducts();

}
