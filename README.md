# Minecraft Server Network

This project runs a minecraft server network including unique games.

---

## Setup for Developers

### Workspace

#### Requirements

- Java 21
- Gradle 8.+

#### Installation

1. Set up an ssh-key on our gitlab.
2. Run `git clone --recursive git@git.timesnake.de:timesnake/minecraft/plugin-project.git`.
3. Set up gradle variables in `~/.gradle/gradle.properties`:
    ```
   timesnakeUsername=<user>
   timesnakePassword=<access_token>

   timesnakePluginDir=<plugins_dir>
   ```
4. Run `gradle build` in the project directory.

### Test Setup

We provide a ready to use docker container. A setup guide can be found in the [test-server] project.
This is currently a private repository, for access please ask @funzter.

---

## Code Style

For java code, we use the Google java style guide, which can be found here:
https://google.github.io/styleguide/javaguide.html

## License

The source is licensed under the GNU GPLv2 license that can be found in the [LICENSE](LICENSE) file.

[test-server]: https://git.timesnake.de/timesnake/minecraft/test-server
