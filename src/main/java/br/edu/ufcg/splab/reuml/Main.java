package br.edu.ufcg.splab.reuml;

import br.edu.ufcg.splab.reuml.profile.UMLProfile;
import br.edu.ufcg.splab.reuml.service.UMLProfileService;

/**
 * Main to do simple tests.
 */
public class Main {
    public static void main(String[] args) {
        UMLProfileService service = new UMLProfileService(
            "br.edu.ufcg.splab.reuml.feature"
        );
        UMLProfile profile = service.getClassDiagramProfile("/home/saulo/TesteFerramenta/diagramas_classe/SimpleLibrary2.uml");
        System.out.println(profile.toString());
    }
}
