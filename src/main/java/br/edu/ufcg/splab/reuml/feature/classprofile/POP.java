package br.edu.ufcg.splab.reuml.feature.classprofile;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import br.edu.ufcg.splab.reuml.feature.Measurable;

public class POP implements Measurable {

    public static final String NAME = "Presence of Port";
    
    /* 
     * TODO: Check completeness of expression.  
     * A port is a new concept in UML 2.0. The following XPath expression is
     * enough to our current diagrams database. You should check if you need
     * some other expression for Ports in your database diagrams.
     */
    private static final String XPATH_QUERY = "count(//packagedElement[@*=\"uml:Class\"]/ownedAttribute[@*=\"uml:Port\"])";
    
    
    public POP() {
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
