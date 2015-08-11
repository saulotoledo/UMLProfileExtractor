package br.edu.ufcg.reuml.diagram;

import br.edu.ufcg.reuml.profile.SequenceDiagramProfile;

import javax.persistence.Entity;

/**
 * Created by gustavo on 23/04/15.
 */
@Entity
public class SequenceDiagram extends UMLDiagram {

    public SequenceDiagram() {
        super();
    }

    public SequenceDiagram(String name, SequenceDiagramProfile profile) {
        super(name, profile);
    }
}