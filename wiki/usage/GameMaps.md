# Game Maps

## BedWars

### Locations

- `0`: spectator spawn (facing_middle)

For each team `i`:

- `i * 10 + 0`: spawn (middle_facing)
- `i * 10 + 1`: block villager position (middle_facing)
- `i * 10 + 2`: weapon villager position (middle_facing)
- `i * 10 + 3`: special villager position (middle_facing)

Item Spawner:

- `1000 + t * 10 + i`: bronze spawner `i`, with `2 s * t` spawn delay (middle)
- `2000 + t * 10 + i`: silver spawner `i`, with `2 s * t` spawn delay (middle)
- `3000 + t * 10 + i`: gold spawner `i`, with `2 s * t` spawn delay (middle)

## BowRun

### Locations

- `0` runner finish (block)
- `1` archer spawn (middle_facing)
- `2` to `99` runner spawns (middle_facing)
- `100` relay pickup location (block)

## BridgeBuilders

### Locations

- `0`: spectator spawn (facing_middle)
- `1`: death height (block)
- `50 to 99`: map boundaries, polygon (block)
- `1000`+: special item spawner (middle)

For each team i:

- `i * 100 + 1`: spawn (middle_facing)
- `i * 100 + 2`: goal (block)
- `i * 100 + 50` to `i * 100 + 99`: home boundaries, polygon (block)

## Graffiti

### Locations

- `0`: spectator spawn (facing_middle)
- `10`: blue spawn (facing_middle)
- `20`: red spawn (facing_middle)
- `100` to `119`: item spawner (middle)

## MicroGames

### Locations

For all games:

- `0`: spectator spawn (middle_facing)
- `1`: spawn (middle_facing)

| Game           | 10 Goal    | 20-29 Spawns | 99 Death Height | 100-199 Arena | Other                                    |
|----------------|------------|--------------|-----------------|---------------|------------------------------------------|
| Block Jump     | x (height) |              |                 |               |                                          |
| Boat Race      | x          |              |                 |               |                                          |
| Build Over     | x          |              |                 | x             |                                          |
| Color Swap     |            |              | x               |               |                                          |
| Dropper        | x          |              |                 |               |                                          |
| Egg Hunter     |            |              |                 | x             |                                          |
| Firefighter    |            |              |                 | x             |                                          |
| Hot Feet       |            |              |                 | x             |                                          |
| Ladder King    | x          | x            |                 |               |                                          |
| Ore Miner      |            |              |                 | x             |                                          |
| Parkour        | x          |              |                 |               |                                          |
| Puddle Jumping |            | x            |                 | x             |                                          |
| Rise Up        | x          |              |                 |               |                                          |
| Sand Storm     |            |              |                 | x             |                                          |
| Sheeeep        |            |              |                 | x             |                                          |
| Slimy Slime    |            |              |                 |               | 10: mother slime<br/>11-19: slime spawns |
| Spleef         | x          |              |                 |               |                                          |
| Tnt Run        | x          |              |                 |               |                                          |
| Hot Potato     |            |              |                 |               |                                          |
| Knock Out      |            |              |                 |               |                                          |

## MobDefence

_coming soon_

## Push

### Locations

- `0`: zombie spawn (middle)
- `10` to `19`: blue spawns (middle_facing)
- `20` to `29`: red spawns (middle_facing)
- `100`+: item spawner (middle)

## SurvivalGames

### Locations

- `0`: spectator spawn (middle_facing)
- `1`+: spawns (middle_facing)

## TraitorInwolfed

### Locations

- `0`: spectator spawn (middle_facing)
- `1`: spawn, for game start (middle_facing)
- `100` to `199`: item/coin spawner (middle)
- `200` to `299`: teleport locations for ant-camping (middle_facing)

## TreasureIslands

### Locations

- `0`: spectator spawn (middle_facing)
- `10` to `99`: spawn (middle_facing)
- `100` to `199`: item spawner (middle)
- `1000` to `2000`: map boundaries, polygon (block) 