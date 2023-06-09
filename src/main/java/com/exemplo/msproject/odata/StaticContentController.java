package com.exemplo.msproject.odata;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.olingo.commons.api.format.ContentType;
import org.apache.olingo.commons.api.http.HttpHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teiid.core.TeiidProcessingException;
import org.teiid.core.util.ObjectConverterUtil;
import org.teiid.json.simple.JSONParser;
import org.teiid.olingo.ODataPlugin;

//@RestController
//@RequestMapping("/static")
public class StaticContentController {

//    @RequestMapping(value = {"org.apache.olingo.v1.xml", "org.teiid.v1.xml"})
//    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String pathInfo = request.getRequestURI();
//
//        try {
//            int idx = pathInfo.indexOf("/static");
//            pathInfo = pathInfo.substring(idx+7);
//            InputStream contents = getClass().getResourceAsStream(pathInfo);
//            if (contents != null) {
//                writeContent(response, contents);
//                response.flushBuffer();
//                return;
//            }
//            throw new TeiidProcessingException(ODataPlugin.Util.gs(ODataPlugin.Event.TEIID16055, pathInfo));
//        } catch (TeiidProcessingException e) {
//            writeError(request, e.getCode(), e.getMessage(), response, 404);
//        }
//    }
//
//    private void writeContent(HttpServletResponse response, InputStream contents) throws IOException {
//        ObjectConverterUtil.write(response.getOutputStream(), contents, -1);
//    }
//
//    static void writeError(ServletRequest request, String code, String message,
//                           HttpServletResponse httpResponse, int statusCode) throws IOException {
//        httpResponse.setStatus(statusCode);
//        String format = request.getParameter("$format"); //$NON-NLS-1$
//        if (format == null) {
//            //TODO: could also look at the accepts header
//            ContentType contentType = ContentType.parse(request.getContentType());
//            if (contentType == null || contentType.isCompatible(ContentType.APPLICATION_JSON)) {
//                format = "json"; //$NON-NLS-1$
//            } else {
//                format = "xml"; //$NON-NLS-1$
//            }
//        }
//        PrintWriter writer = httpResponse.getWriter();
//        if (code == null) {
//            code = "";
//        }
//        if (message == null) {
//            message = "";
//        }
//        if (format.equalsIgnoreCase("json")) { //$NON-NLS-1$
//            httpResponse.setHeader(HttpHeader.CONTENT_TYPE, ContentType.APPLICATION_JSON.toContentTypeString());
//            writer.write("{ \"error\": { \"code\": \""); //$NON-NLS-1$
//            JSONParser.escape(code, writer);
//            writer.write("\", \"message\": \""); //$NON-NLS-1$
//            JSONParser.escape(message, writer);
//            writer.write("\" } }"); //$NON-NLS-1$
//        } else {
//            try {
//                httpResponse.setHeader(HttpHeader.CONTENT_TYPE, ContentType.APPLICATION_XML.toContentTypeString());
//                XMLStreamWriter xmlStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(writer);
//                xmlStreamWriter.writeStartElement("m", "error", "http://docs.oasis-open.org/odata/ns/metadata"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//                xmlStreamWriter.writeNamespace("m", "http://docs.oasis-open.org/odata/ns/metadata"); //$NON-NLS-1$ //$NON-NLS-2$
//                xmlStreamWriter.writeStartElement("m", "code", "http://docs.oasis-open.org/odata/ns/metadata"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//                xmlStreamWriter.writeCharacters(code);
//                xmlStreamWriter.writeEndElement();
//                xmlStreamWriter.writeStartElement("m", "message", "http://docs.oasis-open.org/odata/ns/metadata"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//                xmlStreamWriter.writeCharacters(message);
//                xmlStreamWriter.writeEndElement();
//                xmlStreamWriter.writeEndElement();
//                xmlStreamWriter.flush();
//            } catch (XMLStreamException x) {
//                throw new IOException(x);
//            }
//        }
//        writer.close();
//    }
}