package org.usergrid.rest;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerEnvironmentProperties {

	private static final Logger logger = LoggerFactory
	            .getLogger(ServerEnvironmentProperties.class);

	
  public static final String API_BASE = "swagger.basepath";

  public static final String RECAPTCHA_PUBLIC = "usergrid.recaptcha.public";
  public static final String RECAPTCHA_PRIVATE = "usergrid.recaptcha.private";

  public static final String REDIRECT_ROOT = "usergrid.redirect_root";

  private final Properties properties;

  public ServerEnvironmentProperties(Properties properties) {
    this.properties = properties;
    logger.info(properties.toString());
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }

  public String getApiBase() {
    return properties.getProperty(API_BASE);
  }

  public String getRecaptchaPublic() {
    return properties.getProperty(RECAPTCHA_PUBLIC);
  }

  public String getRecaptchaPrivate() {
    return properties.getProperty(RECAPTCHA_PRIVATE);
  }

  public String getRedirectRoot() {
    return properties.getProperty(REDIRECT_ROOT);
  }

}
