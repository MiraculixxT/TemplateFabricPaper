pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "TemplatePaperFabric"

include(":core")
include(":paper")
include(":fabric")
