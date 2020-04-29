java_library(
    name = "netty-reactive-streams",
    exports = [
        "//external:jar/com/typesafe/netty/netty-reactive-streams"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/io/netty:netty-handler",
        "//dependencies/maven/artifacts/org/reactivestreams:reactive-streams"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "netty-reactive-streams-http",
    exports = [
        "//external:jar/com/typesafe/netty/netty-reactive-streams-http"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/io/netty:netty-codec-http",
        ":netty-reactive-streams"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)


