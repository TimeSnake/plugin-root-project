## Setup

### Workspace and Test-Server

**Requirements**

- [ ] Java 17 or 18
- [ ] Maven 2
- [ ] Gradle
- [ ] Mysql Database Server
- [ ] Command-Line: curl, sed, tmux (optional)

**Installation**

1. Open a terminal in the project directory.
2. Run `curl -s https://dev.timesnake.de/server/setup.sh -O setup.sh && bash setup.sh`.
3. Download the templates folder to the `network` directory.
4. Upload the database files by putting them into the `network/script/database` folder.
   Run the `database_recovery.sh` script.

**Server-Start**

1. Change to the proxy server directory `network/servers/000_proxy`.
2. Run `./start.sh tmux` (recommended) or `./start.sh`.

### MySQL Database Server

1. Setup database mysql-server (`apt install mysql-server`)
2. Import the datasets into the database with the recovery script.
    - Copy the `.sql` files to `database/recovery` (don't copy the mysql and phpmyadmin files)
    - Store your mysql password with
      `mysql_config_editor set --login-path=local --host=localhost --user=root --password`
    - Run the recovery script: `database/recovery.sh`

## License

- The source is licensed under the GNU GPLv2 license that can be found in the [LICENSE](LICENSE) file.
