package com.example.quiz_assignment

object  Constants {

    fun getQuestions():ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What is the name of this world-known tourist destination in Italy?",
            R.drawable.img_2,
            "Ponte Vecchio","Leaning Tower of Pisa",
            "Milan Cathedral","Seychelles", 2

        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What is the name of this sport?",
            R.drawable.img_3,
            "Cricket","Corkball",
            "New Kickball","Baseball", 1

        )
        questionsList.add(que2)

        val que3 = Question(
            3,"From which country did this musical instrument originally come from?",
            R.drawable.img_4,
            "Germany","Spain",
            "Armenia","France", 2

        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What is the meaning of this symbol, which was designed in the 1950s?",
            R.drawable.img_5,
            "Christianity","Peace",
            "Communism","Harmony", 2

        )
        questionsList.add(que4)

        val que5 = Question(
            5,"This statue is the award for which prestigious and famous event?",
            R.drawable.img_6,
            "The Grammy Award","The Pulitzer Prize",
            "The Academy Awards, also known as the Oscars","The Nobel Prize", 3

        )
        questionsList.add(que5)

        val que6 = Question(
            6,"In which city is this distinctive and famous building located?",
            R.drawable.img_7,
            "Sydney, Australia","Auckland, New Zealand",
            "Bali, Indonesia","New Delhi, India", 1

        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What is the name of this gemstone?",
            R.drawable.img_8,
            "Ruby","Sapphire",
            "Emerald","Diamond", 2

        )
        questionsList.add(que7)

        val que8 = Question(
            8,"This is the flag of which Scandinavian country?",
            R.drawable.img,
            "Sweden","Norway",
            "Denmark","Australia", 3

        )
        questionsList.add(que8)

        val que9 = Question(
            9,"This picture was taken during which historical period?",
            R.drawable.img_1,
            "The World War I","The Great Depression",
            "The World War I","The French Revolution", 2

        )
        questionsList.add(que9)

        return questionsList
    }
}