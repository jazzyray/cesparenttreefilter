package com.ontotext.cesparenttreefilter;

import com.ontotext.cesparenttreefilter.config.CESParentTreeFilterConfiguration;
import com.ontotext.cesparenttreefilter.filter.CESParentTreeResponseFilter;
import com.ontotext.cesparenttreefilter.health.CESParentTreeFilterHealthCheck;
import com.ontotext.cesparenttreefilter.resource.CESParentTreeFilterResource;
import com.ontotext.cesparenttreefilter.service.CESParentTreeFilterService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

/** **/
public class CESParentTreeFilterApplication extends Application<CESParentTreeFilterConfiguration> {

    CESParentTreeFilterService cesParentTreeFilterService;

    @Override
    public void run(CESParentTreeFilterConfiguration cESParentTreeFilter, Environment environment) throws Exception {
        this.cesParentTreeFilterService = new CESParentTreeFilterService();

        final CESParentTreeFilterResource resource = new CESParentTreeFilterResource(this.cesParentTreeFilterService);
        final CESParentTreeResponseFilter filter = new CESParentTreeResponseFilter();

        final CESParentTreeFilterHealthCheck healthCheck = new CESParentTreeFilterHealthCheck();
        environment.healthChecks().register("cesparenttreefilter", healthCheck);

        environment.jersey().register(resource);
        environment.jersey().register(filter);
    }

    @Override
    public void initialize(Bootstrap<CESParentTreeFilterConfiguration> bootstrap) {

        bootstrap.addBundle(new SwaggerBundle<CESParentTreeFilterConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(CESParentTreeFilterConfiguration configuration) {
                return configuration.swaggerBundleConfiguration;
            }
        });
    }

    public static void main(String[] args) throws Exception {
        new CESParentTreeFilterApplication().run(args);
    }

}
