package fr.mmarie.api.gitlab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

    @JsonProperty("before")
    private String before;

    @JsonProperty("after")
    private String after;

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("user_email")
    private String userEmail;

    @JsonProperty("project_id")
    private Long projectId;

    @JsonProperty("repository")
    private Repository repository;

    @JsonProperty("commits")
    private List<Commit> commits;

    @JsonProperty("object_attributes")
    private Map<String, Object> objectAttributes;

    @JsonProperty("total_commits_count")
    private Long totalCommitsCount;
}
