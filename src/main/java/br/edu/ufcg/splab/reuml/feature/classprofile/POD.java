package br.edu.ufcg.splab.reuml.feature.classprofile;

import br.edu.ufcg.splab.reuml.feature.Measurable;

import org.w3c.dom.Document;

import javax.xml.xpath.*;

/**
 * Created by gustavo on 22/04/15.
 */
public class POD implements Measurable {

    public static final String NAME = "Presence of Dependency";
    private static final String XPATH_QUERY =
            "count(" +
                "//packagedElement[@*=\"uml:Dependency\"] | " +
                "//packagedElement[@*=\"uml:Usage\"] | " +
                "//packagedElement[@*=\"uml:Abstraction\"] | " +
                "//packagedElement[@*=\"uml:InterfaceRealization\"] | " +
                "//packagedElement[@*=\"uml:ComponentRealization\"] | " +
                
                "//*[local-name()='Dependency'] | " +
                "//*[local-name()='Usage'] | " +
                "//*[local-name()='Abstraction'] | " +
                "//*[local-name()='Permission']" +
                
				// UML1 does not have interfaceRealization as a dependency,
				// we are adding it here for compatibility with our dependency
				// definition at experiment:
                "//*[local-name()='Dependency.supplier']/*[local-name()='Interface'] " +
            ")";

    public POD() {
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
