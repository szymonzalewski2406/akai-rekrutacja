public class Main {
    private static String[] sentences = {
            "Taki mamy klimat",
            "Wszedzie dobrze ale w domu najlepiej",
            "Wyskoczyl jak Filip z konopii",
            "Gdzie kucharek szesc tam nie ma co jesc",
            "Nie ma to jak w domu",
            "Konduktorze laskawy zabierz nas do Warszawy",
            "Jezeli nie zjesz obiadu to nie dostaniesz deseru",
            "Bez pracy nie ma kolaczy",
            "Kto sieje wiatr ten zbiera burze",
            "Być szybkim jak wiatr",
            "Kopac pod kimś dolki",
            "Gdzie raki zimuja",
            "Gdzie pieprz rosnie",
            "Swoja droga to gdzie rosnie pieprz?",
            "Mam nadzieje, ze poradzisz sobie z tym zadaniem bez problemu",
            "Nie powinno sprawic zadnego problemu, bo Google jest dozwolony"
    };
    public static void main(String[] args) {
        Count count = new Count();
        count.wordFinder(sentences);
    }
}