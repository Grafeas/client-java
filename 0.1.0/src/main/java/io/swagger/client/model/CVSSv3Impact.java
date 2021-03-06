/*
 * grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CVSSv3Impact
 */
@JsonAdapter(CVSSv3Impact.Adapter.class)
public enum CVSSv3Impact {
  
  UNSPECIFIED("IMPACT_UNSPECIFIED"),
  
  HIGH("IMPACT_HIGH"),
  
  LOW("IMPACT_LOW"),
  
  NONE("IMPACT_NONE");

  private String value;

  CVSSv3Impact(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CVSSv3Impact fromValue(String text) {
    for (CVSSv3Impact b : CVSSv3Impact.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CVSSv3Impact> {
    @Override
    public void write(final JsonWriter jsonWriter, final CVSSv3Impact enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CVSSv3Impact read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CVSSv3Impact.fromValue(String.valueOf(value));
    }
  }
}

