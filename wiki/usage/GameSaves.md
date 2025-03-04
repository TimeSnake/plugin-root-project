# Game Saves

Game saves can only be created for non-tmp games.

## Create a New Save

A new save, creates a new starting point of the game. It does not create a server.

### Public

Create a public save, which is accessible by everyone.

```
/network create_public_server <game_name> <save_name>
```

The `save_name` must be unique and is not case-sensitive.

### Private

Create a private save, which is only accessible by yourself and its members.

```
/network create_private_save <game_name> <save_name> <owner_name>
```

The `save_name` must be unique for the owner and is not case-sensitive.
The `owner_name` must be a name of a player, which was on the server once.