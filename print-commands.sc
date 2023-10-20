#!/usr/bin/env scala-cli shebang

val themes = Seq("beige", "black", "blood", "league", "moon", "night", "serif", "simple", "sky", "solarized", "white")

for (t <- themes) {
  println(s"reveal-md --theme $t DEMO.md --print $t.pdf")
}
