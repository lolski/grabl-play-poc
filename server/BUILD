load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
load("@io_bazel_rules_play_routes//play-routes:play-routes.bzl", "play_routes")

play_routes(
  name = "routes-def",
  srcs = ["routes"],
  include_play_imports = True,
  generate_reverse_router = False,
)

scala_library(
  name = "routes-lib",
  srcs = [ ":routes-def" ],
  deps = [
      "//event/github:router",
      "//service:router",
      "//dependencies/maven/artifacts/com/typesafe/akka:akka-actor-typed-2-12",
      "//dependencies/maven/artifacts/com/typesafe/play:play-2-12",
      "//dependencies/maven/artifacts/com/typesafe/play:play-guice-2-12",
      "//dependencies/maven/artifacts/com/typesafe/play:play-java-2-12",
      "//dependencies/maven/artifacts/com/typesafe/play:play-server-2-12",
      "//dependencies/maven/artifacts/com/typesafe/play:twirl-api-2-12",
      "//dependencies/maven/artifacts/com/fasterxml/jackson/core:jackson-databind",
      "//dependencies/maven/artifacts/javax/inject:javax-inject"
    ],
)

java_library(
    name = "server-lib",
    srcs = [
        "Server.java",
    ],
    deps = [
      ":routes-lib",
      "//event/github:router",
      "//dependencies/maven/artifacts/com/typesafe/play:filters-helpers-2-12",
      "//dependencies/maven/artifacts/com/typesafe/play:play-2-12",
    ],
    resources = ["application.conf"],
    resource_strip_prefix = "server",
    runtime_deps = [
      "//dependencies/maven/artifacts/com/google/inject:guice",
      "//dependencies/maven/artifacts/com/typesafe/play:play-akka-http-server-2-12",
    ],
)
java_binary(
    name = "server-bin",
    main_class = "play.core.server.ProdServerStart",
    runtime_deps = [":server-lib"]
)
