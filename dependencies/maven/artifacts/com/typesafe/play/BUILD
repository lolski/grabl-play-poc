java_library(
    name = "build-link",
    exports = [
        "//external:jar/com/typesafe/play/build-link"
    ],
    runtime_deps = [
        ":play-exceptions"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "play-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-annotations",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-core",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-databind",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/datatype:jackson-datatype-jdk8",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/datatype:jackson-datatype-jsr310",
        "//dependencies/maven/artifacts/com/google/guava:guava",
        "//dependencies/maven/artifacts/com/typesafe/akka:akka-actor-2-12",
        "//dependencies/maven/artifacts/com/typesafe/akka:akka-actor-typed-2-12",
        "//dependencies/maven/artifacts/com/typesafe/akka:akka-serialization-jackson-2-12",
        "//dependencies/maven/artifacts/com/typesafe/akka:akka-slf4j-2-12",
        "//dependencies/maven/artifacts/com/typesafe:ssl-config-core-2-12",
        "//dependencies/maven/artifacts/io/jsonwebtoken:jjwt",
        "//dependencies/maven/artifacts/jakarta/transaction:jakarta-transaction-api",
        "//dependencies/maven/artifacts/jakarta/xml/bind:jakarta-xml-bind-api",
        "//dependencies/maven/artifacts/javax/inject:javax-inject",
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-java8-compat-2-12",
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-parser-combinators-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        "//dependencies/maven/artifacts/org/slf4j:jcl-over-slf4j",
        "//dependencies/maven/artifacts/org/slf4j:jul-to-slf4j",
        "//dependencies/maven/artifacts/org/slf4j:slf4j-api",
        ":build-link",
        ":play-json-2-12",
        ":play-streams-2-12",
        ":twirl-api-2-12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "play-exceptions",
    exports = [
        "//external:jar/com/typesafe/play/play-exceptions"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "play-functional-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-functional-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "play-java-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-java-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/net/jodah:typetools",
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-java8-compat-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":play-2-12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "play-json-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-json-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-annotations",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-core",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-databind",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/datatype:jackson-datatype-jdk8",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/datatype:jackson-datatype-jsr310",
        "//dependencies/maven/artifacts/joda-time:joda-time",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        "//dependencies/maven/artifacts/org/scala-lang:scala-reflect",
        ":play-functional-2-12"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "play-netty-server-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-netty-server-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/typesafe/netty:netty-reactive-streams-http",
        "//dependencies/maven/artifacts/io/netty:netty-transport-native-epoll-jar-linux-x86-64",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":play-server-2-12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "play-server-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-server-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":play-2-12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "play-streams-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-streams-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/typesafe/akka:akka-stream-2-12",
        "//dependencies/maven/artifacts/org/reactivestreams:reactive-streams",
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-java8-compat-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "play-ws-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-ws-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":play-2-12",
        ":play-ws-standalone-2-12",
        ":play-ws-standalone-json-2-12",
        ":play-ws-standalone-xml-2-12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "play-ws-standalone-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-ws-standalone-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/typesafe/akka:akka-stream-2-12",
        "//dependencies/maven/artifacts/com/typesafe:ssl-config-core-2-12",
        "//dependencies/maven/artifacts/javax/inject:javax-inject",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "play-ws-standalone-json-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-ws-standalone-json-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":play-json-2-12",
        ":play-ws-standalone-2-12"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "play-ws-standalone-xml-2-12",
    exports = [
        "//external:jar/com/typesafe/play/play-ws-standalone-xml-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-xml-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":play-ws-standalone-2-12"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "twirl-api-2-12",
    exports = [
        "//external:jar/com/typesafe/play/twirl-api-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-xml-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library"
    ],
    visibility = [
        "//visibility:public"
    ]
)


