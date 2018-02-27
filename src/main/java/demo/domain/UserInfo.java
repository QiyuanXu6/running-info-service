package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
//for final variables
//@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfo {

    private String username;
    private String address;


    public UserInfo(
            @JsonProperty("username") String username,
            @JsonProperty("address") String address
    ) {
        this.address = address;
        this.username = username;
    }


}
