package com.ontotext.cesparenttreefilter.filter;

import com.ontotext.docio.model.*;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;


/** **/
public class CESParentTreeResponseFilter implements ContainerResponseFilter {

    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        System.out.println("hello");

        if (containerRequestContext.getUriInfo().getPath().endsWith("extract")) {
            Document responseDocument = (Document)containerResponseContext.getEntity();
            for (AnnotationSet annotationSet : responseDocument.getAnnotationSets()) {
                for (Annotation annotation : annotationSet.getAnnotations()) {
                    Feature parentTreeFeature = new Feature();
                    Name name = new Name();
                    name.setName("prefLabelTree");
                    name.setType(NameType.XS_STRING);
                    parentTreeFeature.setName(name);
                    Value value = new Value();
                    value.setValue("/mock/pref/label/tree/here");
                    parentTreeFeature.setValue(value);
                    value.setType(ValueType.XS_STRING);
                    annotation.getFeatures().add(parentTreeFeature);
                }
            }
            containerResponseContext.setEntity(responseDocument);
        }
    }

}
