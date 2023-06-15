import org.jetbrains.dokka.gradle.DokkaMultiModuleTask

group = libs.versions.project.group.get()
version = libs.versions.project.version.string.get()

plugins {
    id("org.jetbrains.dokka")
}

tasks.withType<DokkaMultiModuleTask> {
    val paths = listOf("README.md", "dokka.md")
        .map(project::file)
        .filter(File::exists)
        .map(File::getName)

    includes.from(paths)
    moduleName.set("${libs.versions.project.name.get()}")
}
