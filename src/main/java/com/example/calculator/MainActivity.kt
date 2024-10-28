package com.example.calculator
import android.annotation.SuppressLint
import android.os.Bundle
//import android.os.strictmode.CleartextNetworkViolation
//import android.widget.Button
//import android.widget.Switch
//import android.health.connect.datatypes.units.Length
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
//import org.mozilla.javascript.Scriptable
//import org.mozilla.javascript.Context
//import org.mozilla.javascript.Script
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
//import kotlinx.coroutines.scheduling.DefaultIoScheduler.default

class MainActivity : AppCompatActivity() {
    private lateinit var solution: TextView
    private lateinit var result: TextView
    private lateinit var button1: MaterialButton
    private lateinit var button2: MaterialButton
    private lateinit var button3: MaterialButton
    private lateinit var button4: MaterialButton
    private lateinit var button5: MaterialButton
    private lateinit var button6: MaterialButton
    private lateinit var button7: MaterialButton
    private lateinit var button8: MaterialButton
    private lateinit var button9: MaterialButton
    private lateinit var button0: MaterialButton
    private lateinit var sum: MaterialButton
    private lateinit var subtract: MaterialButton
    private lateinit var multiply: MaterialButton
    private lateinit var divide: MaterialButton
    private lateinit var equal: MaterialButton
    private lateinit var openbracket: MaterialButton
    private lateinit var closebracket: MaterialButton
    private lateinit var allclear: MaterialButton
    private lateinit var clear: MaterialButton
    private lateinit var point: MaterialButton
    private fun onclick(button: MaterialButton) {

        val buttonText: String = button.text.toString()
        solution.append(buttonText)


    }


   @SuppressLint("SetTextI18n")
   private fun getResult() {
     try {

       val exp=solution.text.toString()
       val engine: ScriptEngine =ScriptEngineManager().getEngineByName("rhino")
       val res:String= engine.eval(exp).toString()
       result.text= res
       solution.text=" "}
     catch(e :Exception){
           result.text="error"
       }

   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableEdgeToEdge()
        //var exp: String = solution.text.toString()
        solution = findViewById(R.id.solution)
        result = findViewById(R.id.result)
        button1 = findViewById(R.id.one)
        button2 = findViewById(R.id.two)
        button3 = findViewById(R.id.three)
        button4 = findViewById(R.id.four)
        button5 = findViewById(R.id.five)
        button6 = findViewById(R.id.six)
        button7 = findViewById(R.id.seven)
        button8 = findViewById(R.id.eight)
        button9 = findViewById(R.id.nine)
        button0 = findViewById(R.id.zero)
        sum = findViewById(R.id.sum)
        subtract = findViewById(R.id.minus)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        equal = findViewById(R.id.equal)
        openbracket = findViewById(R.id.openbracket)
        closebracket = findViewById(R.id.closebracket)
        allclear = findViewById(R.id.AC)
        clear = findViewById(R.id.c)
        point=findViewById(R.id.point)

        button1.setOnClickListener {
            onclick(button1)
        }
        button2.setOnClickListener {
            onclick(button2)
        }
        button3.setOnClickListener {
            onclick(button3)
        }
        button4.setOnClickListener {
            onclick(button4)
        }
        button5.setOnClickListener {
            onclick(button5)
        }
        button6.setOnClickListener {
            onclick(button6)
        }
        button7.setOnClickListener {
            onclick(button7)
        }
        button8.setOnClickListener {
            onclick(button8)
        }
        button9.setOnClickListener {
            onclick(button9)
        }
        button0.setOnClickListener {
            onclick(button0)
        }
        point.setOnClickListener {
            onclick(point)
        }

        sum.setOnClickListener {
            onclick(sum)
        }
        subtract.setOnClickListener {
            onclick(subtract)
        }
        multiply.setOnClickListener {
            onclick(multiply)
        }
        divide.setOnClickListener {
            onclick(divide)
        }
        openbracket.setOnClickListener {
            onclick(openbracket)
        }
        closebracket.setOnClickListener {
            onclick(closebracket)
        }
        allclear.setOnClickListener {
            result.text="0"
            solution.text=" "
        }
        /**clear.setOnClickListener {
            var exp:String=solution.text.toString()
            var l= Length(exp)
           // solution.text= solution.text.toString()[0:l-1].toString()

        }**/
        equal.setOnClickListener {
           getResult()
        }


    }
}
