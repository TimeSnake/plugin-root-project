# Setup

## Workspace

### Requirements

- Java 17+
- Maven 2
- Gradle

### Installation

1. Set up an ssh-key
2. Run `git clone git@git.timsnake.de:timesnake/plugin-root-project.git`
3. Change to `plugin-root-project/setup/`
4. Run the `./init.sh` script

## Test-Server

### Requirements

- Java 17+
- Mysql-Server (see below)
- tmux
- curl, sed (only for installation)

### Installation

*in progress, contact @funzter for help*

### Running

1. Change to the proxy server directory `network/servers/000_proxy`.
2. Run `./start.sh tmux` (recommended) or `./start.sh`.

### MySQL/MariaDB Database Server

1. Setup a database mysql or mariadb server
2. Import the datasets into the database with the recovery script.
    - Copy the `.sql` files to `database/recovery`
    - Run the recovery script: `database/recovery.sh`
