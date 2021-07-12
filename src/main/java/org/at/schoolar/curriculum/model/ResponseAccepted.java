package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Data
@AllArgsConstructor
@Builder
public class ResponseAccepted {
    private UUID resourceId;
    private String id;
}
