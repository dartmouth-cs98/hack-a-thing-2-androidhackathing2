package edu.dartmouth.dali.dalilab.People

import android.content.Context
import android.content.Intent
import android.os.Bundle
import edu.dartmouth.dali.dalilab.ActionBarActivity
import edu.dartmouth.dali.dalilab.R

class PeopleActivity : ActionBarActivity() {
    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, PeopleActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people)
    }
}
