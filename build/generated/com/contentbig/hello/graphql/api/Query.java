// generated with template javaClassGraphqlOperations.ftl

package com.contentbig.hello.graphql.api;

import java.util.*;
import com.contentbig.hello.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    Collection<HelloPayloadGQO> hello(String who, DataFetchingEnvironment env) throws Exception;
}