package br.edu.ufcg.splab.reuml.feature.classprofile;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import br.edu.ufcg.splab.reuml.feature.Measurable;

public class PAO implements Measurable {

    public static final String NAME = "Presence of Abstract Operation";
    private static final String XPATH_QUERY =
            "count(" +
        		"//packagedElement[@*=\"uml:Class\"]/ownedOperation[@isAbstract=\"true\"] | " +
        		"//packagedElement[@*=\"uml:Interface\"]/ownedOperation[@isAbstract=\"true\"] | " +
        		"//*[local-name()='Operation'][@isAbstract=\"true\"]" +
            ")";

    public PAO() {
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
