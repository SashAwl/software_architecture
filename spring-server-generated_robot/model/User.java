package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-22T15:17:22.021Z[GMT]")


public class User   {
  @JsonProperty("ID_user")
  private Integer idUser = null;

  @JsonProperty("Name_user")
  private String nameUser = null;

  @JsonProperty("Hash_authorization")
  private String hashAuthorization = null;

  @JsonProperty("Control_data")
  private String controlData = null;

  public User idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * Get idUser
   * @return idUser
   **/
  @Schema(example = "382292", required = true, description = "")
      @NotNull

    public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public User nameUser(String nameUser) {
    this.nameUser = nameUser;
    return this;
  }

  /**
   * Имя пользователя
   * @return nameUser
   **/
  @Schema(example = "Федор", required = true, description = "Имя пользователя")
      @NotNull

    public String getNameUser() {
    return nameUser;
  }

  public void setNameUser(String nameUser) {
    this.nameUser = nameUser;
  }

  public User hashAuthorization(String hashAuthorization) {
    this.hashAuthorization = hashAuthorization;
    return this;
  }

  /**
   * Сгенерированный хеш
   * @return hashAuthorization
   **/
  @Schema(example = "n3nnjrs8394uhwn93jkjsdi3", required = true, description = "Сгенерированный хеш")
      @NotNull

    public String getHashAuthorization() {
    return hashAuthorization;
  }

  public void setHashAuthorization(String hashAuthorization) {
    this.hashAuthorization = hashAuthorization;
  }

  public User controlData(String controlData) {
    this.controlData = controlData;
    return this;
  }

  /**
   * Данные для восстановления пароля
   * @return controlData
   **/
  @Schema(example = "6.1.2", required = true, description = "Данные для восстановления пароля")
      @NotNull

    public String getControlData() {
    return controlData;
  }

  public void setControlData(String controlData) {
    this.controlData = controlData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.idUser, user.idUser) &&
        Objects.equals(this.nameUser, user.nameUser) &&
        Objects.equals(this.hashAuthorization, user.hashAuthorization) &&
        Objects.equals(this.controlData, user.controlData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, nameUser, hashAuthorization, controlData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    nameUser: ").append(toIndentedString(nameUser)).append("\n");
    sb.append("    hashAuthorization: ").append(toIndentedString(hashAuthorization)).append("\n");
    sb.append("    controlData: ").append(toIndentedString(controlData)).append("\n");
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
