# Local fork notes

- Source provided by the user: Folia-ver-26.2.x (2).zip.
- Upstream project and branch: https://github.com/PaperMC/Folia/tree/ver/26.2.x
- This archive does not include .git history. The workspace is a local source snapshot, not a GitHub fork and not a clone with upstream history.
- mcVersion=26.2 and apiVersion=26.2 are intentionally unchanged. forkVersion=26.3.0 labels this custom build and does not claim Minecraft 26.3 support.
- Bukkit.getBukkitVersion() uses bukkitVersion=26.2.0-R0.1-SNAPSHOT for compatibility with plugins that parse Bukkit's traditional version format. The current in-game kernel brand is AC04; increment the AC number by one whenever producing a changed Paperclip kernel. The actual Minecraft/API base remains 26.2.
- The Paper upstream ref in gradle.properties comes from the supplied Folia source archive.
- The customized performance profile and Windows launcher live in ops/; the Gradle plugin project lives in plugin-template/.
