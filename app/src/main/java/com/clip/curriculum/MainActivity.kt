package com.clip.curriculum

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_fullname.text = "BOUILLON Maxime"
        tv_mail.text = "maxime-bouillon@outlook.com"
        tv_phone.text = "06 --- Phone number"
        tv_title.text = "Mobile Developper"
        tv_website.text = "https://github.com/m-bouillon/"
        tv_location.text = "Aix-en-Provence - Perpignan / France"

        var list1 : ArrayList<Item> = ArrayList()
        list1.add(Item("Skills - IHM / HMI", "- C++ / Qt \n- Java - Kotlin / Android \n- Swift / iOS \n- C# / .NET / WPF \n- WinDev / WebDev / WinDev Mobile"))
        list1.add(Item("Skills - Web Services", "- Python / Flask \n- C# \n- Swift / Kitura.io"))
        list1.add(Item("Skills - Project Management", "- Functional specifications \n- Risk analysis \n- Scrum method \n- Technical documentation"))
        list1.add(Item("Education", "IMERIR - Manager in digital systems - 2020\n\n    - Robotics \n    - Digital Systems \n    - Management \n    - IoT \n\nIMERIR - Developer of mobile solutions - 2017 \n\n    - iOS \n    - Android\n    - WebServices"))

        var list2 : ArrayList<Item> = ArrayList()
        list2.add(Item("Work Experience - Apprenticeship","Junior Mobile Developper - Since 09/2016 \nCLIP INDUSTRIE\n\n    - Maintainer of a Mobile Application in C++/Qt \n    - Unit Tests \n    - Web Services \n    - Windev Projects"))
        list2.add(Item("Work Experience - Traineeship","Summer 2015\nHEXA PLUS SANTE \n\n    - IT Assistant \n    - HTML/PHP Project \n    - IT Tasks"))
        list2.add(Item("Work Experience - Student Jobs","From 2014 to 2016 \n\n    - Mc Donalds - Versatile Employee \n    - Metro Cash & Carry - Billing Employee"))
        list2.add(Item("Languages","- French - Mother Tongue \n- English B1/2 \n- Spanish A1/2"))
        list2.add(Item("Other Skills","- GNU Linux User\n- Material Design \n- Infographics \n- Rock Climber \n- Musician"))

        rv_list_left.layoutManager = LinearLayoutManager(this)
        rv_list_left.hasFixedSize()
        rv_list_right.layoutManager = LinearLayoutManager(this)
        rv_list_right.hasFixedSize()

        rv_list_left.adapter = ItemAdapter(this,list1)
        rv_list_right.adapter = ItemAdapter(this,list2)

    }
}
