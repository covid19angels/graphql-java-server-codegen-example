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
public class BikeInputTO {

    @lombok.NonNull
    private BikeTypeTO type;
    @lombok.NonNull
    private String brand;
    @lombok.NonNull
    private String size;
    @lombok.NonNull
    private Integer year;
    private String price;

}