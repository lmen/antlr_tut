package pt.lmen;

import org.junit.Assert;
import org.junit.Test;

public class TestOne {

	public void assertTrans(String exp, String expectedTeanslation) {

		ExpressionTranslator translator = new ExpressionTranslator();

		Assert.assertEquals(expectedTeanslation, translator.translate(exp));
	}

	@Test
	public void aa() {

		assertTrans(" ghjg::substring('hjk', bnh) ", " _$_M('ghjg').substring('hjk', _$_M('bnh')) ");
		assertTrans(" prop1.prop2::yu.jj[jk] ", " _$_M('prop1.prop2').yu.jj[_$_M('jk')] ");
		assertTrans(" true ", " true ");
		assertTrans(" 'hjk' && 89.0 ", " 'hjk' && 89.0 ");
		assertTrans(" !truew==true ", " !_$_M('truew')==true ");
		assertTrans(" _asds.dsds.dsds.dsds ", " _$_M('_asds.dsds.dsds.dsds') ");
		assertTrans(" _asds ", " _$_M('_asds') ");
		assertTrans(" _asds.s == 12 ", " _$_M('_asds.s') == 12 ");
		assertTrans("_asds.s==12", "_$_M('_asds.s')==12");
		assertTrans(" !(_asds.s == 12) ", " !(_$_M('_asds.s') == 12) ");
		assertTrans(" !(_asds.s == 12 && jklds != 'BBB') ", " !(_$_M('_asds.s') == 12 && _$_M('jklds') != 'BBB') ");
		assertTrans(" !(_asds.s[dsds + 1] == 12 && jklds != 'BBB') ",
				" !(_$_M('_asds.s')[_$_M('dsds') + 1] == 12 && _$_M('jklds') != 'BBB') ");

	}

}
