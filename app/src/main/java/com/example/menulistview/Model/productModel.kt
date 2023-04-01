package com.example.menulistview.Model

public class Dish( name:String,recipe: String,time:Int){

    private    var name: String? = null
    private    var recipe: String? = null
    private    var time: Int? = null

    val dishes = arrayOf<Dish>(
        Dish("Hamburger", "Rozgrzej grill lub patelnię grillową na średnim ogniu\n" +
                "Przypraw kotleta wołowego solą i pieprzem z obu stron\n" +
                "Umieść kotleta na grillu i smaż przez 3-4 minuty z każdej strony lub aż uzyska pożądany stopień wypieku.\n" +
                "W ostatniej minucie smażenia dodaj plaster sera cheddar na wierzch kotleta, aby się rozpuścił.\n" +
                "Opiecz bułkę do hamburgera na grillu przez 1-2 minuty.\n" +
                "Na wierzchu i na spodzie bułki rozsmaruj ketchup i musztardę.\n" +
                "Połóż na spodzie bułki liście sałaty, plastry pomidora i cebuli.\n"+
                "Na warzywach umieść kotleta wołowego z rozpuszczonym serem na wierzchu.\n"+
                "Przykryj burger drugą połową bułki.\n",14),
        Dish("Spaghetti", "Gotuj makaron zgodnie z instrukcją na opakowaniu.\n" +
                "Na patelni rozgrzej oliwę i podsmaż czosnek przez około 1 minutę.\n" +
                "Dodaj mięso mielone i smaż, aż się zrumieni i będzie dobrze ugotowane.\n" +
                "Dodaj pomidory i pieczarki, a następnie przypraw solą, pieprzem i oregano.\n" +
                "Gotuj na wolnym ogniu przez około 10-15 minut.\n" +
                "Wymieszaj sos z makaronem i podawaj gorące.\n", 20)
    )
    fun getRecipe(): String? {
        return recipe
    }

    fun getName(): String? {
        return name
    }

    override fun toString(): String {
        return this.name ?: ""
    }

}