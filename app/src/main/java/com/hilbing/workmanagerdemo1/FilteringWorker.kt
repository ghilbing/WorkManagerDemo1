package com.hilbing.workmanagerdemo1

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class FilteringWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): ListenableWorker.Result {
        try {
            for(i: Int  in 0 .. 3000){
                Log.i("MyTAG", "Filtering $i")
            }
            return ListenableWorker.Result.success()
        } catch (e: Exception){
            return ListenableWorker.Result.failure()
        }
    }
}