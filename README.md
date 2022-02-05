# Obfuscated Forge Mod
Obfuscated Forge mod with mixins excluded to make it work using proguard.

## Changes needed after rename
 * Update the package name in [proguard-rules.pro](proguard-rules.pro) at line 4.
 * Update the mixins json file and the references in the build.gradle and in the manifest (also in build.gradle)

## Build obfuscated mod:
 * Run `gradle useProGuard`
 * Get the jar file in `build/libs/` without suffix.
