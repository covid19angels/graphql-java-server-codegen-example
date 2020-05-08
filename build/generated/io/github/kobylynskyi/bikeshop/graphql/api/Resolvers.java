// generated with template javaClassGraphqlResolvers.ftl
package io.github.kobylynskyi.bikeshop.graphql.api;

import java.util.*;
import io.github.kobylynskyi.bikeshop.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public class Resolvers{
    public interface Bike {
    // KK
        BikeTO newBike(BikeGQO parent,Integer first, Integer offset, DataFetchingEnvironment env) throws Exception;
    }
}