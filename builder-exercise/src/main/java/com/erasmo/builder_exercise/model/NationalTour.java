package com.erasmo.builder_exercise.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString(callSuper = true)
public class NationalTour {
    private String nazione;
}
