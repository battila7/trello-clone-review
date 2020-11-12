package io.molnarsandor.pmtool.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.molnarsandor.pmtool.domain.entity.Collaborator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Data
@ApiModel
public class ProjectDTO {

    @NotBlank(message = "Project name is required")
    @Size(min = 5,max = 30, message = "Please use 5 to 30 characters")
    @Pattern(regexp = "^([A-Z0-9a-záéúőóüö.]+\\s?){2,}$", message = "Special characters not allowed!")
    @ApiModelProperty(value = "The Project name", required = true)
    private String projectName;
    @NotBlank(message = "Project Identifier is required")
    @Size(min = 4, max = 30, message = "Please use 4 to 30 characters")
    @Pattern(regexp = "^([A-Z0-9a-záéúőóüö.]+\\s?){2,}$", message = "Special characters not allowed!")
    @ApiModelProperty(value = "The Project Identifier", required = true, position = 1)
    private String projectIdentifier;
    @NotBlank(message = "Project description is required")
    @Size(min = 5, max = 200, message = "Please use 5 to 200 characters")
    @Pattern(regexp = "^([A-Z0-9a-záéúőóüö.]+\\s?){2,}$", message = "Special characters not allowed!")
    @ApiModelProperty(value = "Project description", required = true, position = 2)
    private String description;
    @JsonFormat(pattern = "yyyy-mm-dd")
    @ApiModelProperty(value = "The Date when the Project starts", position = 3)
    private Date startDate;
    @JsonFormat(pattern = "yyyy-mm-dd")
    @ApiModelProperty(value = "The Date when the Project finishes", position = 4)
    private Date endDate;
    @ApiModelProperty(value = "The User email who created/owns the Project", position = 5)
    private String projectLeader;
    @ApiModelProperty(value = "Invited users to collaborate with the Project (Collaborators)", position = 6)
    private Set<Collaborator> collaborators;
}
