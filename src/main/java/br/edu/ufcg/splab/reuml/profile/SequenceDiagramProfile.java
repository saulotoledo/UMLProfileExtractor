package br.edu.ufcg.splab.reuml.profile;

/**
 * Created by gustavo on 23/04/15.
 */
public class SequenceDiagramProfile extends UMLProfile {

	double PSM;
	
	double PACM;
	
	double PASM;

    double PRM;

    double PCM;

    double PDM;

    double PCoACF;
    
    double PCoOCF;

    double PItCF;

    double PBCF;

    double PCuCF;

    double PWCF;

    double PSCF;

    double PNCF;

    double PCrCF;

    double PIgCF;

    double PCsCF;

    double PACF;

    double PIU;

    double PAc;

    double PSI;

    public SequenceDiagramProfile() {
        super();
    }

    public SequenceDiagramProfile(double PSM, double PACM, double PASM, double PRM, double PCM, double PDM, double PCoACF,
    							  double PCoOCF, double PItCF, double PBCF, double PCuCF, double PWCF, double PSCF,
                                  double PNCF, double PCrCF, double PIgCF, double PCsCF, double PACF,
                                  double PIU, double PAc, double PSI) {
        super();
        this.PSM = PSM;
        this.PACM = PACM;
        this.PASM = PASM;
        this.PRM = PRM;
        this.PCM = PCM;
        this.PDM = PDM;
        this.PCoACF = PCoACF;
        this.PCoOCF = PCoOCF;
        this.PItCF = PItCF;
        this.PBCF = PBCF;
        this.PCuCF = PCuCF;
        this.PWCF = PWCF;
        this.PSCF = PSCF;
        this.PNCF = PNCF;
        this.PCrCF = PCrCF;
        this.PIgCF = PIgCF;
        this.PCsCF = PCsCF;
        this.PACF = PACF;
        this.PIU = PIU;
        this.PAc = PAc;
        this.PSI = PSI;
    }

    public double getPSM() {
        return this.PSM;
    }

    public void setPSM(double PSM) {
        this.PSM = PSM;
    }

    public double getPACM() {
        return this.PACM;
    }

    public void setPACM(double PACM) {
        this.PACM = PACM;
    }
    
    public double getPASM() {
        return this.PASM;
    }

    public void setPASM(double PASM) {
        this.PASM = PASM;
    }
    
    public double getPRM() {
        return this.PRM;
    }

    public void setPRM(double PRM) {
        this.PRM = PRM;
    }

    public double getPCM() {
        return this.PCM;
    }

    public void setPCM(double PCM) {
        this.PCM = PCM;
    }

    public double getPDM() {
        return this.PDM;
    }

    public void setPDM(double PDM) {
        this.PDM = PDM;
    }

    public double getPCoACF() {
        return this.PCoACF;
    }

    public void setPCoACF(double PCoACF) {
        this.PCoACF = PCoACF;
    }
    
    public double getPCoOCF() {
        return this.PCoOCF;
    }

    public void setPCoOCF(double PCoOCF) {
        this.PCoOCF = PCoOCF;
    }

    public double getPItCF() {
        return this.PItCF;
    }

    public void setPItCF(double PItCF) {
        this.PItCF = PItCF;
    }

    public double getPBCF() {
        return this.PBCF;
    }

    public void setPBCF(double PBCF) {
        this.PBCF = PBCF;
    }

    public double getPCuCF() {
        return this.PCuCF;
    }

    public void setPCuCF(double PCuCF) {
        this.PCuCF = PCuCF;
    }

    public double getPWCF() {
        return this.PWCF;
    }

    public void setPWCF(double PWCF) {
        this.PWCF = PWCF;
    }

    public double getPSCF() {
        return this.PSCF;
    }

    public void setPSCF(double PSCF) {
        this.PSCF = PSCF;
    }

    public double getPNCF() {
        return this.PNCF;
    }

    public void setPNCF(double PNCF) {
        this.PNCF = PNCF;
    }

    public double getPCrCF() {
        return this.PCrCF;
    }

    public void setPCrCF(double PCrCF) {
        this.PCrCF = PCrCF;
    }

    public double getPIgCF() {
        return this.PIgCF;
    }

    public void setPIgCF(double PIgCF) {
        this.PIgCF = PIgCF;
    }

    public double getPCsCF() {
        return this.PCsCF;
    }

    public void setPCsCF(double PCsCF) {
        this.PCsCF = PCsCF;
    }

    public double getPACF() {
        return this.PACF;
    }

    public void setPACF(double PACF) {
        this.PACF = PACF;
    }

    public double getPIU() {
        return this.PIU;
    }

    public void setPIU(double PIU) {
        this.PIU = PIU;
    }

    public double getPAc() {
        return this.PAc;
    }

    public void setPAc(double PAc) {
        this.PAc = PAc;
    }

    public double getPSI() {
        return this.PSI;
    }

    public void setPSI(double PSI) {
        this.PSI = PSI;
    }

    @Override
    public String toString() {
        return "SequenceDiagramProfile{" +
        		"PSM=" + this.PSM +
        		", PACM=" + this.PACM +
        		", PASM=" + this.PASM +
                ", PRM=" + this.PRM +
                ", PCM=" + this.PCM +
                ", PDM=" + this.PDM +
                ", PCoACF=" + this.PCoACF +
                ", PCoOCF=" + this.PCoOCF +
                ", PItCF=" + this.PItCF +
                ", PBCF=" + this.PBCF +
                ", PCuCF=" + this.PCuCF +
                ", PWCF=" + this.PWCF +
                ", PSCF=" + this.PSCF +
                ", PNCF=" + this.PNCF +
                ", PCrCF=" + this.PCrCF +
                ", PIgCF=" + this.PIgCF +
                ", PCsCF=" + this.PCsCF +
                ", PACF=" + this.PACF +
                ", PIU=" + this.PIU +
                ", PAc=" + this.PAc +
                ", PSI=" + this.PSI +
                '}';
    }
}
