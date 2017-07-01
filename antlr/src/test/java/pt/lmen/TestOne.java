package pt.lmen;

import org.junit.Assert;
import org.junit.Test;

public class TestOne {

    public void assertTrans( String exp, String expectedTeanslation ) {

        ExpressionTranslator translator = new ExpressionTranslator();

        Assert.assertEquals( expectedTeanslation, translator.translate( exp ) );
    }

    @Test
    public void aa() {

//        assertTrans( " true ", " true " );
        assertTrans( " _asds.dsds.dsds.dsds ", " tekPanelModel('_asds.dsds.dsds.dsds') " );
        assertTrans( " _asds ", " tekPanelModel('_asds') " );
        assertTrans( " _asds.s == 12 ", " tekPanelModel('_asds.s') == 12 " );
        assertTrans( "_asds.s==12", "tekPanelModel('_asds.s')==12" );
        assertTrans( " !(_asds.s == 12) ", " !(tekPanelModel('_asds.s') == 12) " );
        assertTrans( " !(_asds.s == 12 && jklds != 'BBB') ",
            " !(tekPanelModel('_asds.s') == 12 && tekPanelModel('jklds') != 'BBB') " );
        assertTrans( " !(_asds.s[dsds + 1] == 12 && jklds != 'BBB') ",
            " !(tekPanelModel('_asds.s')[tekPanelModel('dsds') + 1] == 12 && tekPanelModel('jklds') != 'BBB') " );

    }

}
