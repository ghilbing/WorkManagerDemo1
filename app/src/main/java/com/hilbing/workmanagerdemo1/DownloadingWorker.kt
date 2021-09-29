package com.hilbing.workmanagerdemo1

import android.content.Context
import android.util.Log
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class DownloadingWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    override fun doWork(): ListenableWorker.Result {
        try {
            for(i: Int  in 0 .. 300){
                Log.i("MyTAG", "Downloading $i")
            }
            val time = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
            val currentDate = time.format(Date())
            Log.i("MYTAG", "Completed $currentDate")
            return ListenableWorker.Result.success()
        } catch (e: Exception){
            return ListenableWorker.Result.failure()
        }
    }
}