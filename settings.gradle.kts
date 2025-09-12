pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

// basic library modules
include(":library-chat")
include(":library-basic")
include(":library-commands")
include(":library-permissions")
include(":library-network")
include(":library-game")

project(":library-chat").projectDir = File("libraries/library-chat")
project(":library-basic").projectDir = File("libraries/library-basic")
project(":library-commands").projectDir = File("libraries/library-commands")
project(":library-permissions").projectDir = File("libraries/library-permissions")
project(":library-network").projectDir = File("libraries/library-network")
project(":library-game").projectDir = File("libraries/library-game")

// paper library modules
include(":library-packets")
include(":library-entities")

project(":library-packets").projectDir = File("libraries-mc/library-packets")
project(":library-entities").projectDir = File("libraries-mc/library-entities")

include(":library-waitinggame")
include(":library-plot")
include(":library-shop")
include(":library-pets")

project(":library-waitinggame").projectDir = File("libraries-mc/library-waitinggame")
project(":library-plot").projectDir = File("libraries-mc/library-plot")
project(":library-shop").projectDir = File("libraries-mc/library-shop")
project(":library-pets").projectDir = File("libraries-mc/library-pets")

// channel modules
include(":channel-api")
include(":channel-bukkit")
include(":channel-proxy")

project(":channel-api").projectDir = File("channel/channel-api")
project(":channel-bukkit").projectDir = File("channel/channel-bukkit")
project(":channel-proxy").projectDir = File("channel/channel-proxy")

// database modules
include(":database-api")
include(":database-bukkit")
include(":database-proxy")

project(":database-api").projectDir = File("database/database-api")
project(":database-bukkit").projectDir = File("database/database-bukkit")
project(":database-proxy").projectDir = File("database/database-proxy")

// main modules
include(":basic-bukkit")
include(":basic-proxy")

project(":basic-bukkit").projectDir = File("cores/basic-bukkit")
project(":basic-proxy").projectDir = File("cores/basic-proxy")

// basic paper modules
include(":basic-build")
include(":basic-game")
include(":basic-lobby")
include(":basic-lounge")
include(":basic-loungebridge")

project(":basic-build").projectDir = File("cores/basic-build")
project(":basic-game").projectDir = File("cores/basic-game")
project(":basic-lobby").projectDir = File("cores/basic-lobby")
project(":basic-lounge").projectDir = File("cores/basic-lounge")
project(":basic-loungebridge").projectDir = File("cores/basic-loungebridge")

// paper extensions
include(":extension-anticheat")
include(":extension-bukkit")
include(":extension-decoration")
include(":extension-event")
include(":extension-special")
include(":extension-warp")

project(":extension-anticheat").projectDir = File("extensions-mc/extension-anticheat")
project(":extension-bukkit").projectDir = File("extensions-mc/extension-bukkit")
project(":extension-decoration").projectDir = File("extensions-mc/extension-decoration")
project(":extension-event").projectDir = File("extensions-mc/extension-event")
project(":extension-special").projectDir = File("extensions-mc/extension-special")
project(":extension-warp").projectDir = File("extensions-mc/extension-warp")

// proxy extensions
include(":extension-discord")
include(":extension-proxy")
include(":extension-telegram")
include(":extension-web")

project(":extension-discord").projectDir = File("extensions-proxy/extension-discord")
project(":extension-proxy").projectDir = File("extensions-proxy/extension-proxy")
project(":extension-telegram").projectDir = File("extensions-proxy/extension-telegram")
project(":extension-web").projectDir = File("extensions-proxy/extension-web")

// paper games
include(":game-bedwars")
include(":game-bowrun")
include(":game-bridgebuilders")
include(":game-endgame")
include(":game-graffiti")
include(":game-microgames")
include(":game-mobdefence")
include(":game-push")
include(":game-riseup")
include(":game-story")
include(":game-survival")
include(":game-survivalgames")
include(":game-traitorinwolfed")
include(":game-trapduel")
include(":game-treasureislands")

project(":game-bedwars").projectDir = File("games/game-bedwars")
project(":game-bowrun").projectDir = File("games/game-bowrun")
project(":game-bridgebuilders").projectDir = File("games/game-bridgebuilders")
project(":game-endgame").projectDir = File("games/game-endgame")
project(":game-graffiti").projectDir = File("games/game-graffiti")
project(":game-microgames").projectDir = File("games/game-microgames")
project(":game-mobdefence").projectDir = File("games/game-mobdefence")
project(":game-push").projectDir = File("games/game-push")
project(":game-riseup").projectDir = File("games/game-riseup")
project(":game-story").projectDir = File("games/game-story")
project(":game-survival").projectDir = File("games/game-survival")
project(":game-survivalgames").projectDir = File("games/game-survivalgames")
project(":game-traitorinwolfed").projectDir = File("games/game-traitorinwolfed")
project(":game-trapduel").projectDir = File("games/game-trapduel")
project(":game-treasureislands").projectDir = File("games/game-treasureislands")