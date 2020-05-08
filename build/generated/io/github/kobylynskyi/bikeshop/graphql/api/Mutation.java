// generated with template javaClassGraphqlOperations.ftl

package io.github.kobylynskyi.bikeshop.graphql.api;

import java.util.*;
import io.github.kobylynskyi.bikeshop.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Mutation {
// KK
    BikeTO newBike(BikeInputTO bike, DataFetchingEnvironment env) throws Exception;
}