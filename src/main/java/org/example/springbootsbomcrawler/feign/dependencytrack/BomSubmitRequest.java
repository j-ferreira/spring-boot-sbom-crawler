package org.example.springbootsbomcrawler.feign.dependencytrack;

import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 * BomSubmitRequest repräsentiert eine Anfrage zum Einreichen eines BOM (Bill of Materials).
 * Die Felder und Validierungen basieren auf dem vorgegebenen Schema.
 */
@Builder
@Data
public class BomSubmitRequest {

    // Pflichtfelder
    private String bom; // Base64 encoded BOM
    private String project; // UUID
    private String projectName;
    private String projectVersion;

    // Optionale Felder
    private List<Tag> projectTags; // Tag-Klasse muss ggf. noch definiert werden
    private Boolean autoCreate;
    private String parentUUID;
    private String parentName;
    private String parentVersion;
    private Boolean isLatestProjectVersion;
}

