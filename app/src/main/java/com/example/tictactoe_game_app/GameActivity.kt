package com.example.tictactoe_game_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_game.button2
import kotlinx.android.synthetic.main.activity_game.view.*
import kotlinx.android.synthetic.main.activity_main.*

class GameActivity : AppCompatActivity() {
    var count:Int=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        setFullUi(false)
        playButton.setOnClickListener {
            playerStatus.text="Player 1"
            setFullUi(true)
            button1.text=""
            button2.text=""
            button3.text=""
            button4.text=""
            button5.text=""
            button6.text=""
            button7.text=""
            button8.text=""
            button9.text=""

        }
        button1.setOnClickListener{
            button1.isEnabled=false
            showInUi(count,button1)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button2.setOnClickListener{
            button2.isEnabled=false
            showInUi(count,button2)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button3.setOnClickListener{
            button3.isEnabled=false
            showInUi(count,button3)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button4.setOnClickListener{
            button4.isEnabled=false
            showInUi(count,button4)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button5.setOnClickListener{
            button5.isEnabled=false
            showInUi(count,button5)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button6.setOnClickListener{
            button6.isEnabled=false
            showInUi(count,button6)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button7.setOnClickListener{
            button7.isEnabled=false
            showInUi(count,button7)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button8.setOnClickListener{
            button8.isEnabled=false
            showInUi(count,button8)
            if (checkGame()){
                showResult()
            }
            count++
        }
        button9.setOnClickListener{
            button9.isEnabled=false
            showInUi(count,button9)
            if (checkGame()){
                showResult()
            }
            count++
        }

    }

    private fun setFullUi(value:Boolean) {
        button1.isEnabled=value
        button2.isEnabled=value
        button3.isEnabled=value
        button4.isEnabled=value
        button5.isEnabled=value
        button6.isEnabled=value
        button7.isEnabled=value
        button8.isEnabled=value
        button9.isEnabled=value
    }

    private fun showResult() {
        setFullUi(false)
        if (count%2==0){
            val sandbar=Snackbar.make(coordinatorLayout,"Match Win Player 1",Snackbar.LENGTH_LONG)
            sandbar.duration=2000 //melee second
            sandbar.anchorView=coordinatorLayout
            sandbar.animationMode= BaseTransientBottomBar.ANIMATION_MODE_SLIDE
            sandbar.setAction("Dismiss"){
                sandbar.dismiss()
            }
            sandbar.setActionTextColor(Color.RED)
            sandbar.setTextColor(Color.WHITE)
            sandbar.setBackgroundTint(Color.CYAN)
            sandbar.show()
        }
        else{
            val sandbar=Snackbar.make(coordinatorLayout,"Match Win Player 2",Snackbar.LENGTH_LONG)
            sandbar.duration=2000 //melee second
            sandbar.anchorView=coordinatorLayout
            sandbar.animationMode= BaseTransientBottomBar.ANIMATION_MODE_SLIDE
            sandbar.setAction("Dismiss"){
                sandbar.dismiss()
            }
            sandbar.setActionTextColor(Color.RED)
            sandbar.setTextColor(Color.WHITE)
            sandbar.setBackgroundTint(Color.CYAN)
            sandbar.show()
        }

    }

    private fun checkGame() :Boolean{
        if(button1.text.isNotEmpty()){
            if (button1.text==button2.text && button1.text==button3.text){
                return true
            }
        }
        if(button4.text.isNotEmpty()){
            if (button4.text==button5.text && button4.text==button6.text){
                return true
            }
        }
        if(button7.text.isNotEmpty()){
            if (button7.text==button8.text && button7.text==button9.text){
                return true
            }
        }

        if(button1.text.isNotEmpty()){
            if (button1.text==button4.text && button1.text==button7.text){
                return true
            }
        }
        if(button2.text.isNotEmpty()){
            if (button2.text==button5.text && button2.text==button8.text){
                return true
            }
        }
        if(button3.text.isNotEmpty()){
            if (button3.text==button6.text && button3.text==button9.text){
                return true
            }
        }


        if(button1.text.isNotEmpty()){
            if (button1.text==button5.text && button1.text==button9.text){
                return true
            }
        }
        if(button3.text.isNotEmpty()){
            if (button3.text==button5.text && button3.text==button9.text){
                return true
            }
        }
        return false
    }

    private fun showInUi(count: Int, button: TextView?) {

        if (count%2==0){
            if (button != null) {
                button.text="O"
                playerStatus.text="Player 1"
                return
            }
        }
        else{
            if (button != null) {
                button.text="X"
                playerStatus.text="Player 2"
            }
        }
    }
}