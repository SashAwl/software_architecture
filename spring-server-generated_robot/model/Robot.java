package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Robot
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-22T15:17:22.021Z[GMT]")


public class Robot   {
  @JsonProperty("ID_robot")
  private Integer idRobot = null;

  @JsonProperty("Name_machine")
  private String nameMachine = null;

  @JsonProperty("Model")
  private String model = null;

  @JsonProperty("Version")
  private Integer version = null;

  @JsonProperty("Capacity_battery")
  private Integer capacityBattery = null;

  @JsonProperty("IP-adress")
  private Integer ipAdress = null;

  @JsonProperty("User_id")
  private Integer userId = null;

  public Robot idRobot(Integer idRobot) {
    this.idRobot = idRobot;
    return this;
  }

  /**
   * Get idRobot
   * @return idRobot
   **/
  @Schema(example = "382292", required = true, description = "")
      @NotNull

    public Integer getIdRobot() {
    return idRobot;
  }

  public void setIdRobot(Integer idRobot) {
    this.idRobot = idRobot;
  }

  public Robot nameMachine(String nameMachine) {
    this.nameMachine = nameMachine;
    return this;
  }

  /**
   * Имя, присвоенное роботу
   * @return nameMachine
   **/
  @Schema(example = "Benedikt", required = true, description = "Имя, присвоенное роботу")
      @NotNull

    public String getNameMachine() {
    return nameMachine;
  }

  public void setNameMachine(String nameMachine) {
    this.nameMachine = nameMachine;
  }

  public Robot model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Название модели робота
   * @return model
   **/
  @Schema(example = "Garlyn", required = true, description = "Название модели робота")
      @NotNull

    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Robot version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Версия ПО
   * @return version
   **/
  @Schema(required = true, description = "Версия ПО")
      @NotNull

    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Robot capacityBattery(Integer capacityBattery) {
    this.capacityBattery = capacityBattery;
    return this;
  }

  /**
   * Емкость батареи
   * @return capacityBattery
   **/
  @Schema(example = "1900", required = true, description = "Емкость батареи")
      @NotNull

    public Integer getCapacityBattery() {
    return capacityBattery;
  }

  public void setCapacityBattery(Integer capacityBattery) {
    this.capacityBattery = capacityBattery;
  }

  public Robot ipAdress(Integer ipAdress) {
    this.ipAdress = ipAdress;
    return this;
  }

  /**
   * Get ipAdress
   * @return ipAdress
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getIpAdress() {
    return ipAdress;
  }

  public void setIpAdress(Integer ipAdress) {
    this.ipAdress = ipAdress;
  }

  public Robot userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(example = "382292", required = true, description = "")
      @NotNull

    public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Robot robot = (Robot) o;
    return Objects.equals(this.idRobot, robot.idRobot) &&
        Objects.equals(this.nameMachine, robot.nameMachine) &&
        Objects.equals(this.model, robot.model) &&
        Objects.equals(this.version, robot.version) &&
        Objects.equals(this.capacityBattery, robot.capacityBattery) &&
        Objects.equals(this.ipAdress, robot.ipAdress) &&
        Objects.equals(this.userId, robot.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRobot, nameMachine, model, version, capacityBattery, ipAdress, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Robot {\n");
    
    sb.append("    idRobot: ").append(toIndentedString(idRobot)).append("\n");
    sb.append("    nameMachine: ").append(toIndentedString(nameMachine)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    capacityBattery: ").append(toIndentedString(capacityBattery)).append("\n");
    sb.append("    ipAdress: ").append(toIndentedString(ipAdress)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
