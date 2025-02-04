package com.smartonion.salt.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Document(collection = "profile")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile {

    @Id
    private String profileId;
    private String name;
    private FoodPreference foodPreference;
    private Allergies allergies;
    

}
