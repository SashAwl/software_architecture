/*
 * Приложение для робота-пылесоса
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * User
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-12-22T15:17:37.018Z[GMT]")
public class User {
  @SerializedName("ID_user")
  private Integer idUser = null;

  @SerializedName("Name_user")
  private String nameUser = null;

  @SerializedName("Hash_authorization")
  private String hashAuthorization = null;

  @SerializedName("Control_data")
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
