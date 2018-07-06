package org.scm4j.deployer.api;

import java.io.File;

public interface IDownloader {

	<T extends IDeploymentContext> T getContextByArtifactIdAndVersion(String artifactId, String version);

	void getProductFile(String coords);

	void getProductWithDependency(String coords);

	void loadProductDependency(File repository);

	IProduct getProduct();

}
