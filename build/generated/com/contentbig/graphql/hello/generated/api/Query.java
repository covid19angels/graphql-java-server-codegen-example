// generated with template javaClassGraphqlOperations.ftl

package com.contentbig.graphql.hello.generated.api;

import java.util.*;
import com.contentbig.graphql.hello.generated.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    Collection<HelloPayloadGQO> hello(String who, DataFetchingEnvironment env) throws Exception;
    Collection<WorldPayloadGQO> world(String who, DataFetchingEnvironment env) throws Exception;
}