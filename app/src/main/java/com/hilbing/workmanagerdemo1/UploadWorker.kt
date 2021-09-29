package com.hilbing.workmanagerdemo1

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class UploadWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    companion object{
        const val KEY_WORKER = "key_worker"
    }

    override fun doWork(): Result {
        try {
            val count: Int = inputData.getInt(MainActivity.KEY_COUNT_VALUE,0)
            for(i: Int  in 0 until count){
                Log.i("MyTAG", "Uploading $i")
            }
            val time = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val currentDate = time.format(Date())
            val outputData = Data.Builder()
                .putString(KEY_WORKER,currentDate)
                .build()
            return Result.success(outputData)
        } catch (e: Exception){
            return Result.failure()
        }
    }
}