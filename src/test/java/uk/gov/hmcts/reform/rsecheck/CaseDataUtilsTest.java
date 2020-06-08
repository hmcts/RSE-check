package uk.gov.hmcts.reform.rsecheck;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CaseDataUtilsTest {

    @Test
    public void givenDataWithCaseLink_thenReturnLinkValue() {
        assertThat("Toto should be himself","Toto", is("Toto"));
    }

    @Test
    public void notFinishedAssertion() {
        assertThat("Toto should be be an issue");
    }

    @Test
    public void notAssertion() {
        String ranValuated = Double.toString(Math.random());
        Boolean  valuatedRes = ranValuated.contains("1234");
        checkValuated(ranValuated);
    }

    Boolean checkValuated(String valuated){
        return null;
    }

    boolean soManyParam(int p1,int p2, int p3, int p4, String p5, String p6, String p7, String p8, int p9){
        return false;
    }

}
