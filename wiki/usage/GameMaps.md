# Game Maps

## BedWars

### Locations

- `0`: spectator spawn (facing_middle)

For each team i:

- `i * 10`: spawn (middle_facing)
- `i * 10 + 2`: bronze item spawner (middle)
- `i * 10 + 3`: silver item spawner (middle)
- `i * 10 + 4`: gold item spawner (middle)
- `i * 10 + 5`: block villager position (middle_facing)
- `i * 10 + 6`: weapon villager position (middle_facing)
- `i * 10 + 7`: special villager position (middle_facing)

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
- `1`: start, on game start (middle_facing)
- `2`: spawn, before game start (middle_facing)

BlockJump:

- `3`: goal height (block)

BoatRace:

- `3`: goal (block)

BuildOver:

- `3`: goal (block)
- `10` to `99`: map boundaries, polygon (block)

ColorSwap/ColorPunch:

- `3`: first map corner, inclusive (block)
- `4`: second map corner, inclusive (block)

Dropper:

- `3`: goal height (block)

Firefighter:

- `3`: first map corner, inclusive (block)
- `4`: second map corner, inclusive (block)

HotFeet:

- `3`: first map corner, inclusive (block)
- `4`: second map corner, inclusive (block)

LadderKing:

- `3`: goal block (block)
- `4`+: spawns (middle_facing)

OreMiner:

- `3`: first map corner, inclusive (block)
- `4`: second map corner, inclusive (block)

Parkour:

- `3`: goal (block)

RiseUp:

- `3`: goal (block)

SandStorm:

- `3`: first map corner, inclusive (block)
- `4`: second map corner, inclusive (block)

Sheep:

- `3`: first map corner, inclusive (block)
- `4`: second map corner, inclusive (block)

SlimySlime:

- `3`: main slime spawn (middle)
- `4`+: slime spawns (middle)

Spleef:

- `3`: death height (block)

TntRun:

- `3`: death height (block)

HotPotato, KnockOut:

- only default

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