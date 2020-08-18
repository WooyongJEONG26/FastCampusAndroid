package org.techtown.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne:Fragment(){
    override fun onAttach(context: Context?) {
        Log.d("life_cycle"," just onAttach" )

        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle"," just onCreate" )

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Fragment 가 interface 를 처음으로 그릴 때 호출 된
        Log.d("life_cycle"," just onCreateView" )
        return inflater.inflate(R.layout.fragment_one,container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle"," just onViewCreated" )

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle"," just onActivityCreated" )

        val data = arguments?.getString("Hello")
        Log.d("data",data)

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle"," just onStart" )
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle"," just created" )
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle"," just onPause" )
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle"," just onStop" )
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("life_cycle"," just onDestroy" )
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("life_cycle"," just onDetach" )
        super.onDetach()
    }

}