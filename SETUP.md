# Setup

## Workspace

### Requirements

- Java 17+
- Maven 2
- Gradle 8+

### Installation

1. Set up an ssh-key
2. Run `git clone git@git.timsnake.de:timesnake/plugin-root-project.git`
3. Run the `./setup/init.sh` script

## Test-Server

### Docker Image

Load the image from file. The file can be requested from @funzter or _admin@mail.timesnake.de_.

```
docker load --input timesnake-latest.tar
```

Create docker container by running this command:

```
docker run -d \
   --name timesnake \
   -e MYSQL_ROOT_PASSWORD=<password> \
   -v "<local_plugin_folder>:/timesnake/plugins" \
   -p 25565:25565 \
   timesnake:latest
```

**Hint:** Replace `<password>` with a database password and `<local_plugin_folder>` with your
local plugin folder.

Log in into the container:

```
docker exec -it timesnake bash
```

### Initialize

Run `./scripts/init.sh` to finish the server setup. During this you can optionally upload default
database values (highly recommended).

### Start

Run `start-server` or `/timesnake/servers/000_proxy/tmux-start.sh`.
Later you can log in into the tmux session with `login-server`.

### Structure

- `config/` contains all global config files
- `logs/` contains log files from all servers
- `scripts/` contains all scripts as for startup or database recovery
- `servers/` contains all running servers
- `templates/` contains all server, world and player templates

**IMPORTANT: Do not edit any files within the servers and templates directory, this can result into
strange behaviour.**