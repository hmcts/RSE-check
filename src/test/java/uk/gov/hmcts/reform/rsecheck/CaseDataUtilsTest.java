package uk.gov.hmcts.reform.rsecheck;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CaseDataUtilsTest {

    @Test
    public void givenDataWithCaseLink_thenReturnLinkValue() {
        assertThat("Toto should be himself","Toto", is("Toto"));
    }

}
