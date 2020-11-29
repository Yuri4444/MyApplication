package com.webanimal.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.webanimal.myapplication.R

class FragmentMoviesList : Fragment() {
    lateinit var cardAvengers: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_movies_list, container, false)

        cardAvengers = root.findViewById(R.id.cardAvengers)

        cardAvengers.setOnClickListener {

            fragmentManager?.beginTransaction()?.replace(R.id.mainFrameForFragments, FragmentMoviesDetails())?.addToBackStack(null)?.commit()

        }


        return root


    }

}