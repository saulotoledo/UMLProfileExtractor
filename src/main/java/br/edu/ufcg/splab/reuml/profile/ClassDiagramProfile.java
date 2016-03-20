package br.edu.ufcg.splab.reuml.profile;

/**
 * Created by gustavo on 27/03/15.
 */
public class ClassDiagramProfile extends UMLProfile {

    private double PSA;

    private double PDA;

    private double PADV;

    private double PATPS;

    private double PSO;

    private double PRI;

    private double POG;

    private double POI;

    private double PAO;

    private double PASC;

    private double PABC;

    private double PTC;

    private double PEN;

    private double POD;

    private double POQ;

    private double POP;

    private double PNAA;

    private double PSHA;

    private double PCOA;

    private double PGS;

    private double PRMAT;

    public ClassDiagramProfile() {
        super();
    }

    public ClassDiagramProfile(double PSA, double PDA, double PADV, double PATPS, double PSO, double PRI, double POG, double POI, double PAO,
                               double PASC, double PABC, double PTC, double PEN, double POD, double POQ, double POP,
                               double PNAA, double PSHA, double PCOA, double PGS, double PRMAT) {
        super();
        this.PSA = PSA;
        this.PDA = PDA;
        this.PADV = PADV;
        this.PATPS = PATPS;
        this.PSO = PSO;
        this.PRI = PRI;

        this.POG = POG;
        this.POI = POI;
        this.PAO = PAO;

        this.PASC = PASC;
        this.PABC = PABC;
        this.PTC = PTC;
        this.PEN = PEN;
        this.POD = POD;
        this.POQ = POQ;
        this.POP = POP;
        this.PNAA = PNAA;
        this.PSHA = PSHA;
        this.PCOA = PCOA;
        this.PGS = PGS;
        this.PRMAT = PRMAT;
    }

    public double getPSA() {
        return this.PSA;
    }

    public void setPSA(double PSA) {
        this.PSA = PSA;
    }

    public double getPDA() {
        return this.PDA;
    }

    public void setPDA(double PDA) {
        this.PDA = PDA;
    }

    public double getPADV() {
        return this.PADV;
    }

    public void setPADV(double PADV) {
        this.PADV = PADV;
    }

    public double getPATPS() {
        return this.PATPS;
    }

    public void setPATPS(double PATPS) {
        this.PATPS = PATPS;
    }

    public double getPSO() {
        return this.PSO;
    }

    public void setPSO(double PSO) {
        this.PSO = PSO;
    }

    public double getPRI() {
        return this.PRI;
    }

    public void setPRI(double PRI) {
        this.PRI = PRI;
    }

    public double getPOG()
    {
        return this.POG;
    }

    public void setPOG(double POG)
    {
        this.POG = POG;
    }

    public double getPOI()
    {
        return this.POI;
    }

    public void setPOI(double POI)
    {
        this.POI = POI;
    }

    public double getPAO()
    {
        return this.PAO;
    }

    public void setPAO(double PAO)
    {
        this.PAO = PAO;
    }

    public double getPASC() {
        return this.PASC;
    }

    public void setPASC(double PASC) {
        this.PASC = PASC;
    }

    public double getPABC() {
        return this.PABC;
    }

    public void setPABC(double PABC) {
        this.PABC = PABC;
    }

    public double getPTC() {
        return this.PTC;
    }

    public void setPTC(double PTC) {
        this.PTC = PTC;
    }

    public double getPEN() {
        return this.PEN;
    }

    public void setPEN(double PEN) {
        this.PEN = PEN;
    }

    public double getPOD() {
        return this.POD;
    }

    public void setPOD(double POD) {
        this.POD = POD;
    }

    public double getPOQ() {
        return this.POQ;
    }

    public void setPOQ(double POQ) {
        this.POQ = POQ;
    }

    public double getPOP() {
        return this.POP;
    }

    public void setPOP(double POP) {
        this.POP = POP;
    }

    public double getPNAA() {
        return this.PNAA;
    }

    public void setPNAA(double PNAA) {
        this.PNAA = PNAA;
    }

    public double getPSHA() {
        return this.PSHA;
    }

    public void setPSHA(double PSHA) {
        this.PSHA = PSHA;
    }

    public double getPCOA() {
        return this.PCOA;
    }

    public void setPCOA(double PCOA) {
        this.PCOA = PCOA;
    }

    public double getPGS() {
        return this.PGS;
    }

    public void setPGS(double PGS) {
        this.PGS = PGS;
    }

    public double getPRMAT() {
        return this.PRMAT;
    }

    public void setPRMAT(double PRMAT) {
        this.PRMAT = PRMAT;
    }

    @Override
    public String toString() {
        return "ClassDiagramProfile{" +
                "PSA=" + this.PSA +
                ", PDA=" + this.PDA +
                ", PADV=" + this.PADV +
                ", PATPS=" + this.PATPS +
                ", PSO=" + this.PSO +
                ", PRI=" + this.PRI +
                ", POG=" + this.POG +
                ", POI=" + this.POI +
                ", PAO=" + this.PAO +
                ", PASC=" + this.PASC +
                ", PABC=" + this.PABC +
                ", PTC=" + this.PTC +
                ", PEN=" + this.PEN +
                ", POD=" + this.POD +
                ", POQ=" + this.POQ +
                ", POP=" + this.POP +
                ", PNAA=" + this.PNAA +
                ", PSHA=" + this.PSHA +
                ", PCOA=" + this.PCOA +
                ", PGS=" + this.PGS +
                ", PRMAT=" + this.PRMAT +
                "} ";
    }
}
