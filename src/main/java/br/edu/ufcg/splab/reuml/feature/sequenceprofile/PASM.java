package br.edu.ufcg.splab.reuml.feature.sequenceprofile;

import br.edu.ufcg.splab.reuml.feature.Measurable;

import org.w3c.dom.Document;

import javax.xml.xpath.*;

/**
 * Created by thaciana on 23/11/2015.
 */
public class PASM implements Measurable {

    public static final String NAME = "Presence of asynchronous signal messages";
    private static final String XPATH_QUERY = "count(//message[@*=\"uml:Message\"][@messageSort=\"asynchSignal\"])";

    public PASM() {
    }

    public double measureMetric(Document document) {
        double count = 0;

        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();

        try {
            XPathExpression expression = xpath.compile(XPATH_QUERY);
            count = (Double) expression.evaluate(document, XPathConstants.NUMBER);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return count;

        //Para retornar so 0 ou 1 usar o seguinte:
        //return (count > 0.0) ? 1.0 : 0.0;
    }
}
