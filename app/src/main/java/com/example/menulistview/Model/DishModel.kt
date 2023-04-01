package com.example.menulistview.Model



 class Dish{

     var name: String? = ""
     var recipe: String? = ""

    constructor(name: String, recipe: String) {
        this.name = name
        this.recipe = recipe
    }

     override fun toString(): String {
         return "Dish(name=$name, recipe=$recipe)"
     }


     companion object {
         fun generateData(): ArrayList<Dish> {

                 var result = ArrayList<Dish>()
                 result.add(Dish("Hamburger", "Rozgrzej grill lub patelnię grillową na średnim ogniu\n" +
                         "Przypraw kotleta wołowego solą i pieprzem z obu stron\n" +
                         "Umieść kotleta na grillu i smaż przez 3-4 minuty z każdej strony lub aż uzyska pożądany stopień wypieku.\n" +
                         "W ostatniej minucie smażenia dodaj plaster sera cheddar na wierzch kotleta, aby się rozpuścił.\n" +
                         "Opiecz bułkę do hamburgera na grillu przez 1-2 minuty.\n" +
                         "Na wierzchu i na spodzie bułki rozsmaruj ketchup i musztardę.\n" +
                         "Połóż na spodzie bułki liście sałaty, plastry pomidora i cebuli.\n"+
                         "Na warzywach umieść kotleta wołowego z rozpuszczonym serem na wierzchu.\n"+
                         "Przykryj burger drugą połową bułki.\n"))
                 result.add( Dish("Spaghetti", "Gotuj makaron zgodnie z instrukcją na opakowaniu.\n" +
                         "Na patelni rozgrzej oliwę i podsmaż czosnek przez około 1 minutę.\n" +
                         "Dodaj mięso mielone i smaż, aż się zrumieni i będzie dobrze ugotowane.\n" +
                         "Dodaj pomidory i pieczarki, a następnie przypraw solą, pieprzem i oregano.\n" +
                         "Gotuj na wolnym ogniu przez około 10-15 minut.\n" +
                         "Wymieszaj sos z makaronem i podawaj gorące.\n"))
             result.add(Dish("Tacos", "Rozgrzej patelnię na średnim ogniu.\n" +
                     "Dodaj do niej mięso mielone i smaż aż się zrumieni.\n" +
                     "Dodaj posiekaną cebulę i paprykę oraz przyprawy: chili, paprykę w proszku, czosnek i sól.\n" +
                     "Smaż mieszając przez około 5 minut, aż warzywa zmiękną.\n" +
                     "Podgrzej tortille według instrukcji na opakowaniu.\n" +
                     "Rozłóż mięso na tortilli, a następnie dodaj ulubione dodatki, np. pomidory, ogórki, guacamole, ser.\n" +
                     "Zwiń tortillę i podawaj.\n"))
             result.add(Dish("Chicken Caesar Salad", "Rozgrzej piekarnik do 200 stopni C.\n" +
                     "Rozłóż kawałki kurczaka na blasze do pieczenia i posyp solą, pieprzem i oregano.\n" +
                     "Piec kurczaka przez około 20-25 minut, aż będzie dobrze ugotowany.\n" +
                     "W międzyczasie umyj sałatę i posiekaj ją na mniejsze kawałki.\n" +
                     "Przygotuj sos: wymieszaj oliwę, sok z cytryny, musztardę, czosnek, anchois, sól i pieprz.\n" +
                     "Wymieszaj sałatę z sosem i dodaj starty ser parmezan.\n" +
                     "Podziel sałatę na talerze, a następnie dodaj pokrojonego kurczaka i grzanki.\n"))

                 return result

         }
     }


 }