// generated with template javaClassGraphqlOperations.ftl

package io.github.kobylynskyi.bikeshop.graphql.api;

import java.util.*;
import io.github.kobylynskyi.bikeshop.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    Collection<BikeTO> bikes(Integer first, Integer offset, DataFetchingEnvironment env) throws Exception;
    Collection<BikeTO> bikesByType(BikeTypeTO type, DataFetchingEnvironment env) throws Exception;
}