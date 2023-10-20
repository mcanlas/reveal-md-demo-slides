#!/usr/bin/env scala-cli shebang

val themes = Seq("beige", "black", "black-contrast", "blood", "dracula", "league", "moon", "night", "serif", "simple", "sky", "solarized", "white", "white-contrast")

for (t <- themes) {
  println(s"reveal-md --theme $t DEMO.md --print $t.pdf")
}
