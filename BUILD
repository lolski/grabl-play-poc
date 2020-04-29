load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
load("@io_bazel_rules_play_routes//play-routes:play-routes.bzl", "play_routes")

play_routes(
  name = "route",
  srcs = ["routes"],
  include_play_imports = True,
  generate_reverse_router = False,
)

java_library(
  name = "event",
  srcs = glob(["event/**/*.java"]),
  deps = [
        "//dependencies/maven/artifacts/com/typesafe/play:play-2-12",
        "//dependencies/maven/artifacts/com/typesafe/play:play-java-2-12",
        "//dependencies/maven/artifacts/com/typesafe/play:play-server-2-12",
        "//dependencies/maven/artifacts/com/typesafe/play:twirl-api-2-12",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-databind",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-core"
  ]
)

scala_library(
  name = "grabl",
  srcs = [ ":route" ],
  deps = [
        ":event",
        "//dependencies/maven/artifacts/com/google/inject:guice",
        "//dependencies/maven/artifacts/com/typesafe/akka:akka-actor-typed-2-12",
        "//dependencies/maven/artifacts/com/typesafe/play:play-2-12",
        "//dependencies/maven/artifacts/com/typesafe/play:play-java-2-12",
        "//dependencies/maven/artifacts/com/typesafe/play:play-server-2-12",
        "//dependencies/maven/artifacts/com/typesafe/play:twirl-api-2-12",
        "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-databind",
        "//dependencies/maven/artifacts/javax/inject:javax-inject"
    ],
    resources = ["application.conf"],
)

java_binary(
    name = "grabl-bin",
    main_class = "play.core.server.ProdServerStart",
    runtime_deps = [":grabl"],
)

java_binary(
    name = "bazel-deps",
    main_class = "com.github.johnynek.bazel_deps.ParseProject",
    visibility = ["//visibility:public"],
    runtime_deps = ["@bazel_deps//jar:jar"],
)