package ru.skillbranch.devintensive.utils

import android.service.voice.AlwaysOnHotwordDetector

object Utils {
    fun parsFullName(fullName:String?) : Pair<String?, String?>{
        val parts:List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
//        return Pair(firstName, lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " ") : String{
        val parts:List<String?> = payload?.split(divider)
        val first = parts?.getOrNull(0)
        val last = parts?.getOrNull(1)
        val nick = "${kirToLat(first)}_${kirToLat(last)}"
        return nick
    }

    fun kirToLat(str:String?) : String{
        val kirillian = arrayOf('а','б','в','г','д','е','ё','ж','з',
            'и','й','к', 'л','м','н','о','п','р','с','т',
            'у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я')
        val latinas = arrayOf("a","b","v","g","d","e","e","zh","z",
            "i","i","k","l","m","n","o","p","r","s","t",
            "u","f","h","c","ch","sh","sh","","i","","e","yu","ya")
        var result = ""
        if (str == null) return result
        else {
            val st = str.toLowerCase().trim()
            val s = st.toCharArray()

            for (i in 0 until s.size) {
                var flag = false
                for (j in 0..32) {
                    if (s[i] == kirillian[j]){
                        result = "$result${latinas[j]}"
                        flag = true
                    }
                }
                if (!flag) result = "$result${s[i]}"
            }
        }
        return result.capitalize()
    }

    fun toInitials(fn:String?, ln:String?) : String{
        return "${getFirstLetter(fn)}${getFirstLetter(ln)}"
    }

    fun getFirstLetter(st:String?) : String{
        if (st == null || st == "") return ""
        else {
            val s = st.toUpperCase().trim().toCharArray()
            return "${s[0]}"

//            if (s[0] in 'А'..'Я' && s[0] in 'A'..'Z') return "${s[0]}"
//            else return ""
        }
    }

    fun githabValid(){
        val isklArr = arrayListOf<String>(
            "enterprise",
            "features",
            "topics",
            "collections",
            "trending",
            "events",
            "marketplace",
            "pricing",
            "nonprofit",
            "customer-stories",
            "security",
            "login",
            "join"
        )
    }
}