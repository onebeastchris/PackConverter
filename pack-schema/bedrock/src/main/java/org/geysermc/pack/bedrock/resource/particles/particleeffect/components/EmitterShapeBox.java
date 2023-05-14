package org.geysermc.pack.bedrock.resource.particles.particleeffect.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Emitter Shape Box Component For 1.10.0
 */
public class EmitterShapeBox {
  public String direction;

  public String radius;

  public String[] offset;

  @JsonProperty("half_dimensions")
  public String[] halfDimensions;

  @JsonProperty("surface_only")
  public boolean surfaceOnly;

  public String direction() {
    return this.direction;
  }

  public void direction(String direction) {
    this.direction = direction;
  }

  public String radius() {
    return this.radius;
  }

  public void radius(String radius) {
    this.radius = radius;
  }

  /**
   * @return Offset
   */
  public String[] offset() {
    return this.offset;
  }

  /**
   * @param offset Offset
   */
  public void offset(String[] offset) {
    this.offset = offset;
  }

  /**
   * @return Half Dimensions
   */
  public String[] halfDimensions() {
    return this.halfDimensions;
  }

  /**
   * @param halfDimensions Half Dimensions
   */
  public void halfDimensions(String[] halfDimensions) {
    this.halfDimensions = halfDimensions;
  }

  /**
   * @return Surface Only
   */
  public boolean surfaceOnly() {
    return this.surfaceOnly;
  }

  /**
   * @param surfaceOnly Surface Only
   */
  public void surfaceOnly(boolean surfaceOnly) {
    this.surfaceOnly = surfaceOnly;
  }
}
