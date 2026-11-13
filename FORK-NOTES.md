# Local fork notes

- Base source: official PaperMC Folia branch `ver/26.3.x`.
- This branch targets Minecraft 26.3 and is an experimental/alpha line.
- Keep the in-game server brand `AC03` on every update; do not increment it between builds.
- `mcVersion=26.3`, `apiVersion=26.3`, and `bukkitVersion=26.3.0-R0.1-SNAPSHOT` describe the actual 26.3 base.
- The Windows launcher exposes all 28 logical processors and selects a heap cap from currently free RAM, up to 28 GiB, while retaining at least 3 GiB for Windows and JVM native memory.
- `ops/config/paper-global-fragment.yml` is an override fragment; merge it into the generated config rather than replacing the full file.
- The GT 730 cannot accelerate normal server ticking or chunk logic. Minecraft's dedicated server has no rendering workload to send to the GPU.
- Keep the previous 26.2 source tree and server folder intact until the 26.3 Paperclip JAR and a copy of the world have been checked.
