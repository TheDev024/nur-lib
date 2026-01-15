package com.andersenlab.nurlib.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookRequestDto {

    private String title;

    @JsonProperty("ISBN")
    private String isbn;

    private String language;

    private Integer editionNo;

    private String description;

    private String publisher;

    private Integer year;

    private String[] authors;
}
