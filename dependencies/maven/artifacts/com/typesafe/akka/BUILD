java_library(
    name = "akka-actor-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-actor-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/typesafe:config",
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-java8-compat-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "akka-actor-typed-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-actor-typed-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        "//dependencies/maven/artifacts/org/slf4j:slf4j-api",
        ":akka-actor-2-12",
        ":akka-slf4j-2-12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "akka-http-core-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-http-core-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":akka-parsing-2-12"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "akka-parsing-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-parsing-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "akka-protobuf-v3-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-protobuf-v3-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/google/protobuf:protobuf-java"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "akka-serialization-jackson-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-serialization-jackson-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-annotations",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-core",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-databind",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/dataformat:jackson-dataformat-cbor",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/datatype:jackson-datatype-jdk8",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/datatype:jackson-datatype-jsr310",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/module:jackson-module-parameter-names",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/module:jackson-module-scala-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":akka-actor-2-12"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "akka-slf4j-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-slf4j-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        "//dependencies/maven/artifacts/org/slf4j:slf4j-api",
        ":akka-actor-2-12"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "akka-stream-2-12",
    exports = [
        "//external:jar/com/typesafe/akka/akka-stream-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/com/typesafe:ssl-config-core-2-12",
        "//dependencies/maven/artifacts/org/reactivestreams:reactive-streams",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":akka-actor-2-12",
        ":akka-protobuf-v3-2-12"
    ],
    visibility = [
        "//visibility:public"
    ]
)


