package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-22T15:17:22.021Z[GMT]")


public class Error   {
  @JsonProperty("code_error")
  private Integer codeError = null;

  @JsonProperty("message_error")
  private String messageError = null;

  public Error codeError(Integer codeError) {
    this.codeError = codeError;
    return this;
  }

  /**
   * Get codeError
   * @return codeError
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getCodeError() {
    return codeError;
  }

  public void setCodeError(Integer codeError) {
    this.codeError = codeError;
  }

  public Error messageError(String messageError) {
    this.messageError = messageError;
    return this;
  }

  /**
   * Get messageError
   * @return messageError
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMessageError() {
    return messageError;
  }

  public void setMessageError(String messageError) {
    this.messageError = messageError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.codeError, error.codeError) &&
        Objects.equals(this.messageError, error.messageError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeError, messageError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    codeError: ").append(toIndentedString(codeError)).append("\n");
    sb.append("    messageError: ").append(toIndentedString(messageError)).append("\n");
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
