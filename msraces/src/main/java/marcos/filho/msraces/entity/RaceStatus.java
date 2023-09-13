package marcos.filho.msraces.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import marcos.filho.msraces.exception.ApiRequestException;

public enum  RaceStatus {
        WAITING, STARTED, FINISHED;


        @JsonCreator
        public static RaceStatus fromString(String value) {
            try {
                return RaceStatus.valueOf(value.toUpperCase());
            } catch (IllegalArgumentException ex) {
                throw new ApiRequestException(
                        "Invalid Class Status: " + value + ". Please select: WAITING, STARTED, FINISHED");
            }
        }
}
