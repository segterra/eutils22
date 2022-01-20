package gov.nih.ncbi.eutils;

import gov.nih.ncbi.eutils.model.PubmedArticleSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import java.io.FileReader;
import java.net.URL;

/**
 * User: aberkovsky
 * Date: 20.09.2015
 * Time: 22:30
 */
public class FetchPubmedService {
    private static final Logger logger = LoggerFactory.getLogger(FetchPubmedService.class);

    private static String BASE_FETCH_URL = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi";

    private JAXBContext jcontext;
    private SAXParserFactory saxParserFactory;

    public FetchPubmedService() {
        try {
            jcontext = JAXBContext.newInstance(PubmedArticleSet.class);

            saxParserFactory = SAXParserFactory.newInstance();
            saxParserFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            saxParserFactory.setFeature("http://xml.org/sax/features/validation", false);


        } catch (Exception e) {
            logger.error("Error initialize JAXBContext", e);
        }
    }

    public PubmedArticleSet fetch(String id) throws Exception {

        URL url = new URL(BASE_FETCH_URL+"?db=pubmed&id="+id+"&retmode=xml");
        XMLReader xmlReader = saxParserFactory.newSAXParser().getXMLReader();
        InputSource inputSource = new InputSource(url.openStream());
        SAXSource source = new SAXSource(xmlReader, inputSource);

        PubmedArticleSet set = (PubmedArticleSet)jcontext.createUnmarshaller().unmarshal(source);
        return set;
    }
}
