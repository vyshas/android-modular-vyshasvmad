/*
 * Copyright 2021 vyshas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import extensions.applyDefault

plugins.apply(BuildPlugins.GIT_HOOKS)
plugins.apply(BuildPlugins.UPDATE_DEPENDENCIES)

plugins {
    id("org.sonarqube").version("3.1.1")
}

allprojects {
    repositories.applyDefault()
    plugins.apply(BuildPlugins.DETEKT)
    plugins.apply(BuildPlugins.DOKKA)
    plugins.apply(BuildPlugins.KTLINT)
    plugins.apply(BuildPlugins.SPOTLESS)

    apply(plugin = "org.sonarqube")
    sonarqube {
        properties {
            property("sonar.projectKey", "vyshas_android-modular-vyshasvmad")
            property("sonar.organization", "vyshas")
            property("sonar.host.url", "https://sonarcloud.io")
            property("sonar.lang.patterns.kotlin", "**/*.kt,**/*.json,**/*.java")
            property("detekt.sonar.kotlin.config.path", "${rootProject.projectDir}/detekt.yml")
        }
    }
}
