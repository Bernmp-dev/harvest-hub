package com.harvesthub.controllers.annotations.farm;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Annotation for Swagger documentation. */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@RestController
@RequestMapping(value = "/farms")
@Tag(
  name = "Farms️",
  description = "Farms management APIs"
)
@ApiResponses(
  value = {
    @ApiResponse(
      responseCode = "400",
      description = "Bad Request",
      content = @Content
      ),
    @ApiResponse(
      responseCode = "404",
      description = "Not found",
      content = @Content
      )})
public @interface FarmControllerConfig {}
