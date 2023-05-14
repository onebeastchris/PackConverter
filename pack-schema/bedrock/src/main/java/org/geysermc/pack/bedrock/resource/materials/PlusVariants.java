package org.geysermc.pack.bedrock.resource.materials;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.geysermc.pack.bedrock.resource.materials.plusvariants.VertexFields;

/**
 * Variant Item
 */
public class PlusVariants {
  @JsonProperty("+defines")
  public String[] plusDefines;

  public List<VertexFields> vertexFields = new ArrayList<>();

  public String[] states;

  @JsonProperty("+states")
  public String[] plusStates;

  @JsonProperty("-states")
  public String[] minusStates;

  /**
   * @return Defines
   */
  public String[] plusDefines() {
    return this.plusDefines;
  }

  /**
   * @param plusDefines Defines
   */
  public void plusDefines(String[] plusDefines) {
    this.plusDefines = plusDefines;
  }

  /**
   * @return Vertex Fields
   */
  public List<VertexFields> vertexFields() {
    return this.vertexFields;
  }

  /**
   * @param vertexFields Vertex Fields
   */
  public void vertexFields(List<VertexFields> vertexFields) {
    this.vertexFields = vertexFields;
  }

  /**
   * @return States
   */
  public String[] states() {
    return this.states;
  }

  /**
   * @param states States
   */
  public void states(String[] states) {
    this.states = states;
  }

  /**
   * @return States
   */
  public String[] plusStates() {
    return this.plusStates;
  }

  /**
   * @param plusStates States
   */
  public void plusStates(String[] plusStates) {
    this.plusStates = plusStates;
  }

  /**
   * @return States
   */
  public String[] minusStates() {
    return this.minusStates;
  }

  /**
   * @param minusStates States
   */
  public void minusStates(String[] minusStates) {
    this.minusStates = minusStates;
  }
}
