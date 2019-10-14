rootProject.name = "Calculator"

if (File("composite-enable").exists()) {
    includeBuild("../MathUtil")
}