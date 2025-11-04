package org.example.springbootsbomcrawler.config;

import lombok.Data;
import lombok.NonNull;

@Data
public class ConfigurationEntry {

    @NonNull
    String id;
    @NonNull
    String endpoint;
    @NonNull
    String projectName;
    @NonNull
    String projectVersion;
    @NonNull
    String projectId;

}
