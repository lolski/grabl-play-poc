java_library(
    name = "scala-library",
    exports = [
        "//external:jar/org/scala-lang/scala-library"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)



java_library(
    name = "scala-reflect",
    exports = [
        "//external:jar/org/scala-lang/scala-reflect"
    ],
    runtime_deps = [
        ":scala-library"
    ],
    visibility = [
        "//dependencies/maven/artifacts:__subpackages__"
    ]
)


