package com.ontotext.cesparenttreefilter.service;

import com.ontotext.cesparenttreefilter.util.ResourceUtil;
import com.ontotext.docio.DocumentIOException;
import com.ontotext.docio.DocumentIOJson;
import com.ontotext.docio.model.Document;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/** **/
public class CESParentTreeFilterService {

    public static final String CONTENT_JSON_FILENAME = "document/chp-generic-doc_xpected.GENERIC_DOCUMENT_JSON_VALUE.json";
    public static final String CONTENT_JSON = ResourceUtil.getResourceFileAsString(CONTENT_JSON_FILENAME);

    public Document contentDocument;

    public CESParentTreeFilterService() {
        DocumentIOJson jsonDoc = new DocumentIOJson();
        try {
            contentDocument = jsonDoc.read(new ByteArrayInputStream(CONTENT_JSON.getBytes(StandardCharsets.UTF_8)));
        } catch (DocumentIOException dioe) {
            throw new RuntimeException(dioe);
        }
    }

    public Document getContentDocument() {
        return this.contentDocument;
    }

}
