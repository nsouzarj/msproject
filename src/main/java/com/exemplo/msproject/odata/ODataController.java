package com.exemplo.msproject.odata;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teiid.olingo.web.ODataServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@RestController
//@RequestMapping(value = "/odata")
//@CrossOrigin ( origins = {"*"},allowCredentials = "",originPatterns = {"*"},exposedHeaders = {"*"})

public class ODataController {
//    private ODataServlet servlet = new ODataServlet();
//    @CrossOrigin( origins = {"*"},allowCredentials = "",originPatterns = {"*"},exposedHeaders = {"*"})
//    @RequestMapping (value = "*")
//    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
//        HttpServletRequest actual = (HttpServletRequest) request.getAttribute(SpringODataFilter.REQUEST);
//        HttpServletRequestWrapper wrapper = new HttpServletRequestWrapper(actual) {
//            @Override
//            public String getServletPath() {
//                return "";
//            }
//            @Override
//            public String getContextPath() {
//                return (String)actual.getAttribute(SpringODataFilter.CONTEXT_PATH);
//            }
//        };
//        servlet.service(wrapper, response);
//    }
}