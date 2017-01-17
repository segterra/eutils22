import gov.nih.ncbi.eutils.FetchPubmedService;
import org.junit.Test;

/**
 * User: aberkovsky
 * Date: 20.09.2015
 * Time: 22:43
 */
public class FetchPubmedServiceTest {
    @Test
    public void testFetch() throws Exception {
        FetchPubmedService service = new FetchPubmedService();
        service.fetch("17284678");
    }
}