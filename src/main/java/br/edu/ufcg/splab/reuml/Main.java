package br.edu.ufcg.splab.reuml;

import java.io.File;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import br.edu.ufcg.splab.reuml.profile.UMLProfile;
import br.edu.ufcg.splab.reuml.service.UMLProfileService;

/**
 * Main to do simple tests.
 */
public class Main {
    public static void main(String[] args) {
        Option filePathOption = Option.builder("diagram").argName("path")
                .hasArg().desc("the path for the diagram file")
                .required().build();

        Option diagramTypeOption = Option.builder("diagType").argName("value")
                .hasArg().desc("the type of the desired diagram ('class' or 'sequence')")
                .required().build();
        
        UMLProfileService service = new UMLProfileService(
            "br.edu.ufcg.splab.reuml.feature"
        );
        
        Options options = new Options();

        options.addOption(filePathOption);
        options.addOption(diagramTypeOption);

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("diagram")) {
            	if (!(new File(cmd.getOptionValue("diagram")).exists())) {
                    System.out
                            .println("Please inform a valid diagram file name.");
                    System.exit(1);
                }
            	
            	if (!cmd.getOptionValue("diagType").equals("class")
                        && !cmd.getOptionValue("diagType").equals("sequence")) {
                    System.out
                            .println("Please inform a valid diagram type (class or sequence).");
                    System.exit(1);
                }
            	
            	String filePath = cmd.getOptionValue("diagram");
            	UMLProfile profile;
            	if (cmd.getOptionValue("diagType").equals("class")) {
            		profile = service.getClassDiagramProfile(filePath);
            	} else {
            		profile = service.getSequenceDiagramProfile(filePath);
            	}
            	
            	System.out.println(profile.toString());
            }

        } catch (MissingOptionException e) {
            System.out.println("Missing options.");
            usage(options);
        } catch (UnrecognizedOptionException e) {
            System.out.println("Invalid option: " + e.getOption());
            usage(options);
        } catch (ParseException e) {
        	e.printStackTrace();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

    private static void usage(Options options) {
        String header = "";
        String footer = "";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar <this-filename.jar>", header, options,
                footer, true);
    }
}
