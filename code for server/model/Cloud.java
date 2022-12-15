package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cloud
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-15T17:59:53.540Z[GMT]")


public class Cloud   {
  @JsonProperty("ID_cloud")
  private String idCloud = null;

  @JsonProperty("ID_client")
  private String idClient = null;

  /**
   * Операционная система сервера
   */
  public enum OSEnum {
    WINDOWS("Windows"),
    
    LINUX("Linux");

    private String value;

    OSEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OSEnum fromValue(String text) {
      for (OSEnum b : OSEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("OS")
  private OSEnum OS = null;

  @JsonProperty("RAM")
  private Integer RAM = null;

  @JsonProperty("ROM")
  private Integer ROM = null;

  @JsonProperty("CPU")
  private Integer CPU = null;

  public Cloud idCloud(String idCloud) {
    this.idCloud = idCloud;
    return this;
  }

  /**
   * Get idCloud
   * @return idCloud
   **/
  @Schema(example = "r382m292", required = true, description = "")
      @NotNull

    public String getIdCloud() {
    return idCloud;
  }

  public void setIdCloud(String idCloud) {
    this.idCloud = idCloud;
  }

  public Cloud idClient(String idClient) {
    this.idClient = idClient;
    return this;
  }

  /**
   * Get idClient
   * @return idClient
   **/
  @Schema(example = "j234l234", required = true, description = "")
      @NotNull

    public String getIdClient() {
    return idClient;
  }

  public void setIdClient(String idClient) {
    this.idClient = idClient;
  }

  public Cloud OS(OSEnum OS) {
    this.OS = OS;
    return this;
  }

  /**
   * Операционная система сервера
   * @return OS
   **/
  @Schema(required = true, description = "Операционная система сервера")
      @NotNull

    public OSEnum getOS() {
    return OS;
  }

  public void setOS(OSEnum OS) {
    this.OS = OS;
  }

  public Cloud RAM(Integer RAM) {
    this.RAM = RAM;
    return this;
  }

  /**
   * Оперативная память сервера
   * @return RAM
   **/
  @Schema(example = "64", required = true, description = "Оперативная память сервера")
      @NotNull

    public Integer getRAM() {
    return RAM;
  }

  public void setRAM(Integer RAM) {
    this.RAM = RAM;
  }

  public Cloud ROM(Integer ROM) {
    this.ROM = ROM;
    return this;
  }

  /**
   * Внутренняя память сервера
   * @return ROM
   **/
  @Schema(example = "1024", required = true, description = "Внутренняя память сервера")
      @NotNull

    public Integer getROM() {
    return ROM;
  }

  public void setROM(Integer ROM) {
    this.ROM = ROM;
  }

  public Cloud CPU(Integer CPU) {
    this.CPU = CPU;
    return this;
  }

  /**
   * Процессор сервера
   * @return CPU
   **/
  @Schema(example = "12497", description = "Процессор сервера")
  
    public Integer getCPU() {
    return CPU;
  }

  public void setCPU(Integer CPU) {
    this.CPU = CPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.idCloud, cloud.idCloud) &&
        Objects.equals(this.idClient, cloud.idClient) &&
        Objects.equals(this.OS, cloud.OS) &&
        Objects.equals(this.RAM, cloud.RAM) &&
        Objects.equals(this.ROM, cloud.ROM) &&
        Objects.equals(this.CPU, cloud.CPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCloud, idClient, OS, RAM, ROM, CPU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    idCloud: ").append(toIndentedString(idCloud)).append("\n");
    sb.append("    idClient: ").append(toIndentedString(idClient)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("    ROM: ").append(toIndentedString(ROM)).append("\n");
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
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
