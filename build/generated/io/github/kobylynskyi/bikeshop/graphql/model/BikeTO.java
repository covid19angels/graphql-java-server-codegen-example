// generated with template javaClassGraphqlType.ftl

package io.github.kobylynskyi.bikeshop.graphql.model;

import io.github.kobylynskyi.bikeshop.graphql.api.*;
import java.util.*;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class BikeTO {

    private Integer year;
    private BikeTO newBike;
    private BikeTypeTO type;
    private String brand;
    private String size;
    private java.util.Date addedDateTime;
    private String id;
    private String price;

}