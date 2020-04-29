java_library(
    name = "config",
    exports = [
        "//external:jar/com/typesafe/config"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "ssl-config-core-2-12",
    exports = [
        "//external:jar/com/typesafe/ssl-config-core-2-12"
    ],
    runtime_deps = [
        "//dependencies/maven/artifacts/org/scala-lang/modules:scala-parser-combinators-2-12",
        "//dependencies/maven/artifacts/org/scala-lang:scala-library",
        ":config"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)


